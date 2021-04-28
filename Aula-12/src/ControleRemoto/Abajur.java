package ControleRemoto;

public class Abajur implements ControleRemoto {
	private boolean chave;

	Abajur() {
		chave = false;
	}

	public void ligar() {
		chave = true;
	}

	public void desligar() {
		chave = false;
	}

	public String toString() {
		return "Abajour " + (chave ? "Aceso" : "Apagado");
	}

	@Override
	public void aumentarVolume() {
	}

	@Override
	public void diminuirVolume() {
	}

	@Override
	public void avancar() {
	}

	@Override
	public void retroceder() {
	}
}
