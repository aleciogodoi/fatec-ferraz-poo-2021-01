package ExemploBD_01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {
	public static void main(String[] args) {

		// Abrindo a conex�o
		Conexao conexao = new Conexao();
		Connection conn;
		conn = conexao.conectar();
		
		// String como comando SQL
		String sql = "Select * From Empregado";
		System.out.println(sql);
		
		try {
			// Cria��o de objeto para execu��o dos comandos SQL
			Statement comandoSQL = conn.createStatement();
			ResultSet rs = comandoSQL.executeQuery(sql);   // Execu��o do SQL 
			while (rs.next()) {
				System.out.print(rs.getString("idEmpregado")+"\t");
				System.out.print(rs.getString("NomeEmpregado")+"\t\t");
				System.out.print(rs.getString("Cargo")+"\t\t");
				System.out.println(rs.getString("Salario"));
			}

		} catch (SQLException e) {
			System.out.println("Erro de execu��o comando\n"+e);
		}
		
		// Fechando a conex�o
		conexao.fechar(conn);
	}
}
