import java.sql.Date;
import java.time.LocalDate;

public class Teste {
	public static void main(String[] args) {
		//TipoDespesaDAO.insert(new TipoDespesa("Contas de Consumo"));
		//TipoDespesaDAO.insert(new TipoDespesa("Automóvel"));
		//TipoDespesaDAO.insert(new TipoDespesa("Despesas Médicas"));
		//TipoDespesaDAO.update(new TipoDespesa(2, "Gastos com Automóvel"));
		//TipoDespesaDAO.delete(3);

		//System.out.println(TipoDespesaDAO.find(1));
		//System.out.println(TipoDespesaDAO.find(2));
		for (TipoDespesa tipo: TipoDespesaDAO.getAll())
			System.out.println(tipo);
		
		PessoaDAO.insert(new Pessoa("1232312-09", 
				Date.valueOf(LocalDate.of(2000, 5, 19)), 
				"Pedro", 
				"pedro@gmail.com", 
				72.7f));		
		PessoaDAO.insert(new Pessoa("1232312-09", 
						Date.valueOf(LocalDate.of(1995, 7, 23)), 
						"Matheus", 
						"matheus@gmail.com", 
						74.32f));
	}
}
