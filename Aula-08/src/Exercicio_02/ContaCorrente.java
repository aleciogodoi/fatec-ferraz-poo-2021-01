package Exercicio_02;

public class ContaCorrente {
	// Atributos
	private String numero;
	private double saldo;
	private Cliente cliente;
	// Construtor
	public ContaCorrente(String numero, Cliente cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}	

	public boolean deposito(double valor) {
		return true;
	}

	public boolean saque(double valor) {
		return true;
	}

	public void transferencia(double valor, ContaCorrente contaTransf) {
		
	}
	
	
}
