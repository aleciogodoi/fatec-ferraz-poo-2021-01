package Lab_Abstract_01;

public class Circulo extends Figura{

	private double raio;
	
	public Circulo(double raio, String cor) {
		super(cor);
		this.raio = raio;
	}
	
	@Override
	void draw() {
		System.out.println("Não sei desenhar circulos! :(");
		
	}

	@Override
	double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getDiametro() {
		return raio * 2;
	}

	@Override
	public String toString() {
		return super.toString() + " Circulo [raio=" + raio + ", area()=" + area() + ", getDiametro()=" + getDiametro() + "]";
	}
	
	
}
