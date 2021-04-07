package Exercicio_02;

public class ContaCorrente {
	// Atributos
	private String numero;
	protected double saldo;
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
		if (valor <= 0) {
			System.out.println(this.toString()+"\nDepósito não efetuado! Valor inválido! ("+valor+")\n");
			return false;
		}
		saldo += valor;
		System.out.println(this.toString()+"\nDepósito efetuado! Valor ("+valor+")\n");
		return true;
	}

	public boolean saque(double valor) {
		if (valor <= 0) {
			System.out.println(this.toString()+"\nSaque não efetuado! Valor inválido! ("+valor+")\n");
			return false;
		} else if (saldo - valor < 0) {
			System.out.println(this.toString()+"\nSaque não efetuado! Saldo insuficiente! Valor Saque ("+valor+")\n");
			return false;			
		}
		saldo -= valor;
		System.out.println(this.toString()+"\nSaque efetuado! Valor ("+valor+")\n");
		return true;
	}

	public void transferencia(double valor, ContaCorrente contaTransf) {
		// Uma transferencia, nada mais é do que um saque em uma conta e o deposito em outra conta
		System.out.println("Transferência");
		if (!this.saque(valor)) {
			System.out.println(this.toString()+"\nErro na Tranferência!\n");
		} else {
			contaTransf.deposito(valor);
		}		
	}
	
	
}
