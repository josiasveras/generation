package br.com.generation.condicionais;

import java.util.Scanner;

public class Exer02 {
	
	/*
	 * 2- Faça um programa que entre com três números e coloque em ordem crescente. 
	*/

	public static void main(String[] args) {
		// Declaração de variáveis
				int n1, n2, n3;
			
				Scanner sc = new Scanner(System.in);

				//ENTRADA
				System.out.println("Digite o 1º número: ");
				n1 = sc.nextInt();
				
				System.out.println("Digite o 2º número: ");
				n2 = sc.nextInt();
				
				System.out.println("Digite o 3º número: ");
				n3 = sc.nextInt();
				
				//PROCESSAMENTO
				if (n1 <= n2 && n1 <= n3) {
					//SAÍDA
					System.out.printf("A ordem crescente é: %d %d %d %n", n1 , n2 , n3);
				} else if (n1 <= n3 && n3 <= n2) {
					//SAÍDA
					System.out.printf("A ordem crescente é: %d %d %d %n", n1, n3, n2);
				} else if (n2 <= n1 && n1 <= n3) {
					//SAÍDA
					System.out.printf("A ordem crescente é: %d %d %d %n", n2, n1, n3);
				} else if (n2 <= n3 && n3 <= n1) {
					//SAÍDA
					System.out.printf("A ordem crescente é: %d %d %d %n", n2, n3, n1);
				} else if (n3 <= n1 && n1 <= n2) {
					//SAÍDA
					System.out.printf("A ordem crescente é: %d %d %d %n", n3, n1, n2);
				} else {
					//SAÍDA
					System.out.printf("A ordem crescente é: %d %d %d %n", n3, n2, n1);
				}
				
				sc.close();
	}

}
