package Exemplos_Try_Catch;

import javax.swing.JOptionPane;

public class Exemplo_01 {

	static int n1, n2;
	public static void main(String[] args) {
		boolean flagException;
		do {
			try {
				flagException = false;
				entradaDados();
				JOptionPane.showMessageDialog(null, "Divisão "+n1+"/"+n2+"= " + (n1/n2));
			} catch(ArithmeticException  e) {
				flagException = true;
				JOptionPane.showMessageDialog(null, "n2 não pode ser igual a zero!!!");
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
				System.out.println(e.getCause());
				e.printStackTrace();
			} catch (NumberFormatException e2) {
				flagException = true;
				JOptionPane.showMessageDialog(null, "número com formato incorreto!!!");
				System.out.println(e2.getMessage());
				e2.printStackTrace();
			} 
		} while(flagException);
		
	}
	
	public static void entradaDados() {
		n1 = Integer.valueOf(JOptionPane.showInputDialog("Entre com n1:"));
		n2 = Integer.valueOf(JOptionPane.showInputDialog("Entre com n2:"));
	}

}
