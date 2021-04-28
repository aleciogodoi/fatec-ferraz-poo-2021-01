
public interface ControleAcesso {
	static final int NUMERO_TENTATIVAS = 3;
	
	boolean login(String email);
	void logout();
}
