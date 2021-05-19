package ExemploBD_01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
		ArrayList<Empregado> empregados = new ArrayList<Empregado>();
		Connection conn;
		Conexao conexao = new Conexao();
		conn = conexao.conectar();
		String sql = "Select * From empregado";
		
		try {
			Statement comandoSQL = conn.createStatement();
			ResultSet rsDados = comandoSQL.executeQuery(sql);
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
