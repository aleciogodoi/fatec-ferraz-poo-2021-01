public class Pessoa {
	private int idPessoa;
	private String nome;
	private float peso;
	private float altura;
	private int idade;
	
	public Pessoa() {
	}
	
	public Pessoa(int idPessoa, String nome, float peso, float altura, int idade) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.idade = idade;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + ", idade="
				+ idade + "]";
	}
	
	
}
