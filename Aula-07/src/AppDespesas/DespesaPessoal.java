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
		double total=0;
		for(Despesa despesa: despesas) {
			total += despesa.getValor();
		}
		return total;
	}
	
	public double getTotal(int ano, int mes) {
		double total=0;
		for(Despesa despesa: despesas) {
			if (	despesa.getData().getYear() == ano 
				&&	despesa.getData().getMonthValue() == mes)
				total += despesa.getValor();
		}
		return total;
	}
	
	public double getTotal(LocalDate data) {
		double total=0;
		for(Despesa despesa: despesas) {
			if (data.equals(despesa.getData()) )
				total += despesa.getValor();
		}
		return total;
	}

	public void imprime() {	
		String space = "                           ";
		System.out.println("-------------------------------------------------------------------");
		System.out.println("CPF: "+this.cpf);
		System.out.println("-------------------------------------------------------------------");
		for(Despesa despesa: despesas) {
			System.out.println(
					(despesa.getDescDespesa()+space).substring(0,30)+"\t"+
					 despesa.getData()+"\t\t"+despesa.getValor()
			);		
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.println(space + "\t\t\t\t" + this.getTotal());
	}
	
	public void imprime(int ano, int mes) {
		String space = "                           ";
		System.out.println("-------------------------------------------------------------------");
		System.out.println("CPF: "+this.cpf);
		System.out.println("-------------------------------------------------------------------");
		for(Despesa despesa: despesas) {
			if (	despesa.getData().getYear() == ano 
				&&	despesa.getData().getMonthValue() == mes)
				System.out.println(
						(despesa.getDescDespesa()+space).substring(0,30)+"\t"+
						 despesa.getData()+"\t\t"+despesa.getValor()
				);		
		}
		System.out.println("-------------------------------------------------------------------");	
		System.out.println(space + "\t\t\t\t" + this.getTotal(ano,  mes));
	}
	
	public void imprime(LocalDate data) {	
		String space = "                           ";
		System.out.println("-------------------------------------------------------------------");
		System.out.println("CPF: "+this.cpf);
		System.out.println("-------------------------------------------------------------------");
		for(Despesa despesa: despesas) {
			if (data.equals(despesa.getData()) )
				System.out.println(
						(despesa.getDescDespesa()+space).substring(0,30)+"\t"+
						 despesa.getData()+"\t\t"+despesa.getValor()
				);		
		}
		System.out.println("-------------------------------------------------------------------");
		System.out.println(space + "\t\t\t\t" + this.getTotal(data));
		
	}

	
}
