package ExemploBD_01;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		//incluir(new Departamento(400, "MARKETING", 10, "SUDESTE", "SÃO PAULO"));
		ArrayList<Departamento> departamentos = carregaDeptos();
		System.out.println("Total de Departamentos: "+departamentos.size());
		
		departamentos.add(new Departamento(500, "ESTOQUE", 10, "SUDESTE", "SÃO PAULO"));
		for (Departamento depto: departamentos) {
			System.out.println(depto);
		}
	}
	
	public static void incluir(Departamento depto) {
		Connection conn;
		Conexao conexao = new Conexao();
		conn = conexao.conectar();
		String sql = "Insert Into Departamento (idDepto, NomeDepto, Gerente, Divisao, Local ) Values (";
		sql = sql + depto.getIdDepto()+
				", '"+depto.getNomeDepto()+"', "+
				      depto.getGerente()+", "+ 
				"'"+ depto.getDivisao()+"', "+ 
				"'"+ depto.getLocal()+"'"+ 
				")";
		System.out.println(sql);
		try {
			Statement comandoSQL = conn.createStatement();
			comandoSQL.executeUpdate(sql);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		conexao.fechar(conn);	
	}
	
	public static ArrayList<Departamento> carregaDeptos() {
		ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
		Connection conn;
		Conexao conexao = new Conexao();
		conn = conexao.conectar();
		String sql = "Select * From departamento";
		
		try {
			Statement comandoSQL = conn.createStatement();
			ResultSet rsDados = comandoSQL.executeQuery(sql);
			while (rsDados.next()) {
				Departamento depto = new Departamento();
				depto.setIdDepto(rsDados.getInt("IdDepto"));
				depto.setNomeDepto(rsDados.getString("NomeDepto"));
				depto.setGerente(rsDados.getInt("Gerente"));
				depto.setDivisao(rsDados.getString("Divisao"));
				depto.setLocal(rsDados.getString("Local"));
				departamentos.add(depto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		conexao.fechar(conn);
		return departamentos;
	}
}
