import java.time.LocalDate;

public class Gerente extends Funcionario{
	
	private String area;
	
	Gerente(String nome, LocalDate nascimento, float salario, String area) {
		super(nome, nascimento, salario);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return super.toString() + " Gerente [area=" + area + "]";
	}
	
	@Override
	public float calcularImposto() {
		return this.getSalario() * 5/100;
	}
	

}
