package br.com.generation.repeticoes;

import java.util.Iterator;
import java.util.Scanner;

public class Exer02for {
	
	/*
	 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	*/

	public static void main(String[] args) {
		// Declaração das variáveis
		int num, i, contPar = 0, contImpar = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (i = 1;  i <= 10; i++) {
			//ENTRADA
			System.out.printf("Digite o %dº número: ", i);
			num = sc.nextInt();
			//PROCESSAMENTO
			if (num % 2 == 0) {
				contPar = contPar + 1;
			} else {
				contImpar = contImpar + 1;
			}
		}
		
		//SAÍDA
		System.out.println();
		System.out.printf("Quantidade de número(s) par(es): %d %n", contPar);
		System.out.printf("Quantidade de número(s) ímpar(es): %d", contImpar);
		
		sc.close();
	}

}
