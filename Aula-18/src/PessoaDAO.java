import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PessoaDAO {
	private static Connection conn;
	private static Conexao conexao;

	public static void insert(Pessoa pessoa) {
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Insert Into Pessoa (cpf, dataNascimento, nome, email, peso) Values (?, ?, ?, ?, ?)";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setString(1, pessoa.getCpf());
			comandoSQL.setDate(2, pessoa.getDataNascimento());
			comandoSQL.setString(3, pessoa.getNome());
			comandoSQL.setString(4, pessoa.getEmail());
			comandoSQL.setFloat(5, pessoa.getPeso());
			comandoSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}
	
	
	public static void update(Pessoa pessoa) {	
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Update Pessoa Set cpf=?,dataNascimento=?,nome=?,email=?,peso=?  Where idPessoa=?";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setString(1, pessoa.getCpf());
			comandoSQL.setDate(2, pessoa.getDataNascimento());
			comandoSQL.setString(3, pessoa.getNome());
			comandoSQL.setString(4, pessoa.getEmail());
			comandoSQL.setFloat(5, pessoa.getPeso());
			comandoSQL.setFloat(6, pessoa.getIdPessoa());
			comandoSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}
	
	public static void delete(int idPessoa) {
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Delete From Pessoa Where idPessoa=?";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setInt(1, idPessoa);
			comandoSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}
	
	public static Pessoa find(int idPessoa) {
		Pessoa pessoa = new Pessoa();
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Select * From Pessoa Where idPessoa=?";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setInt(1, idPessoa);
			ResultSet rsDados = comandoSQL.executeQuery();
			if (rsDados.next()) {
				pessoa.setIdPessoa(rsDados.getInt("idPessoa"));
				pessoa.setCpf(rsDados.getString("cpf"));
				pessoa.setDataNascimento(rsDados.getDate("dataNascimento"));
				pessoa.setNome(rsDados.getString("nome"));
				pessoa.setEmail(rsDados.getString("email"));
				pessoa.setPeso(rsDados.getFloat("peso"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);		
		return pessoa;
	}
	
	public static ArrayList<Pessoa> getAll() {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Select * From Pessoa";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			ResultSet rsDados = comandoSQL.executeQuery();
			while (rsDados.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setIdPessoa(rsDados.getInt("idPessoa"));
				pessoa.setCpf(rsDados.getString("cpf"));
				pessoa.setDataNascimento(rsDados.getDate("dataNascimento"));
				pessoa.setNome(rsDados.getString("nome"));
				pessoa.setEmail(rsDados.getString("email"));
				pessoa.setPeso(rsDados.getFloat("peso"));
				pessoas.add(pessoa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);		
		return pessoas;
	}
	
}
