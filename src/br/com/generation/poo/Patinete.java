package br.com.generation.poo;

/*
 *  5) Crie uma classe patinete e apresente os atributos e m�todos referentes
       esta classe, em seguida crie um objeto patinete, defina as instancias deste
       objeto e apresente as informa��es deste objeto no console.
*/

public class Patinete {
	
	String modelo;
	String cor;
	double preco;
	
	Patinete() {

	}
	
	void dirigir() {
		System.out.println("O patinete est� sendo dirigido...");
	}
	
	void parar() {
		System.out.println("O patinete est� parado...");
	}
}
