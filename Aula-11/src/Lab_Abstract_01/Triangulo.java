package Lab_Abstract_01;

public class Triangulo extends Figura{

	private double base;
	private  double altura;
	
	public Triangulo(double base, double altura, String cor) {
		super(cor);
		this.base = base;
		this.altura = altura;
	}

	@Override
	void draw() {
		System.out.println("Não sei desenhar triangulos! :(");
	}

	@Override
	double area() {
		return base * altura / 2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return super.toString()+" Triangulo [base=" + base + ", altura=" + altura + ", area()=" + area() + "]";
	}

}
