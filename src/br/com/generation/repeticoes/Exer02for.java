package br.com.generation.repeticoes;

import java.util.Iterator;
import java.util.Scanner;

public class Exer02for {
	
	/*
	 * 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
	*/

	public static void main(String[] args) {
		// Declara��o das vari�veis
		int num, i, contPar = 0, contImpar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (i = 1;  i <= 10; i++) {
			//ENTRADA
			System.out.printf("Digite o %d� n�mero: ", i);
			num = sc.nextInt();
			//PROCESSAMENTO
			if (num % 2 == 0) {
				contPar = contPar + 1;
			} else {
				contImpar = contImpar + 1;
			}
		}
		
		//SA�DA
		System.out.println();
		System.out.printf("Quantidade de n�mero(s) par(es): %d %n", contPar);
		System.out.printf("Quantidade de n�mero(s) �mpar(es): %d", contImpar);
		
		sc.close();
	}

}
