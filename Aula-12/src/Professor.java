import javax.swing.JOptionPane;

public class Professor extends Pessoa implements ControleAcesso, CalculaBonus {

	public Professor(int id, String nome) {
		super(id, nome);
	}

	@Override
	public boolean login(String email) {
		JOptionPane.showMessageDialog(null, "Usuário Logado! " +"("+this.getNome()+")");
		return true;
	}

	@Override
	public void logout() {
		JOptionPane.showMessageDialog(null, "Logout Executado!");
	}

	@Override
	public double bonus(double salario) {
		return salario *.05;
	}

}
