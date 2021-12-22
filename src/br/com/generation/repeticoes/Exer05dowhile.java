package br.com.generation.repeticoes;

import java.util.Scanner;

public class Exer05dowhile {
	
	/*
	 * 5- Crie um programa que leia um número do teclado até que encontre um
		  número igual a zero. No final, mostre a soma dos números
          digitados.(DO...WHILE) 
	*/

	public static void main(String[] args) {
		
		int n, soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			n = sc.nextInt();
			soma = soma + n;
		} while (n != 0);
		
		System.out.println();
		System.out.println("A soma dos números digitados é: " + soma);
		System.out.println();
		System.out.println("Programa encerrado!!");

	}

}
