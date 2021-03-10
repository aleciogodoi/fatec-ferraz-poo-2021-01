
public class TesteContaCorrente {

	public static void main(String[] args) {
		System.out.println("Total de Contas Correntes: "+ ContaCorrente.getTotalContasCorrentes());
		
		ContaCorrente c1 = new ContaCorrente("09182-X","Pedro Henrique", 1254.41f);
		System.out.println(c1);
		
		ContaCorrente c2 = new ContaCorrente("12345-Y","Ana Maria", 2754.29f);
		System.out.println(c2);
		
		ContaCorrente c3 = new ContaCorrente("87651-Z","Maria Eduarda", 5431.73f);
		System.out.println(c2);
		
		System.out.println("Total de Contas Correntes: "+ ContaCorrente.getTotalContasCorrentes());
	}

}
