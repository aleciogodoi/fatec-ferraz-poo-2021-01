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
		/*
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
		
		PessoaDAO.update(new Pessoa(3, "1276654-10", 
				Date.valueOf(LocalDate.of(1995, 7, 23)), 
				"Matheus Godoi", 
				"matheus@gmail.com", 
				74.32f));
		
		PessoaDAO.delete(4);
	
		PessoaDAO.insert(new Pessoa("00986763-09", 
				Date.valueOf(LocalDate.of(1999, 5, 21)), 
				"Ana", 
				"ana@gmail.com", 
				57.32f));

		PessoaDAO.insert(new Pessoa("55823921-76", 
				Date.valueOf(LocalDate.of(1997, 12, 07)), 
				"Maria", 
				"maria@gmail.com", 
				58.13f));
		*/
		//System.out.println(PessoaDAO.find(1));
		//System.out.println(PessoaDAO.find(5));
		
		for (Pessoa pessoa: PessoaDAO.getAll())
			System.out.println(pessoa);	
	}
}
