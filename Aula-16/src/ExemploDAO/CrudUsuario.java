
package ExemploDAO;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CrudUsuario {
	public static void main(String[] args) {
		ArrayList<Usuario> usuarios;
		Usuario usuario;
		int opcao;
		do {
			opcao = menu();
			switch (opcao) {
			case 1:
				usuario = entradaDados();
				UsuarioDAO.insert(usuario);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, UsuarioDAO.find(entradaId()));
				break;
			case 3:
				usuarios = UsuarioDAO.find(entradaNome());
				imprimeDados(usuarios);
				break;
			case 4:
				usuarios = UsuarioDAO.getAll();
				imprimeDados(usuarios);
				break;
			case 5:
				usuario = UsuarioDAO.find(entradaId());
				usuario = entradaDados(usuario);
				UsuarioDAO.update(usuario);
				break;
			case 6:
				UsuarioDAO.delete(entradaId());
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

	public static Usuario entradaDados(Usuario usuario) {
		usuario.setNome(JOptionPane.showInputDialog("Nome:", usuario.getNome()));
		usuario.setEmail(JOptionPane.showInputDialog("Email:", usuario.getEmail()));
		usuario.setTelefone(JOptionPane.showInputDialog("Telefone:", usuario.getTelefone()));
		usuario.setEndereco(JOptionPane.showInputDialog("Endereço:", usuario.getEndereco()));
		return usuario;
	}
	
	public static int entradaId () {
		return Integer.valueOf(JOptionPane.showInputDialog("Id:"));
	}	
	
	public static String entradaNome () {
		return JOptionPane.showInputDialog("Nome:");
	}
	
	public static void imprimeDados(ArrayList<Usuario> usuarios) {
		String dados="";
		for(Usuario usuario: usuarios) {
			dados += usuario+"\n";
		}
		JOptionPane.showMessageDialog(null,dados);
	}
}
