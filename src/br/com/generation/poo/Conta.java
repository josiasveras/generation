package br.com.generation.poo;

/*
 * 6) Crie uma classe conta bancaria e apresente os atributos e m�todos
      referentes esta classe, em seguida crie um objeto conta bancaria, defina
      as instancias deste objeto e apresente as informa��es deste objeto no
      console. 
*/

public class Conta {
	
	String titular;
	String tipo;
	double saldo;
	
	
	Conta() {

	}
	
	void saque() {
		System.out.println("Um saque foi efetuado na conta...");
	}
	
	void deposito() {
		System.out.println("Um dep�sito foi efetuado na conta...");
	}

}
