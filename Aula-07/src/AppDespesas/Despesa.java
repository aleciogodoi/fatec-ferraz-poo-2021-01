package AppDespesas;
import java.time.LocalDate;
import java.util.Date;

public class Despesa {
	// Atributos
	private LocalDate data;
	private String descDespesa;
	private double valor;
	
	// Construtor
	public Despesa(LocalDate data, String descr, double valor) {
		this.data = data;
		this.descDespesa = descr;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Despesa [data=" + data + ", descDespesa=" + descDespesa + ", valor=" + valor + "]";
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getDescDespesa() {
		return descDespesa;
	}

	public void setDescDespesa(String descDespesa) {
		this.descDespesa = descDespesa;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
