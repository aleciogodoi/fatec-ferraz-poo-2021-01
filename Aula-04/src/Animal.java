import javax.swing.JOptionPane;

public class Animal {
	// Atributos
	String nome;
	String classe;
	String familia;
	int idade;
	int caloria;
	int forca;
	boolean estado;
	// Construtor
	Animal(){
		nascer();
	}
	// Metodos
	private void nascer() {
		nome = JOptionPane.showInputDialog("Nome");
		classe = JOptionPane.showInputDialog("Classe");
		familia = JOptionPane.showInputDialog("Fam�lia");
		idade = 0;
		caloria = 10;
		forca = 10;
		estado = true; // vivo		
	}

	public void morrer() {
		forca = 0;
		estado = false;
		JOptionPane.showMessageDialog(null, nome+" morreu!");
	}

	public void comer() {
		if(estado && forca>=2 && caloria<100) {
			caloria += 10;
			forca -= 2;
			JOptionPane.showMessageDialog(null, nome+" comeu!");
		} else {
			if (!estado) {
				JOptionPane.showMessageDialog(null, nome+" n�o come! Est� morto!");
			} else if (caloria > 100) {
				JOptionPane.showMessageDialog(null, nome+" n�o come! Est� cheio!");		
			} else {
				JOptionPane.showMessageDialog(null, nome+" n�o come! Est� exausto!");	
			}
		}
	}

	public void correr() {
		if(estado && caloria>=5 && forca>=5) {
			caloria -= 5;
			forca -= 5;
			JOptionPane.showMessageDialog(null, nome+" correu!");
		} else {
			if (!estado) {
				JOptionPane.showMessageDialog(null, nome+" n�o corre! Est� morto!");
			} else  {
				JOptionPane.showMessageDialog(null, nome+" n�o corre! Est� exausto!");		
			}
		}
	}
	
	public void dormir() {
		if(estado && caloria>=2 && forca<100) {
			caloria -= 2;
			forca += 10;
			JOptionPane.showMessageDialog(null, nome+" dormiu!");
		} else {
			if (!estado) {
				JOptionPane.showMessageDialog(null, nome+" n�o dorme! Est� morto!");	
			} else {
				JOptionPane.showMessageDialog(null, nome+" n�o dorme! Est� sem calorias!");	
			}
		}
	}
	
	public void aniversario() {
		idade++;
	}
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", idade=" + idade + ", caloria=" + caloria + ", forca=" + forca + ", estado="
				+ estado + "]";
	}

}
