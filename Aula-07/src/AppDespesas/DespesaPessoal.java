package AppDespesas;
import java.time.LocalDate;
import java.util.ArrayList;

public class DespesaPessoal {
	// Atributos
	private String cpf;
	protected ArrayList<Despesa> despesas;
	
	// Construtor
	DespesaPessoal (String cpf) {
		this.cpf = cpf;
		this.despesas = new ArrayList<Despesa>();
	}

	@Override
	public String toString() {
		return "DespesaPessoal [cpf=" + cpf + ", despesas=" + despesas + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getTotal() {
		return 0;
	}
	public double getTotal(int ano, int mes) {
		return 0;
	}
	
	public double getTotal(LocalDate data) {
		return 0;
	}

	public void imprime() {	
		System.out.println(this.toString());
	}
	
	public void imprime(int ano, int mes) {
	}
	
	public void imprime(LocalDate data) {	
	}

	
}
