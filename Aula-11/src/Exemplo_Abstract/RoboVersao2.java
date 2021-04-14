package Exemplo_Abstract;

public class RoboVersao2 extends RoboAbstrato{

	RoboVersao2(String n, int px, int py, int d) {
		super(n, px, py, d);
	}

	@Override
	public void move(int passos) {
		switch (qualDirecaoAtual()) {
		case 0:
			moveY(+passos);
			break;
		case 90:
			moveX(+passos);
			break;
		case 180:
			moveY(-passos);
			break;
		case 270:
			moveX(-passos);
			break;
		}
	}

}
