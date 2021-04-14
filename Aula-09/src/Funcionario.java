import java.time.LocalDate;

public class Funcionario extends Pessoa{
	// Atributo
	private float salario;
	
	// Construtores
	Funcionario(String nome, LocalDate nascimento, float salario){
		super(nome, nascimento); // construtor da classe mãe
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+" Funcionario [salario=" + salario + ", calcularImposto()=" + calcularImposto() + "]";
	}

	
	public float calcularImposto() {
		return salario * 3/100;
	}
	
}
