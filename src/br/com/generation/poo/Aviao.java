package br.com.generation.poo;

/*
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
	  esta classe, em seguida crie um objeto avi�o, defina as instancias deste
      objeto e apresente as informa��es deste objeto no console. 
*/

public class Aviao {

	String modelo;
	int capacidade;
	String cor;
	
	Aviao() {

	}
	
	void voar() {
		System.out.println("O avi�o est� voando...");
	}
	
	void pousar() {
		System.out.println("O avi�o est� pousando...");
	}
}
