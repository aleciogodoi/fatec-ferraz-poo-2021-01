package Exemplo_Abstract;

abstract class RoboAbstrato {
	private String nomeDoRobo;
	private int posicaoXAtual, posicaoYAtual;
	private int direcaoAtual;

	RoboAbstrato(String n, int px, int py, int d) {
		nomeDoRobo = n;
		posicaoXAtual = px;
		posicaoYAtual = py;
		direcaoAtual = d;
	}

	// Metodo abstrato
	public abstract void move(int passos);

	public void moveX(int passos) {
		posicaoXAtual += passos;
	}

	public void moveY(int passos) {
		posicaoYAtual += passos;
	}

	public void mudaDirecao(int novaDirecao) {
		direcaoAtual = novaDirecao;
	}

	public int qualDirecaoAtual() {
		return direcaoAtual;
	}

	@Override
	public String toString() {
		return "RoboAbstrato [nomeDoRobo=" + nomeDoRobo + ", posicaoXAtual=" + posicaoXAtual + ", posicaoYAtual="
				+ posicaoYAtual + ", direcaoAtual=" + direcaoAtual + "]";
	}

}