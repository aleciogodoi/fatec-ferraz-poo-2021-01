package Exemplos_Try_Catch;

import java.util.InputMismatchException;


public class ExemploDeExcecao {
	public static void main(String[] args) {

		String var = "ABC";
		try {
			int i = Integer.parseInt(var);
			System.out.println("A variável i vale " + i);
			}
		catch (NumberFormatException e) {
			System.out.println("Não é possível atribuir a string " + var
			+ " a um Objeto Inteiro.\n"
			+ "A seguinte mensagem foi retornada:\n\n"
			+ e.getMessage());
			}
	    catch(InputMismatchException e){
	    	System.out.println("Somente inteiros são permitidos!");
		       
		    System.out.println("Erro: " + e.getMessage());
		}
		
	    Circulo circulo = new Circulo(); 
	    circulo.solicitaRaioDoCirculo();
	    circulo.calculaAreaDoCirculo();
	    circulo.calculaPerimetroDoCirculo();
	    System.out.println();
	    System.out.println();

		boolean excecao = false;
	    while(!excecao){
	      Divisao divisao = new Divisao();
	      excecao = divisao.calculaDivisao();
	    }
	    System.out.println();
	    System.out.println("FIM DO PROGRAMA");
	}
}
