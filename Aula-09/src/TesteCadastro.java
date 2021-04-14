import java.time.LocalDate;

public class TesteCadastro {

	public static void main(String[] args) {
		
		CadastroPessoa.cadastro(new Pessoa("Alex",LocalDate.of(1980, 1, 20)));    // Uma pessoa
		CadastroPessoa.cadastro(new Cliente(1,"Ana",LocalDate.of(1987, 5, 25)));  // Um cliente
		CadastroPessoa.cadastro(new Funcionario("Maria",LocalDate.of(1987, 5, 25), 7654.21f));  // Um funcionario
		CadastroPessoa.cadastro(new Gerente("Claudia",LocalDate.of(1982, 7, 19), 10654.21f,"TI")); // Um Gerente
		
		CadastroPessoa.imprime();

	}

}
