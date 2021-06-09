
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
	}
}
