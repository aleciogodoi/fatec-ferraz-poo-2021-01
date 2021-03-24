package exemplo_static;

public class Teste {

	public static void main(String[] args) {
		System.out.println(FuncoesMatematicas.fatorial(5));
		System.out.println();
		for (int i=1; i < 11; i++)
			System.out.print(FuncoesMatematicas.fibo(i)+" ");
	}
}
