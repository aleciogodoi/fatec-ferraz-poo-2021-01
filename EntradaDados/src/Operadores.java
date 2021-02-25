public class Operadores {
	public static void main(String[] args) {
		int x = 10;
		int i = 5;
		int resultado = 0;
		System.out.println("Valor de i: "+i);
		i++;
		System.out.println("Valor de i: "+i);
		i--;
		System.out.println("Valor de i: "+i);

		resultado = resultado + x + i;
		System.out.println("Valor de resultado: "+resultado);
		resultado /= 5;   // resultado = resultado / 5;
		System.out.println("Valor de resultado: "+resultado);
		resultado *= 10;   // resultado = resultado * 10;
		System.out.println("Valor de resultado: "+resultado);
		System.out.println("Valor de resultado (resultado--): "+ (resultado--));  // 30 
		System.out.println("Valor de resultado (--resultaldo): "+ (--resultado)); // 30 31 29
		System.out.println("Valor de resultado: "+ resultado);
		
		resultado = (resultado + x) * i;
		System.out.println("Valor de resultado: "+ resultado);	
		System.out.println("Valor de PI: "+Math.PI);

		System.out.println("i("+i +") > x("+x+") : "+ (i > x));
		System.out.println("i("+i +") < x("+x+") : "+ (i < x));
		System.out.println("i("+i +") == x("+x+") : "+ (i == x));
		System.out.println( (i < x) && resultado > (i + x) );
		System.out.println( (i == x) || resultado > (i + x) );
		System.out.println("i("+i +") != x("+x+") : "+ (i != x));
		
		if (5 > 2) {
			System.out.println("ok");
			System.out.println("tudo bem!");
		}
	}
}
