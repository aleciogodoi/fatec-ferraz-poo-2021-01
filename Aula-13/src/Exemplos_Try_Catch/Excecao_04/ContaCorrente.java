package Exemplos_Try_Catch.Excecao_04;

public class ContaCorrente {
	
	private String nomeCliente;
	private String numero;
	private double saldo;
	
	public ContaCorrente(String nomeCliente, String numero) {
		this.setNomeCliente(nomeCliente);
		this.setNumero(numero);
		this.saldo = 0;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito (double vl) {
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(this.toString());
		System.out.println("Depósito - Valor: "+vl);
		if (vl <= 0) {
			throw new ContaException("Valor do depósito deve ser maior que zero!!!");
		} else {
			this.saldo += vl;
		}
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("------------------------------------------------------------------------------");
	}
	
	public void saque (double vl) {
		System.out.println("------------------------------------------------------------------------------");
		System.out.println(this.toString());
		System.out.println("Saque - Valor: "+vl);
		if (vl < 0) {
			throw new ContaException("Valor do saque deve ser maior que zero!!!");
		} else if (saldo - vl < 0) {
			throw new ContaException("Saldo Insuficiente para saque!!!");
		} else {
			this.saldo -= vl;
		}
		System.out.println("Saldo: "+this.getSaldo());
		System.out.println("------------------------------------------------------------------------------");
	}
	
	public void tranferencia (double vl, ContaCorrente c1) {
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Transferência");
		this.saque(vl);
		c1.deposito(vl);
		System.out.println("------------------------------------------------------------------------------");		
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [Nome = " + getNomeCliente() +
				", Numero = " + getNumero()
				+ ", Saldo = " + getSaldo() + "]";
	}
}

class ContaException extends RuntimeException /*Exception*/ {
	ContaException(String message) { 
		super(message); 
	}
}
