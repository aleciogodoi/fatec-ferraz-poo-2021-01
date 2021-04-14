import java.util.ArrayList;

public class CadastroPessoa {
	
	private static int qtdePessoas;
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public static void cadastro(Pessoa pessoa) {
		qtdePessoas++;
		pessoas.add(pessoa);
	}
	
	public static void imprime() {
		for (Pessoa p: pessoas) {
			p.imprimeDados();
		}
		System.out.println("Qtd. pessoas cadastradas: "+qtdePessoas);
	}
}
