import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TipoDespesaDAO {
	private static Connection conn;
	private static Conexao conexao;
	
	public static void insert(TipoDespesa tipoDespesa) {
		conexao = new Conexao();
		conn = conexao.conectar();
		String sql="Insert Into TipoDespesa (descrTipo) Values (?)";
		try {
			PreparedStatement comandoSQL = conn.prepareStatement(sql);
			comandoSQL.setString(1, tipoDespesa.getDescrTipo());
			comandoSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conexao.fechar(conn);
	}
	
	public static void update(TipoDespesa tipoDespesa) {	
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
	
	public static void delete(int idTipo) {
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
	
	public static TipoDespesa find(int idTipo) {
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
	
	public static ArrayList<TipoDespesa> getAll(){
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
}
