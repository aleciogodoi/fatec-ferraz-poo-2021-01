package ExemploDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Exemplos.Conexao;

public class UsuarioDAO {
	private static Connection conn;
	private static Conexao conexao; 

	public static void insert(Usuario usuario) {
	}

	public static void update(Usuario usario) {
	}

	public static void delete(int idUsuario) {
	}

	public static Usuario find(int idUsuario) {
		Usuario usuario = new Usuario();
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql = "Select * From Usuario Where idUsuario = ?";

		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setInt(1, idUsuario);
			ResultSet rsDados = comandoSQL.executeQuery();
			if (rsDados.next()) {
				usuario.setIdUsuario(rsDados.getInt("idUsuario"));
				usuario.setNome(rsDados.getString("Nome"));
				usuario.setEmail(rsDados.getString("Email"));
				usuario.setTelefone(rsDados.getString("Telefone"));
				usuario.setEndereco(rsDados.getString("Endereco"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		conexao.fechar(conn);
		return usuario;
	}

	public static ArrayList<Usuario> find(String nome) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql = "Select * From Usuario Where Nome = ?";

		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setString(1, nome);
			ResultSet rsDados = comandoSQL.executeQuery();
			while (rsDados.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario(rsDados.getInt("idUsuario"));
				usuario.setNome(rsDados.getString("Nome"));
				usuario.setEmail(rsDados.getString("Email"));
				usuario.setTelefone(rsDados.getString("Telefone"));
				usuario.setEndereco(rsDados.getString("Endereco"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		conexao.fechar(conn);
		return usuarios;
	}

	public static ArrayList<Usuario> getAll() {
		return null;
	}
}
