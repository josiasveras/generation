package br.com.generation.poo;

public class Paciente {
	
	String nome;
	String hospital;
	int numQuarto;
	
	Paciente() {

	}
	
	void medicado() {
		System.out.println("O paciente foi medicado...");
	}
	
	void alta() {
		System.out.println("O paciente recebeu alta...");
	}

}
