import javax.swing.JOptionPane;
public class NotaPonderada {

	public static void main(String[] args) {
		// Fa�a um programa que receba tr�s notas e seus respectivos pesos, 
		// calcule e mostre a m�dia ponderada.
		// se a nota for maior ou igual a 6 = aprovado, caso contr�rio reprovado
		
		float nota1, nota2, nota3, peso1, peso2, peso3, media;
		
		nota1 = Float.valueOf(JOptionPane.showInputDialog(null, "Nota 1:"));
		peso1 = Float.valueOf(JOptionPane.showInputDialog(null, "Peso 1:"));
		nota2 = Float.valueOf(JOptionPane.showInputDialog(null, "Nota 2:"));
		peso2 = Float.valueOf(JOptionPane.showInputDialog(null, "Peso 2:"));
		nota3 = Float.valueOf(JOptionPane.showInputDialog(null, "Nota 3:"));
		peso3 = Float.valueOf(JOptionPane.showInputDialog(null, "Peso 3:"));
		
		media = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1 + peso2 + peso3);  
		JOptionPane.showMessageDialog(null, "M�dia Ponderada: "+ String.format("%.2f",media ));
		if (media >= 6) {
			if (media == 10) {
				JOptionPane.showMessageDialog(null, "Aprovado com nota m�xima");
			} else {
				JOptionPane.showMessageDialog(null, "Aprovado");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Reprovado");
		}
		
	}
}
