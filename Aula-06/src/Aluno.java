
public class Aluno extends Pessoa{
	
	// Atributos
	private String ra;
	private String unidade;
	
	// Construtores
	public Aluno() {
		super();                          // chama o construtor da classe Pessoa
	}
	public Aluno(String nome, int idade, float peso, float altura, String ra, String unidade) {
		super(nome, idade, peso, altura); // chama o construtor da classe Pessoa
		this.ra = ra;
		this.unidade = unidade;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Aluno [ra=" + ra + ", unidade=" + unidade + "]";
	}
	
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
}
