package br.com.generation.poo;

/*
 * 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
      referentes esta classe, em seguida crie um objeto produto eletrônico,
      defina as instancias deste objeto e apresente as informações deste objeto
      no console.
*/

public class Produto {

	String nome;
	double preco;
	int quantidade;
	
	Produto() {

	}
	
	void compra() {
		System.out.println("O produto está sendo comprado...");
	}
}
