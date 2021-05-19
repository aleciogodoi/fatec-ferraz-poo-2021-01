package ExemploBD_01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {
	public static void main(String[] args) {

		// Abrindo a conexão
		Conexao conexao = new Conexao();
		Connection conn;
		conn = conexao.conectar();
		
		// String como comando SQL
		String sql = "Select * From Empregado";
		System.out.println(sql);
		
		try {
			// Criação de objeto para execução dos comandos SQL
			Statement comandoSQL = conn.createStatement();
			ResultSet rs = comandoSQL.executeQuery(sql);   // Execução do SQL 
			while (rs.next()) {
				System.out.print(rs.getString("idEmpregado")+"\t");
				System.out.print(rs.getString("NomeEmpregado")+"\t\t");
				System.out.print(rs.getString("Cargo")+"\t\t");
				System.out.println(rs.getString("Salario"));
			}

		} catch (SQLException e) {
			System.out.println("Erro de execução comando\n"+e);
		}
		
		//Select * From Departamento;
		sql = "Select * From Departamento";
		System.out.println(sql);
		try {
			Statement comandoSQL = conn.createStatement();
			ResultSet rs = comandoSQL.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString("idDepto")+"\t");
				System.out.print(rs.getString("NomeDepto")+"\t\t");
				System.out.print(rs.getString("Gerente")+"\t\t");
				System.out.print(rs.getString("Divisao")+"\t\t");
				System.out.println(rs.getString("Local")+"\t\t");
			}
		} catch (SQLException ex) {
			
		}
		
		// Fechando a conexão
		conexao.fechar(conn);
	}
}
