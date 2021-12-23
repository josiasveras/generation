package br.com.generation.poo;

/*
 * 6) Crie uma classe conta bancaria e apresente os atributos e métodos
      referentes esta classe, em seguida crie um objeto conta bancaria, defina
      as instancias deste objeto e apresente as informações deste objeto no
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
		System.out.println("Um depósito foi efetuado na conta...");
	}

}
