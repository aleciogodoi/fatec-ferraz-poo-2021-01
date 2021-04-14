package Lab_Abstract_01;

public class Quadrado extends Retangulo {

	Quadrado(String cor, double lado) {
		super(cor, lado, lado);
	}

	@Override
	public String toString() {
		return "Quadrado [Cor="+ getCor()+", Lado"+ getLado1() + ", area()="+ area() +  "]";
	}
	
}
