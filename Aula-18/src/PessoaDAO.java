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
	
	/*
	public static void update(Pessoa Pessoa) {	
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Update TipoDespesa Set descrTipo=? Where idTipo=?";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setString(1, tipoDespesa.getDescrTipo());
			comandoSQL.setInt(2, tipoDespesa.getIdTipo());
			comandoSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}
	
	public static void delete(int idPessoa) {
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Delete From TipoDespesa Where idTipo=?";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setInt(1, idTipo);
			comandoSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}
	
	public static Pessoa find(int idPessoa) {
		TipoDespesa tipoDespesa = new TipoDespesa();
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Select * From TipoDespesa Where idTipo=?";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setInt(1, idTipo);
			ResultSet rsDados = comandoSQL.executeQuery();
			if (rsDados.next()) {
				tipoDespesa.setIdTipo(rsDados.getInt("idTipo"));
				tipoDespesa.setDescrTipo(rsDados.getString("descrTipo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);		
		return tipoDespesa;
	}
	
	public static ArrayList<Pessoa> getAll(){
		ArrayList<TipoDespesa> tipoDespesas = new ArrayList<TipoDespesa>();
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Select * From TipoDespesa";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			ResultSet rsDados = comandoSQL.executeQuery();
			while (rsDados.next()) {
				TipoDespesa tipoDespesa = new TipoDespesa();
				tipoDespesa.setIdTipo(rsDados.getInt("idTipo"));
				tipoDespesa.setDescrTipo(rsDados.getString("descrTipo"));
				tipoDespesas.add(tipoDespesa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);		
		return tipoDespesas;
	}
*/
	
}
