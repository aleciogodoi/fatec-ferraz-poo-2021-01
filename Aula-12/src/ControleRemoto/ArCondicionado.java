package ControleRemoto;

public class ArCondicionado implements ControleRemoto {
	private int temperatura;
	private boolean estado;

	ArCondicionado() {
		this.estado = false;
		this.temperatura = 25;
	}

	@Override
	public void ligar() {
		this.estado = true;
	}

	@Override
	public void desligar() {
		this.estado = false;
	}

	@Override
	public void aumentarVolume() {

	}

	@Override
	public void diminuirVolume() {

	}

	@Override
	public void avancar() {
		temperatura++;
	}

	@Override
	public void retroceder() {
		temperatura--;
	}

	@Override
	public String toString() {
		return "ArCondicionado [temperatura=" + temperatura + ", estado=" + (estado ? "ligado" : "desligado") + "]";
	}

}
