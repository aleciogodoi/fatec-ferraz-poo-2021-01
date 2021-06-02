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
		String sql="Insert Into Pessoa (idPessoa, Nome, Peso, Altura, Idade) "
				+ "Values (?, ?, ?, ?, ?)";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setInt(1, pessoa.getIdPessoa());
			comandoSQL.setString(2, pessoa.getNome());
			comandoSQL.setFloat(3, pessoa.getPeso());
			comandoSQL.setFloat(4, pessoa.getAltura());
			comandoSQL.setInt(5, pessoa.getIdade());
			comandoSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}
	
	public static void update(Pessoa pessoa) {	
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Update Pessoa Set Nome=?, Peso=?, Altura=?, Idade=? Where idPessoa=?";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setString(1, pessoa.getNome());
			comandoSQL.setFloat(2, pessoa.getPeso());
			comandoSQL.setFloat(3, pessoa.getAltura());
			comandoSQL.setInt(4, pessoa.getIdade());
			comandoSQL.setInt(5, pessoa.getIdPessoa());
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
				pessoa.setNome(rsDados.getString("Nome"));
				pessoa.setPeso(rsDados.getFloat("Peso"));
				pessoa.setAltura(rsDados.getFloat("Altura"));
				pessoa.setIdade(rsDados.getInt("Idade"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
		return pessoa;
	}

	public static ArrayList<Pessoa> getAll(){
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
				pessoa.setNome(rsDados.getString("Nome"));
				pessoa.setPeso(rsDados.getFloat("Peso"));
				pessoa.setAltura(rsDados.getFloat("Altura"));
				pessoa.setIdade(rsDados.getInt("Idade"));
				pessoas.add(pessoa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
		return pessoas;
	}
}
