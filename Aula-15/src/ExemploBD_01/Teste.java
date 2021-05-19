package ExemploBD_01;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Departamento> departamentos = carregaDeptos();
		System.out.println("Total de Departamentos: "+departamentos.size());
		
		for (Departamento depto: departamentos) {
			System.out.println(depto);
		}
	}
	
	public static ArrayList<Departamento> carregaDeptos() {
		ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
		Connection conn;
		Conexao conexao = new Conexao();
		conn = conexao.conectar();
		String sql = "Select * From departamento";
		
		try {
			Statement comandoSQL = conn.createStatement();
			ResultSet rsDados = comandoSQL.executeQuery(sql);
			while (rsDados.next()) {
				Departamento depto = new Departamento();
				depto.setIdDepto(rsDados.getInt("IdDepto"));
				depto.setNomeDepto(rsDados.getString("NomeDepto"));
				depto.setGerente(rsDados.getInt("Gerente"));
				depto.setDivisao(rsDados.getString("Divisao"));
				depto.setLocal(rsDados.getString("Local"));
				departamentos.add(depto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		conexao.fechar(conn);
		return departamentos;
	}
}
