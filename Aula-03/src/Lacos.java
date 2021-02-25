import javax.swing.JOptionPane;

public class Lacos {
	public static void main(String[] args) {
		
		// tabuada
		int num, i=0;
		String mensagem = "";
		
		do {
			num = Integer.valueOf(JOptionPane.showInputDialog("Entre com um número"));	
		} while (num < 1);
		
		/*
		while (i < 11) {
			mensagem +=  num +" * "+ i + " = "+(num * i)+"\n";
			i++;
		}
		JOptionPane.showMessageDialog(null, mensagem);
		*/
		/*
		do {
			mensagem +=  num +" * "+ i + " = "+(num * i)+"\n";
			i++;
		} while(i < 11);
		*/
		for (i=0; i < 11; i++) { 
			mensagem +=  num +" * "+ i + " = "+(num * i)+"\n";
	
		}
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
}
