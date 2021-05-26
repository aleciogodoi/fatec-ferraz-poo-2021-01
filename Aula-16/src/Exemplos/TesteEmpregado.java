package Exemplos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class TesteEmpregado {
	public static void main(String [] args) {
		ArrayList<Empregado> empregados = carregaEmpregados();
		System.out.println("Total de Empregados: "+empregados.size());
		System.out.println("Total de Salários: "+totalSalarios(empregados));
		for (Empregado empr: empregados) {
			System.out.println(empr);
		}
	}
	
	public static ArrayList<Empregado> carregaEmpregados(){
		int idDepto = Integer.valueOf(JOptionPane.showInputDialog("Digite o código do Departamento"));
		ArrayList<Empregado> empregados = new ArrayList<Empregado>();
		Connection conn;
		Conexao conexao = new Conexao();
		conn = conexao.conectar();
		String sql = "Select * From empregado Where IdDepto = ?";
		
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setInt(1, idDepto);
			ResultSet rsDados = comandoSQL.executeQuery();
			while (rsDados.next()) {
				Empregado empregado = new Empregado();
				empregado.setIdEmpregado(rsDados.getInt("IdEmpregado"));
				empregado.setNomeEmpregado(rsDados.getString("NomeEmpregado"));
				empregado.setIdDepto(rsDados.getInt("IdDepto"));
				empregado.setCargo(rsDados.getString("Cargo"));
				empregado.setTempo_emp(rsDados.getInt("Tempo_Emp"));
				empregado.setSalario(rsDados.getFloat("Salario"));
				empregado.setComissao(rsDados.getFloat("Comissao"));
				empregados.add(empregado);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		conexao.fechar(conn);
		return empregados;
	}
	
	public static float totalSalarios(ArrayList<Empregado> empregados) {
		float total=0;
		for (Empregado empr: empregados) 
			total += empr.getSalario();
		return total;
	}
}
