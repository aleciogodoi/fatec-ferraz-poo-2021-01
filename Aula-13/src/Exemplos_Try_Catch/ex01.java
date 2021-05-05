package Exemplos_Try_Catch;

public class ex01 {

	public static void main(String[] args) {
		System.out.println("Inicio Main");
		metodo1();
		divisao();
		System.out.println("Fim Main");
	}

	public static void metodo1 (){
		System.out.println("Inicio Metodo 1");		
		try  {
			metodo2();
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Xi deu erro !!! " +e.toString());
		} 		
		System.out.println("Fim Metodo 1");		
	}
	
	public static void metodo2 () {
		System.out.println("Inicio Metodo 2");				
		int matriz[] = new int [10];	
		for (int i = 0; i < 12; i++ ) {
			matriz[i] = i;
			System.out.println("matriz ["+i+"] = " + matriz[i]);
		}	
		System.out.println("Fim Metodo 2");		
	}
	
	public static void divisao (){
		System.out.println("Inicio Divisao");	
		int a = 100;
		try {
			a = a / 0;
		}
		catch (ArithmeticException e) {
				System.out.println("Xi deu erro !!! " +e.toString());			
		}
		System.out.println("Resultado divisão: " + a);
		System.out.println("Fim Divisao");				
	}
	
}
