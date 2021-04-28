package ControleRemoto;

public class DVDPlayer implements ControleRemoto {

	private String marca;
	private String modelo;
	private boolean ligado;
	private boolean open;
	private int capitulo;

	public DVDPlayer(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		ligado = false;
		capitulo = 1;
	}

	public void ligar() {
		ligado = true;
	}

	public void desligar() {
		ligado = false;
	}

	public void aumentarVolume() {
	}

	public void diminuirVolume() {
	}

	public void avancar() {
		capitulo++;
	}

	public void retroceder() {
		capitulo--;
	}

	public void abrirCombo() {
		open = true;
	}

	public void fecharCombo() {
		open = false;
	}

	public String toString() {
		String estado = ligado ? "ligado" : "desligado";
		String combo = open ? "combo aberto" : "combo fechado";
		return "DVDPlayer " + marca + " " + modelo + "\n " + estado + "\nbandeja " + combo + "\n capitulo:" + capitulo;
	}
}
