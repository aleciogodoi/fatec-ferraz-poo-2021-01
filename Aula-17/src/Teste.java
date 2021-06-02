import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		//PessoaDAO.insert(new Pessoa(2,"Maria", 67.5f, 1.70f, 21));
		//PessoaDAO.insert(new Pessoa(1,"Pedro", 71.5f, 1.75f, 20));
		//PessoaDAO.update(new Pessoa(1,"Pedro Alcantara", 71.5f, 1.75f, 21));
		//PessoaDAO.delete(1);
		//JOptionPane.showMessageDialog(null, PessoaDAO.find(1));
		JOptionPane.showMessageDialog(null, PessoaDAO.getAll());
	}

}
