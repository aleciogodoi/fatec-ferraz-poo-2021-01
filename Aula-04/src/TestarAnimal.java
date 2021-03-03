import javax.swing.JOptionPane;

public class TestarAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		
		int opcao = 0;
		String menu = "0 - Sair\n"
					+ "1 - Comer\n"
					+ "2 - Correr\n"
					+ "3 - Dormir\n"
					+ "4 - Morrer";	
		do {
			opcao = Integer.valueOf(JOptionPane.showInputDialog(menu));
			switch (opcao) {
			case 1:
				a1.comer();
				break;
			case 2:
				// correr
				break;
			case 3:
				// dormir
				break;
			case 4:
				a1.morrer();
				break;
			}
		} while (opcao != 0);
		
	}

}
