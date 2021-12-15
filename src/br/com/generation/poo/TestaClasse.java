package br.com.generation.poo;

public class TestaClasse {

	public static void main(String[] args) {
		
		//Testa Cliente
		Cliente c1 = new Cliente("Paulo Santos", 30, "25-12-1991", "masculino");
		Cliente c2 = new Cliente("Janaina Oliveira", 25, "08-06-1995", "feminino");
		
		System.out.println("--------------------------------------------------------TESTA CLIENTE--------------------------------------------------------");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("O nome do cliente é: " + c1.getNome());
		System.out.println("O nome da cliente é: " + c2.getNome());
		
		System.out.println();
		
		//Testa Aviao
		Aviao av1 = new Aviao();
		Aviao av2 = new Aviao();
		Aviao av3 = new Aviao();
		
		System.out.println("--------------------------------------------------------TESTA AVIAO--------------------------------------------------------");
		
		av1.modelo = "A350 XWB";
		av1.capacidade = 270;
		av1.cor = "branca";
		
		av2.modelo = "Airbus A320";
		av2.capacidade = 132;
		av2.cor = "cinza";
		
		av3.modelo = "Boeing 787";
		av3.capacidade = 242;
		av3.cor = "azul e branca";
		
		System.out.println("O modelo é: " + av1.modelo + ". A capacidade de passageiros é: " + av1.capacidade + ". A cor é: " + av1.cor);
		av1.voar();
		av1.pousar();
		
		System.out.println();
		
		System.out.println("O modelo é: " + av2.modelo + ". A capacidade de passageiros é: " + av2.capacidade + ". A cor é: " + av2.cor);
		av1.voar();
		av1.pousar();

		System.out.println();
		
		System.out.println("O modelo é: " + av3.modelo + ". A capacidade de passageiros é: " + av3.capacidade + ". A cor é: " + av3.cor);
		av1.voar();
		av1.pousar();
	}

}
