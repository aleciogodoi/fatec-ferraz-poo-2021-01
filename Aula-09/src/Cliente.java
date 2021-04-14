import java.time.LocalDate;

public class Cliente extends Pessoa {
	// Atributos
	private int codigo;
	
	// Construtores
	Cliente(){
	}
	
	Cliente(int codigo, String nome, LocalDate nascimento){
		super(nome, nascimento); // construtor classe mãe/Pessoa
		this.codigo = codigo;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+" Cliente [codigo=" + codigo + "]";
	}


}
