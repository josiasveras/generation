package br.com.generation.poo;

/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
	  esta classe, em seguida crie um objeto avião, defina as instancias deste
      objeto e apresente as informações deste objeto no console. 
*/

public class Aviao {

	String modelo;
	int capacidade;
	String cor;
	
	Aviao() {

	}
	
	void voar() {
		System.out.println("O avião está voando...");
	}
	
	void pousar() {
		System.out.println("O avião está pousando...");
	}
}
