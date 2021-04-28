
public class PessoaFisica extends Pessoa implements CalculaBonus {

	private String cpf;
	
	public PessoaFisica(int id, String nome) {
		super(id, nome);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString() + " PessoaFisica [cpf=" + cpf + "]";
	}

	@Override
	public double bonus(double salario) {
		return salario * 10;
	}

}
