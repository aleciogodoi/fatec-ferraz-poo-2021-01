package Exercicio_01;

public class Gerente extends Funcionario{
	// Atributos
	private int senha;
	
	//Construtores
	public Gerente() {
		super();
	}

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.senha = senha;
	}

	@Override
	public String toString() {
		return super.toString() + " Gerente [senha=" + senha + "]";
	}
	
	public boolean autentica(int senha) {
		return (this.senha == senha);
	}
	
}
