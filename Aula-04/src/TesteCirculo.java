public class TesteCirculo {
	public static void main(String[] args) {
		// Cria um objeto do tipo circulo chamado c1
		Circulo c1 = new Circulo();
		// Altera valores dos atributos de c1
		c1.raio = 5.2f;
		c1.x = 2.1f;
		c1.y = 5.5f;
		// Mostra os valores dos atributos de c1 (Raio, x, e y)
		System.out.println("Raio: "+c1.raio);
		System.out.println("x: "+c1.x);
		System.out.println("y: "+c1.y);
		// Imprime os valores dos atributos
		c1.imprime();
	}
}
