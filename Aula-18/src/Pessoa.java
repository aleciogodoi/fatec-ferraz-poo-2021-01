import java.sql.Date;

public class Pessoa {
	private int idPessoa;
	private String cpf;
	private Date dataNascimento;
	private String nome;
	private String email;
	private float peso;
	
	public Pessoa() {
	}
	
	public Pessoa(String cpf, Date dataNascimento, String nome, String email, float peso) {
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.nome = nome;
		this.email = email;
		this.peso = peso;
	}
	
	public Pessoa(int idPessoa, String cpf, Date dataNascimento, String nome, String email, float peso) {
		this.idPessoa = idPessoa;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.nome = nome;
		this.email = email;
		this.peso = peso;
	}

	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", nome=" + nome
				+ ", email=" + email + ", peso=" + peso + "]";
	}
	
}
