package br.com.generation.condicionais;

import java.util.Scanner;

public class Exer02 {
	
	/*
	 * 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente. 
	*/

	public static void main(String[] args) {
		// Declara��o de vari�veis
				int n1, n2, n3;
			
				Scanner sc = new Scanner(System.in);

				//ENTRADA
				System.out.println("Digite o 1� n�mero: ");
				n1 = sc.nextInt();
				
				System.out.println("Digite o 2� n�mero: ");
				n2 = sc.nextInt();
				
				System.out.println("Digite o 3� n�mero: ");
				n3 = sc.nextInt();
				
				//PROCESSAMENTO
				if (n1 <= n2 && n1 <= n3) {
					//SA�DA
					System.out.printf("A ordem crescente �: %d %d %d %n", n1 , n2 , n3);
				} else if (n1 <= n3 && n3 <= n2) {
					//SA�DA
					System.out.printf("A ordem crescente �: %d %d %d %n", n1, n3, n2);
				} else if (n2 <= n1 && n1 <= n3) {
					//SA�DA
					System.out.printf("A ordem crescente �: %d %d %d %n", n2, n1, n3);
				} else if (n2 <= n3 && n3 <= n1) {
					//SA�DA
					System.out.printf("A ordem crescente �: %d %d %d %n", n2, n3, n1);
				} else if (n3 <= n1 && n1 <= n2) {
					//SA�DA
					System.out.printf("A ordem crescente �: %d %d %d %n", n3, n1, n2);
				} else {
					//SA�DA
					System.out.printf("A ordem crescente �: %d %d %d %n", n3, n2, n1);
				}
				
				sc.close();
	}

}
