package Exercicio_02;

public class Teste {
	
	public static void main(String[] args) { 
		Veiculo v1 = new Veiculo("XPT-0009",2012);
		v1.exibir();
		
		Caminhao c1 = new Caminhao("TPX-9000", 2013, 4);
		c1.exibir();
		
		Onibus o1 = new Onibus("ABC-0987", 2020, 50);
		o1.exibir();
	}
}
