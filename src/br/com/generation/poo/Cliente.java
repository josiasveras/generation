package br.com.generation.poo;

/*
 * 1) Crie uma classe cliente e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.
*/

public class Cliente {
	
	// Declara��o dos atributos da classe
	String nome;
	int idade;
	String dtNasc;
	String genero;
	
	void comprar() {
		System.out.println("Cliente est� comprando...");
	}
	
	void consumir() {
		System.out.println("Cliente est� consumindo um produto...");
	}
}
