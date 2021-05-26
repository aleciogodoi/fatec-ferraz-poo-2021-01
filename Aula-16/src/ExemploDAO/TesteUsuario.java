package ExemploDAO;

public class TesteUsuario {

	public static void main(String[] args) {
		UsuarioDAO.insert(new Usuario(1,"Pedro","pedro@gmail.com","11 96656-0001","Rua das Couves, 125 - Centro"));
		UsuarioDAO.insert(new Usuario(2,"Paula","paula@gmail.com","11 98887-0001","Rua das Couves, 100 - Centro"));
		UsuarioDAO.insert(new Usuario(3,"Guilherme","guilherme@gmail.com","11 9888-0002","Rua das Couves, 200 - Centro"));
		System.out.println(UsuarioDAO.find(1));

		for (Usuario usuario: UsuarioDAO.find("P%")) {
			System.out.println(usuario);
		}
		for (Usuario usuario: UsuarioDAO.getAll()) {
			System.out.println(usuario);
		}
		UsuarioDAO.update(new Usuario(3,"Guilherme Silva de Oliveira","guilherme@gmail.com","11 99777-0002","Rua das Crias, 500 - Centro"));
		System.out.println(UsuarioDAO.find(3));
		
		UsuarioDAO.delete(3);
		for (Usuario usuario: UsuarioDAO.getAll()) {
			System.out.println(usuario);
		}
	}
}
