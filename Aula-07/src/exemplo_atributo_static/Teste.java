package exemplo_atributo_static;

public class Teste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(5, "André");
		System.out.println("Total pessoas: "+Pessoa.getTotalPessoas());
		Pessoa p2 = new Pessoa(10, "Ana");
		System.out.println("Total pessoas: "+Pessoa.getTotalPessoas());
	}

}
