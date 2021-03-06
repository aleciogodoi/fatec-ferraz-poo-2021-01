import java.util.Random;

public class Array {

	public static void main(String[] args) {
		//cars = ["Ford", "Volvo", "BMW", 1, 1.15] -- Python
		
		String[] cars = {"Ford","Volvo", "BMW", "VW", "Fiat" };
		System.out.println("Cars");
		for (int i=0; i < cars.length; i++) {
			System.out.println("("+i+") "+cars[i]);
		}
		
		System.out.println("\nCars 2");
		String[] cars2 = new String[10];  // Array de String com 10 elementos
		cars2[0] = "Ford";
		cars2[1] = "Volvo";
		cars2[2] = "BMW";
		cars2[3] = "VW";
		cars2[4] = "Fiat";
		
		for (int i=0; i < cars2.length; i++) {
			System.out.println("("+i+") "+cars2[i]);
		}
		System.out.println("\nMatriz");
		
		int [][] matriz = { 
							{1, 5, 6},
							{1, 0, 10},
							{10, 8, 6},
							{10 },
							{20, 12 },
						  };
		for (int i=0; i < matriz.length; i++) { // itera linhas
			for (int j=0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
				if (j < matriz[i].length-1)
					System.out.print(", ");
			}
			System.out.println();
		}
		
		System.out.println("\nMatriz 2");
		int [][] matriz2 = new int[4][4];   // matriz de inteiros 4 linhas e 4 colunas
		Random rnd = new Random();          // Objeto Randomico
		for (int i=0; i < matriz2.length; i++) { // itera linhas
			for (int j=0; j < matriz2[i].length; j++) {
				matriz2[i][j] = rnd.nextInt(1001);   // Gera um numero entre 0 e 1000
			}
		}	
		for (int i=0; i < matriz2.length; i++) { // itera linhas
			for (int j=0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j]);
				if (j < matriz2[i].length-1)
					System.out.print(", ");
			}
			System.out.println();
		}		
		
	}
	
}
