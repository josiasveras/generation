package br.com.generation.introducao;

import java.util.Scanner;

public class Exer01 {
	
	/*
	 *1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
	     dias e mostre-a expressa apenas em dias. 
	*/

	public static void main(String[] args) {
		// Declara��o de vari�veis
		int anos, meses, dias, totalDias;
		
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite sua idade em anos: ");
		anos = sc.nextInt();
		
		System.out.println("Digite sua idade em meses: ");
		meses = sc.nextInt();
		
		System.out.println("Digite sua idade em dias: ");
		dias = sc.nextInt();
		
		//PROCESSAMENTO
		totalDias = (anos * 365) + (meses * 30) + dias;
		
		//SA�DA
		System.out.printf("Sua idade total em dias �: %d", totalDias);

	}

}
