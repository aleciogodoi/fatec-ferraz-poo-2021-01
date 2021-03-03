public class TesteCirculo {
	public static void main(String[] args) {
		// Cria um objeto do tipo circulo chamado c1
		Circulo c1 = new Circulo();
		// Cria um objeto do tipo circulo chamado c2
		Circulo c2 = new Circulo(5, 3, "Olá mundo!!! Sou o c2!!!");
		//c2.raio(3.28f);
		//c2.move(1.7f, 2.43f);
		// Array de circulos
		Circulo[] circulos = new Circulo[5];
		for (int i=0; i < circulos.length; i++) {
			circulos[i] = new Circulo(10, 20, 5);
			circulos[i].raio((i+1)*2);
			circulos[i].move(i*2, i*2+1);
			circulos[i].imprime();
		}
		// Altera valores dos atributos de c1
		c1.raio = 5.2f;
		c1.x = 2.1f;
		c1.y = 5.5f;
		// Mostra os valores dos atributos de c1 (Raio, x, e y)
		System.out.println("Raio: "+c1.raio);
		System.out.println("Area: "+c1.calcularArea());
		System.out.println("x: "+c1.x);
		System.out.println("y: "+c1.y);
		// Imprime os valores dos atributos
		c1.imprime();
		// Alterando raio
		c1.raio(10.f);
		// Alterando x e y metodo move
		c1.move(7.35f, 4.29f);
		c1.imprime();
		c2.imprime();
	}
}
