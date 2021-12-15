package br.com.generation.poo;

/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
*/

public class Cliente {
	
	// Declaração dos atributos da classe
	String nome;
	int idade;
	String dtNasc;
	String genero;
	
	void comprar() {
		System.out.println("Cliente está comprando...");
	}
	
	void consumir() {
		System.out.println("Cliente está consumindo um produto...");
	}
}
