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
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Insert Into Usuario (idUsuario, Nome, Email, Telefone, Endereco) "
				+  "Values              (        ?,    ?,     ?,        ?,        ?)";
		
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setInt(1, usuario.getIdUsuario());
			comandoSQL.setString(2, usuario.getNome());
			comandoSQL.setString(3, usuario.getEmail());
			comandoSQL.setString(4, usuario.getTelefone());
			comandoSQL.setString(5, usuario.getEndereco());
			comandoSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}

	public static void update(Usuario usuario) {
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Update Usuario Set Nome=?, Email=?, Telefone=?, Endereco=? Where idUsuario = ?";
		
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setString(1, usuario.getNome());
			comandoSQL.setString(2, usuario.getEmail());
			comandoSQL.setString(3, usuario.getTelefone());
			comandoSQL.setString(4, usuario.getEndereco());
			comandoSQL.setInt(5, usuario.getIdUsuario());
			comandoSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}

	public static void delete(int idUsuario) {
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Delete From Usuario Where idUsuario=?";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setInt(1, idUsuario);
			comandoSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
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
		String sql = "Select * From Usuario Where Nome like ?";

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
				usuarios.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
		return usuarios;
	}

	public static ArrayList<Usuario> getAll() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql = "Select * From Usuario";

		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			ResultSet rsDados = comandoSQL.executeQuery();
			while (rsDados.next()) {
				Usuario usuario = new Usuario();
				usuario.setIdUsuario(rsDados.getInt("idUsuario"));
				usuario.setNome(rsDados.getString("Nome"));
				usuario.setEmail(rsDados.getString("Email"));
				usuario.setTelefone(rsDados.getString("Telefone"));
				usuario.setEndereco(rsDados.getString("Endereco"));
				usuarios.add(usuario);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
		return usuarios;
	}
}
