
public class Teste {

	public static void main(String[] args) {
		Pessoa ana = new Pessoa("Ana Maria", 21, 50, 1.62f );
		System.out.println(ana);
		
		Aluno luis = new Aluno("Luis Henrique", 22, 60, 1.65f, "1234-X", "Fatec Ferraz");
		System.out.println(luis.toString());
	}

}
