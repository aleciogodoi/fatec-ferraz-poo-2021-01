package ExemploBD_01;

import java.sql.Connection;

public class Teste {
	public static void main(String[] args) {

		// Abrindo a conex�o
		Conexao conexao = new Conexao();
		Connection conn;
		conn = conexao.conectar();
		
		// Fechando a conex�o
		conexao.fechar(conn);
	}
}
