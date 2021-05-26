package Exemplos;

public class Empregado {
	private int idEmpregado;
	private String nomeEmpregado;
	private int idDepto;
	private String cargo;
	private int tempo_emp;
	private float salario;
	private float comissao;
	
	public Empregado() {
	}

	public Empregado(int idEmpregado, String nomeEmpregado, int idDepto, String cargo, int tempo_emp, float salario,
			float comissao) {
		super();
		this.idEmpregado = idEmpregado;
		this.nomeEmpregado = nomeEmpregado;
		this.idDepto = idDepto;
		this.cargo = cargo;
		this.tempo_emp = tempo_emp;
		this.salario = salario;
		this.comissao = comissao;
	}

	public int getIdEmpregado() {
		return idEmpregado;
	}

	public void setIdEmpregado(int idEmpregado) {
		this.idEmpregado = idEmpregado;
	}

	public String getNomeEmpregado() {
		return nomeEmpregado;
	}

	public void setNomeEmpregado(String nomeEmpregado) {
		this.nomeEmpregado = nomeEmpregado;
	}

	public int getIdDepto() {
		return idDepto;
	}

	public void setIdDepto(int idDepto) {
		this.idDepto = idDepto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getTempo_emp() {
		return tempo_emp;
	}

	public void setTempo_emp(int tempo_emp) {
		this.tempo_emp = tempo_emp;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Empregado [idEmpregado=" + idEmpregado + ", nomeEmpregado=" + nomeEmpregado + ", idDepto=" + idDepto
				+ ", cargo=" + cargo + ", tempo_emp=" + tempo_emp + ", salario=" + salario + ", comissao=" + comissao
				+ "]";
	}
	
	
}
