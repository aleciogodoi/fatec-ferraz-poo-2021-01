package Lab_Abstract_01;

public class Retangulo extends Figura{

	private double lado1;
	private double lado2;
	
	public Retangulo(String cor, double lado1, double lado2) {
		super(cor);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public void draw() {
		for (int i=1; i <= lado1; i++) {
			for (int j=1; j <= lado2; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	@Override
	public double area() {
		return lado1 * lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public String toString() {
		return super.toString()+" Retangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", area()=" + area() + "]";
	}

	
}
