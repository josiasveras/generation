package br.com.generation.poo;

/*
 * 3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
      referentes esta classe, em seguida crie um objeto produto eletr�nico,
      defina as instancias deste objeto e apresente as informa��es deste objeto
      no console.
*/

public class Produto {

	String nome;
	double preco;
	int quantidade;
	
	Produto() {

	}
	
	void compra() {
		System.out.println("O produto est� sendo comprado...");
	}
}
