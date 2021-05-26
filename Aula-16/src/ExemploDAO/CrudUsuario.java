package ExemploDAO;

import javax.swing.JOptionPane;

public class CrudUsuario {

	
	public static void main(String[] args) {
		int opcao;
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				Usuario usuario = entradaDados();
				UsuarioDAO.insert(usuario);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			}
			
		} while(opcao!=0);
	}

	public static int menu() {
		int opcao;
		String menu = "1 - Inserir\n"
					+ "2 - Pesquisar por Id\n"
					+ "3 - Pesquisar por Nome\n"
					+ "4 - Lista\n"
					+ "5 - Alterar\n"
					+ "6 - Excluir\n"
					+ "0 - Sair";
		opcao = Integer.valueOf(JOptionPane.showInputDialog(menu));
		return opcao;
	}
	
	public static Usuario entradaDados() {
		Usuario usuario = new Usuario(); 
		usuario.setIdUsuario(Integer.valueOf(JOptionPane.showInputDialog("Id:")));
		usuario.setNome(JOptionPane.showInputDialog("Nome:"));
		usuario.setEmail(JOptionPane.showInputDialog("Email:"));
		usuario.setTelefone(JOptionPane.showInputDialog("Telefone:"));
		usuario.setEndereco(JOptionPane.showInputDialog("Endereço:"));
		return usuario;
	}

}
