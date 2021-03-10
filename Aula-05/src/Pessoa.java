
public class Pessoa {
	// Atributos
	private String cpf;
	private String nome;
	private float peso;
	private float altura;

	public Pessoa(String cpf, String nome, float peso, float altura) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Pessoa() {
		super();
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
	public String getCPF() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
}
