public class ContaCorrente {
	final int LIMITE_MIN_CHEQUES = 5;
	final int NUM_CHEQUES_TALAO = 20;
	private static int totalContasCorrentes = 0;
	private String nr;
	private String nome;
	private float saldo;
	
	public ContaCorrente() {
		totalContasCorrentes++;
	}

	public ContaCorrente(String nr, String nome, float saldo) {
		this();
		this.nr = nr;
		this.nome = nome;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [LIMITE_MIN_CHEQUES=" + LIMITE_MIN_CHEQUES + ", NUM_CHEQUES_TALAO=" + NUM_CHEQUES_TALAO
				+ ", Contas Correntes=" + totalContasCorrentes + ", nr=" + nr + ", nome=" + nome + ", saldo=" + saldo + "]";
	}
	
	public static int getTotalContasCorrentes() {
		return totalContasCorrentes;
	}
}
