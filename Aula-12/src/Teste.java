import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<String> disciplinas = new ArrayList<String>();
		disciplinas.add("Matem�tica I");
		disciplinas.add("Ingl�s");
		disciplinas.add("Contabilidade");
		disciplinas.add("Portugu�s");
		
		Aluno joao = new Aluno(1, "Jo�o da Silva", disciplinas);
		System.out.println(joao);
		joao.login("joao@gmail.com");
		
		Professor ana = new Professor(1,"Ana Carolina");
		System.out.println(ana);
		ana.login("ana@gmail.com");
	}

}
