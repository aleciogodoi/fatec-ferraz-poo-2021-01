package Lab_Abstract_01;

abstract public class Figura {
	private String cor;

	public Figura(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	@Override
	public String toString() {
		return "Figura [cor=" + cor + "]";
	}

	abstract void draw();
	abstract double area();
}
