package Lab_Abstract_01;

public class Teste {
	public static void main(String args[]) {
		Retangulo r1 = new Retangulo("vermelho", 7, 25);
		System.out.println(r1);
		r1.draw();
		
		System.out.println();
		Quadrado q1 = new Quadrado("azul", 5);
		System.out.println(q1);
		q1.draw();		
	}
}
