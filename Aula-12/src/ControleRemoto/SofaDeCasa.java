package ControleRemoto;

public class SofaDeCasa {
	public static void main(String[] args) {

		// Criando os objetos
		ControleRemoto philco = new Televisao("Philco", "MultiVision");
		DVDPlayer dvdGradiente = new DVDPlayer("Gradiente", "D22");
		ArCondicionado ar1 = new ArCondicionado();

		philco.ligar();
		dvdGradiente.ligar();
		ar1.ligar();

		System.out.println("Aparelhos iniciais:");
		System.out.println(philco);
		System.out.println(dvdGradiente);
		System.out.println(ar1);

		dvdGradiente.avancar();
		dvdGradiente.desligar();
		dvdGradiente.abrirCombo();
		System.out.println(dvdGradiente);

		ar1.avancar();
		ar1.avancar();
		ar1.avancar();
	
		System.out.println("");
		System.out.println("Aparelhos após desligar a TV e abrir o combo do DVD:");
		System.out.println(philco);
		System.out.println(dvdGradiente);
		System.out.println(ar1);

		ControleRemoto alibaba =new Abajur();
		alibaba.ligar();
		System.out.println(alibaba);
		alibaba.desligar();
		System.out.println(alibaba);
		
	}
}

