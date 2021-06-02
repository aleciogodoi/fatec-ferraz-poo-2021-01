import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PessoaCrud {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas;
		Pessoa pessoa;
		int opcao=0;
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				pessoa = entradaDados();
				PessoaDAO.insert(pessoa);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, PessoaDAO.find(entradaID()));
				break;
			case 3:
				pessoas = PessoaDAO.getAll();
				imprimeDados(pessoas);
				break;
			case 4:
				pessoa = PessoaDAO.find(entradaID());
				pessoa = entradaDados(pessoa);
				PessoaDAO.update(pessoa);
				break;
			case 5:
				PessoaDAO.delete(entradaID());
				break;
			}
		} while (opcao!=0);
	}
	
	public static int menu() {
		int opcao;
		String menu = "0 - Sair\n"
					+ "1 - Incluir\n"
					+ "2 - Pesquisar por ID\n"
					+ "3 - Lista\n"
					+ "4 - Alterar\n"
					+ "5 - Excluir\n";
		opcao = Integer.valueOf(JOptionPane.showInputDialog(menu));
		return opcao;
	}
	
	public static Pessoa entradaDados() {
		Pessoa pessoa = new Pessoa();
		pessoa.setIdPessoa(Integer.valueOf(JOptionPane.showInputDialog("Id:")));
		pessoa.setNome(JOptionPane.showInputDialog("Nome:"));
		pessoa.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:")));
		pessoa.setAltura(Float.valueOf(JOptionPane.showInputDialog("Altura:")));
		pessoa.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Idade:")));
		return pessoa;
	}	
	
	public static Pessoa entradaDados(Pessoa pessoa) {
		pessoa.setNome(JOptionPane.showInputDialog("Nome:", pessoa.getNome()));
		pessoa.setPeso(Float.valueOf(JOptionPane.showInputDialog("Peso:", pessoa.getPeso())));
		pessoa.setAltura(Float.valueOf(JOptionPane.showInputDialog("Altura:", pessoa.getAltura())));
		pessoa.setIdade(Integer.valueOf(JOptionPane.showInputDialog("Idade:", pessoa.getIdade())));
		return pessoa;
	}
	
	public static int entradaID() {
		return Integer.valueOf(JOptionPane.showInputDialog("Id:"));
	}
	
	public static void imprimeDados(ArrayList<Pessoa> pessoas) {
		String dados="";
		for (Pessoa pessoa: pessoas)
			dados += pessoa+"\n";
		JOptionPane.showMessageDialog(null, dados);
	}

}
