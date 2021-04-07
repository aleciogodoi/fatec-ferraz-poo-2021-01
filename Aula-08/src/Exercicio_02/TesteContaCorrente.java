package Exercicio_02;

import java.util.ArrayList;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente("1234-X", new Cliente(1, "Pedro"));
		ContaCorrente conta2 = new ContaCorrente("5431-X", new Cliente(2, "Ana"));
		
		// Uma lista de contas correntes
		ArrayList<ContaCorrente> contas = new ArrayList<ContaCorrente>();
		contas.add(conta1);
		contas.add(conta2);
		contas.add(new ContaCorrente("6543-X", new Cliente(3, "Maria")) );
		contas.add(new ContaCorrente("7779-Y", new Cliente(4, "Antonio")) );
		contas.add(new ContaCorrente("8881-Z", new Cliente(5, "José")) );
		contas.add(new ContaEmpresa("1111-K", new Cliente(5, "XPTO Ltda."), 1000) );
		
		// Depositos
		contas.get(0).deposito(0);
		contas.get(1).deposito(2000);
		contas.get(2).deposito(2000);
		contas.get(3).deposito(1000);
		contas.get(4).deposito(2000);
		contas.get(5).deposito(1200);
		
		// Saques
		contas.get(0).saque(0);
		contas.get(1).saque(1000);
		contas.get(2).saque(-1000);
		contas.get(3).saque(1000);
		contas.get(4).saque(1500);
		contas.get(5).saque(2000);
		contas.get(5).saque(100);
		// Transferencia conta 4 para conta 5
		contas.get(4).transferencia(300, contas.get(5));
		// Transferencia conta 2 para conta 5
		contas.get(2).transferencia(800, contas.get(5));
		
		// leitura da lista de contas correntes
		for (ContaCorrente c: contas) {
			System.out.println(c);
		}
		
	}

}
