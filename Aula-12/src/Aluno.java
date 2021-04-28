import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa implements ControleAcesso {

	private ArrayList<String> disciplinas;
	public ArrayList<String> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<String> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public Aluno(int id, String nome, ArrayList<String> disciplinas) {
		super(id, nome);
		this.disciplinas = disciplinas;
	}
	@Override
	public String toString() {
		return super.toString()+" Aluno [disciplinas=" + disciplinas + "]";
	}
	
	@Override
	public boolean login(String email) {
		String senhaAux = "123";
		int contador = 0;
		while (contador < this.NUMERO_TENTATIVAS) {
			contador++;
			if (JOptionPane.showInputDialog("Entre com a senha:").equals(senhaAux)) {
				JOptionPane.showMessageDialog(null, "Usuário Logado!");
				return true;
			}
			JOptionPane.showMessageDialog(null, "Senha Incorreta!");
		}
		JOptionPane.showMessageDialog(null, "Nr. de tentativas esgotado!");
		return false;
	}
	@Override
	public void logout() {
		JOptionPane.showMessageDialog(null, "Logout Executado!");
	}
		
}
