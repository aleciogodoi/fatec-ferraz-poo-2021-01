package Exercicio_02;

public class ContaEmpresa extends ContaCorrente{

	private double limite;
	
	
	ContaEmpresa(String numero, Cliente cliente, double limite) {
		super(numero, cliente);
		this.limite = limite;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public String toString() {
		return super.toString()+ " ContaEmpresa [limite=" + limite + "]";
	}
	
	@Override
	public boolean saque(double valor) {
		if (valor <= 0) {
			System.out.println(this.toString()+"\nSaque não efetuado! Valor inválido! ("+valor+")\n");
			return false;
		} else if ((saldo + limite) - valor < 0) {
			System.out.println(this.toString()+"\nSaque não efetuado! Saldo insuficiente! Valor Saque ("+valor+")\n");
			return false;			
		}
		saldo -= valor;
		System.out.println(this.toString()+"\nSaque efetuado! Valor ("+valor+")\n");
		return true;
	}


	
}
