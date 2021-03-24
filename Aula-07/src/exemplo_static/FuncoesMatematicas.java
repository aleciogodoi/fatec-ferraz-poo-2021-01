package exemplo_static;

public class FuncoesMatematicas {
	public static int exponencial(int x, int y) {
		if (y == 0)
			return 1;
		return x * exponencial(x, y - 1);
	}

	public static int fatorial(int x) {
		if (x == 0)
			return 1;
		return x * fatorial(x - 1);
	}
	
	public static int fibo(int n) {
		if (n < 2) {
			return n;
		}
		return fibo(n-1) + fibo(n-2);
	}
}