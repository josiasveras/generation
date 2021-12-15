package br.com.generation.polimorfismoeheranca;

import br.com.generation.poo.Cliente;

public class TestaAnimais {

	public static void main(String[] args) {
		//Testa Cachorro
		System.out.println("--------------------------------------------------------TESTA CACHORRO--------------------------------------------------------");
		Cachorro dog1 = new Cachorro();
		Cachorro dog2 = new Cachorro();
		
		dog1.nome = "Lassie";
		dog1.idade = 7;
		
		dog2.nome = "Marley";
		dog2.idade = 10;
		
		System.out.println("Nome: " + dog1.nome);
		
		dog1.emitirSom();
		
		System.out.println("Nome: " + dog2.nome);
		
		dog2.correr();
		
		System.out.println();
		
		//Testa Cavalo
		System.out.println("--------------------------------------------------------TESTA CAVALO--------------------------------------------------------");
		Cavalo cav1 = new Cavalo();
		Cavalo cav2 = new Cavalo();
		
		cav1.nome = "Cavalo de Fogo";
		cav1.idade = 20;
		
		cav2.nome = "Spirit";
		cav2.idade = 25;
		
		System.out.println("Nome: " + cav2.nome);
		
		cav2.emitirSom();
		
		System.out.println("Nome: " + cav1.nome);
		
		cav1.correr();
		
		System.out.println();
		
		//Testa Preguica
		System.out.println("--------------------------------------------------------TESTA PREGUIÇA--------------------------------------------------------");
		Preguica pre1 = new Preguica();
		Preguica pre2 = new Preguica();
		
		pre1.nome = "Preguiça-de-coleira";
		pre1.idade = 8;
		
		pre2.nome = "Preguiça-real";
		pre2.idade = 5;
		
		System.out.println("Nome: " + pre1.nome);
		
		pre1.emitirSom();
		
		System.out.println("Nome: " + pre2.nome);
		
		pre2.subirArvore();

	}

}
