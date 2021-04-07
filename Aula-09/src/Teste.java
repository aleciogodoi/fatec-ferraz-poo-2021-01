import java.time.LocalDate;
import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		// Lista de Pessoas
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Alex",LocalDate.of(1980, 1, 20)));    // Uma pessoa
		pessoas.add(new Cliente(1,"Ana",LocalDate.of(1987, 5, 25)));  // Um cliente
		pessoas.add(new Funcionario("Maria",LocalDate.of(1987, 5, 25), 7654.21f));  // Um cliente
		for (Pessoa p: pessoas) {
			System.out.println(p);
		}
	}

}
