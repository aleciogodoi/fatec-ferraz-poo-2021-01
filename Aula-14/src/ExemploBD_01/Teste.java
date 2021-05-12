package ExemploBD_01;

import java.sql.Connection;

public class Teste {
	public static void main(String[] args) {

		// Abrindo a conexão
		Conexao conexao = new Conexao();
		Connection conn;
		conn = conexao.conectar();
		
		// Fechando a conexão
		conexao.fechar(conn);
	}
}
