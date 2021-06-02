

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Connection conectar() {
		try {
			
			Connection conn;  // Cria um objeto do tipo connection
			Class.forName("org.sqlite.JDBC");  // Procura um driver de conexão
			System.out.println("Driver encontrado!!!"); 
			String pathBD = System.getProperty("user.dir");
			pathBD = pathBD.replace("\\", "/");
			System.out.println(pathBD);
			
			String bdURL = "jdbc:sqlite:"+pathBD+"/bd/ALPOO.db";   // URL do Banco de Dados
			conn = DriverManager.getConnection(bdURL); // Conectar com um BD
			
			/*
			Connection conn; //Cria um objeto do tipo connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			String bdURL = "jdbc:mysql://localhost:3306/alpoo?useTimezone=true&serverTimezone=UTC";
			String bdUsuario = "ale";
			String bdSenha = "ale";
			conn = DriverManager.getConnection(bdURL, bdUsuario, bdSenha);
			*/
			System.out.println("Conexao realizada com sucesso! Nome da Conexao: " + conn);
			return conn;
			
		} catch (ClassNotFoundException ex) {
			System.out.println("Problemas na fonte de dados - driver não encontrado!!! "+ex);
			System.exit(0);
			return null;
		} catch (SQLException ex) {
			System.out.println("Problemas na fonte de dados - conexão não realizada!!! " + ex);
			System.exit(0);
			return null;
		}

	}
	
	public void fechar(Connection conn) {
		try {
			conn.close();
			System.out.println("Conexao "+ conn + "  fechada com sucesso.");
		} catch (SQLException ex) {
			System.out.println("Problemas na fonte de dados - fechar conexão!!!"+ ex);
		}
	}
}
