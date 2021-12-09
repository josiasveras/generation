package br.com.generation.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {
	
	/*
	 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	*/

	public static void main(String[] args) {
		// Declara��o de vari�veis
		int n1, n2, n3, maior;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite o 1� n�mero: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		n3 = sc.nextInt();
		
		//PROCESSAMENTO
		if (n1 > n2 && n1 > n3) {
			//SA�DA
			System.out.println("O maior n�mero �: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			//SA�DA
			System.out.println("O maior n�mero �: " + n2);
		} else {
			//SA�DA
			System.out.println("O maior n�mero �: " + n3);
		}
		
		sc.close();
	}
}
