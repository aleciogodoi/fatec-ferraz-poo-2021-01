package exemplo_atributo_static;

public class Pessoa {
	private static int totalPessoas;
	private int id;
	private String nome;

	Pessoa() {
		totalPessoas++;
	}

	Pessoa(int id, String nome) {
		totalPessoas++;
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getTotalPessoas() {
		return totalPessoas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + "]";
	}
}
