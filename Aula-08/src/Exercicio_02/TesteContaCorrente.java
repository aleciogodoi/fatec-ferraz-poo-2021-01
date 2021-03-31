package Exercicio_02;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente("1234-X", new Cliente(1, "Pedro"));
		System.out.println(conta1);
		
		ContaCorrente conta2 = new ContaCorrente("5431-X", new Cliente(2, "Ana"));
		System.out.println(conta2);

	}

}
