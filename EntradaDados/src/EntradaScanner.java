import java.util.Scanner;

public class EntradaScanner {
	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in); // Cria um objeto ScannerSystem.out.println("Entre com seu nome");
														// // Mensagem para entrada Nome
		String nome = meuScanner.nextLine(); // L� os dados digitados String
		System.out.println("Seu nome �: " + nome); // Imprime nome

		System.out.println("Entre com sua idade"); // Mensagem para entrada Idade
		int idade = meuScanner.nextInt(); // L� os dados digitados
		System.out.println("Sua Idade �: " + idade); // Imprime idade

		// Solicitar a entrada de endere�o
		System.out.println("Entre com seu edere�o"); // Mensagem para entrada Nome
		String endereco = meuScanner.nextLine(); // L� os dados digitados String
		System.out.println("Seu endere�o �: " + endereco); // Imprime nome

	}
}
