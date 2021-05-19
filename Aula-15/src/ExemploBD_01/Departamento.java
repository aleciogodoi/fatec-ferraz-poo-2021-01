package ExemploBD_01;

public class Departamento {
	// Atributos
	private int idDepto;
	private String nomeDepto;
	private int gerente;
	private String divisao;
	private String local;
	
	// Construtores

	public Departamento() {
	}
	
	public Departamento(int idDepto, String nomeDepto, 
			int gerente, String divisao, String local) {
		super();
		this.idDepto = idDepto;
		this.nomeDepto = nomeDepto;
		this.gerente = gerente;
		this.divisao = divisao;
		this.local = local;
	}

	public int getIdDepto() {
		return idDepto;
	}

	public void setIdDepto(int idDepto) {
		this.idDepto = idDepto;
	}

	public String getNomeDepto() {
		return nomeDepto;
	}

	public void setNomeDepto(String nomeDepto) {
		this.nomeDepto = nomeDepto;
	}

	public int getGerente() {
		return gerente;
	}

	public void setGerente(int gerente) {
		this.gerente = gerente;
	}

	public String getDivisao() {
		return divisao;
	}

	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return "Departamento [idDepto=" + idDepto + ", nomeDepto=" + nomeDepto + ", gerente=" + gerente + ", divisao="
				+ divisao + ", local=" + local + "]";
	}

}
