package ControleRemoto;

public class Televisao implements ControleRemoto {

	private String marca;
	private String modelo;
	private boolean ligada;
	private int nivelVolume;
	private int canal;

	public Televisao(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		ligada = false;
		canal = 0;
	}

	public void ligar() {
		ligada = true;
	}

	public void desligar() {
		ligada = false;
	}

	public void aumentarVolume() {
		nivelVolume++;
	}

	public void diminuirVolume() {
		nivelVolume--;
	}

	public void avancar() {
		canal++;
	}

	public void retroceder() {
		canal--;
	}

	public String toString() {
		String estado = ligada ? "ligada" : "desligada";
		return "Televisao: " + marca + " " + modelo + " " + estado;
	}
}
