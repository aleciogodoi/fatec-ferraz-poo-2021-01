import javax.swing.JOptionPane;
public class Entrada2 {
	public static void main(String[] args) {
		// Criar as variaveis
		String nome;
		int idade;
		String endereco;
		float altura;
		
		nome = JOptionPane.showInputDialog("Entre com o nome: ");
		idade = Integer.valueOf(JOptionPane.showInputDialog("Entre com o idade: "));
		endereco = JOptionPane.showInputDialog("Entre com o endereço: ");
		altura = Float.valueOf(JOptionPane.showInputDialog("Entre com a altura: "));

		JOptionPane.showMessageDialog(null, 
				"Nome: "+nome+", Idade: "+ idade+", Endereço: "+endereco+
				"Altura: "+altura
		);
		JOptionPane.showMessageDialog(null, 
				"Nome: "+nome+"\nIdade: "+ idade
						+ "\nAltura: "+altura 
						+ "\nEndereço: "+endereco
		);
	}
}
