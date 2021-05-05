package Exemplos_Try_Catch;
import java.io.FileNotFoundException;

public class Exemplo_03 {

	public static void main (String []args) {
		metodo();
	}
	
	public static void metodo() {
		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!!!");
			//e.printStackTrace();
		} 
	} 
	
}
