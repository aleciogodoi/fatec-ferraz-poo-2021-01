package exemplo_arraylist;

import java.util.ArrayList;

public class ExemploArrayList {

	public static void main(String[] args) {
		// Criando...
		ArrayList<String> carros = new ArrayList<String>();

		// Adicionando Itens
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("Mazda");
		System.out.println(carros);

		// Acessando e alterando um item
		System.out.println(carros.get(0));
		carros.set(0, "Ferrari");
		System.out.println(carros);

		// Procurando um item
		System.out.println("Procurando Mazda: " + carros.indexOf("Mazda"));
		System.out.println("Procurando Mazdax: " + carros.indexOf("Mazdax"));


		// Tamanho do ArrayList
		System.out.println("Tamanho do ArrayList: "+carros.size());

		// Loop pelo ArrayList
		for (int i = 0; i < carros.size(); i++) {
			if (i % 2== 0)
				System.out.println(carros.get(i));
		}
		
		for (String c: carros) {
			System.out.println(c);
		}
		
		// Removendo um item
		carros.remove(0);
		System.out.println(carros);

		
		// Removendo todos os itens
		carros.clear();
		System.out.println(carros);



	}

}
