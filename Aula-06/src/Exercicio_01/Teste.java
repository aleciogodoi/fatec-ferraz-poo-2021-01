package Exercicio_01;

public class Teste {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Pedro","123245",7865.92, 1234);
		System.out.println(g1);
		System.out.println(g1.autentica(4321));
		System.out.println(g1.autentica(123));
		System.out.println(g1.autentica(1234));

	}

}
