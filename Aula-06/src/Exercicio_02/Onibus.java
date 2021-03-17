package Exercicio_02;

public class Onibus extends Veiculo{
	private int assentos;
	public Onibus() {
		super();
	
	}
	public Onibus(String placa, int ano, int assentos) {
		super(placa, ano);
		this.assentos = assentos;
	}
	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	@Override
	public String toString() {
		return super.toString()+" - Onibus [assentos=" + assentos + "]";
	}	
}
