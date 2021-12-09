package br.com.generation.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {
	
	/*
	 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
	*/

	public static void main(String[] args) {
		// Declaração de variáveis
		int n1, n2, n3, maior;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite o 1º número: ");
		n1 = sc.nextInt();
		
		System.out.println("Digite o 2º número: ");
		n2 = sc.nextInt();
		
		System.out.println("Digite o 3º número: ");
		n3 = sc.nextInt();
		
		//PROCESSAMENTO
		if (n1 > n2 && n1 > n3) {
			//SAÍDA
			System.out.println("O maior número é: " + n1);
		} else if (n2 > n1 && n2 > n3) {
			//SAÍDA
			System.out.println("O maior número é: " + n2);
		} else {
			//SAÍDA
			System.out.println("O maior número é: " + n3);
		}
		
		sc.close();
	}
}
