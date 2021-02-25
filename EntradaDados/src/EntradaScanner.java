import java.util.Scanner;

public class EntradaScanner {
	public static void main(String[] args) {
		Scanner meuScanner = new Scanner(System.in); // Cria um objeto ScannerSystem.out.println("Entre com seu nome");
														// // Mensagem para entrada Nome
		String nome = meuScanner.nextLine(); // Lê os dados digitados String
		System.out.println("Seu nome é: " + nome); // Imprime nome

		System.out.println("Entre com sua idade"); // Mensagem para entrada Idade
		int idade = meuScanner.nextInt(); // Lê os dados digitados
		System.out.println("Sua Idade é: " + idade); // Imprime idade

		// Solicitar a entrada de endereço
		System.out.println("Entre com seu edereço"); // Mensagem para entrada Nome
		String endereco = meuScanner.nextLine(); // Lê os dados digitados String
		System.out.println("Seu endereço é: " + endereco); // Imprime nome

	}
}
