
public class Teste {
	public static void main(String[] args) {
		//TipoDespesaDAO.insert(new TipoDespesa("Contas de Consumo"));
		//TipoDespesaDAO.insert(new TipoDespesa("Autom�vel"));
		//TipoDespesaDAO.insert(new TipoDespesa("Despesas M�dicas"));
		//TipoDespesaDAO.update(new TipoDespesa(2, "Gastos com Autom�vel"));
		//TipoDespesaDAO.delete(3);

		//System.out.println(TipoDespesaDAO.find(1));
		//System.out.println(TipoDespesaDAO.find(2));
		for (TipoDespesa tipo: TipoDespesaDAO.getAll())
			System.out.println(tipo);
	}
}
