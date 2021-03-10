public class TesteAluno {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Pedro","1234", 5, 6, 7);
		System.out.println(aluno1);
		System.out.println("Média: "+aluno1.calcularMedia());
		System.out.println("Média Final: "+aluno1.calcularMediaFinal());
	}
}
