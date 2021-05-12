package ExemploBD_01;

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
			System.out.println("Conexao realizada com sucesso! Nome da Conexao: " + conn);
			return conn;
			
		} catch (ClassNotFoundException ex) {
			System.out.println("Problemas na fonte de dados - driver não encontrado!!!");
			System.exit(0);
			return null;
		} catch (SQLException ex) {
			System.out.println("Problemas na fonte de dados - conexão não realizada!!!");
			System.exit(0);
			return null;
		}

	}
}
