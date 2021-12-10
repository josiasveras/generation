package br.com.generation.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {
	
	/*
	 * 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		  número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
          ímpar exiba o número elevado ao quadrado.
	*/

	public static void main(String[] args) {
		// Declaração das variáveis
		int num;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		
		//PROCESSAMENTO
		if (num % 2 == 0.0) {
			//SAÍDA
			System.out.printf("%d é PAR %n", num);
			System.out.printf("A raiz quadrada de %d é: %.2f ", num, Math.sqrt(num));
		} else {
			//SAÍDA
			System.out.printf("%d é ÍMPAR %n", num);
			System.out.printf("%d elevado ao quadrado é: %.2f ", num, Math.pow(num, 2));
		}
		
		sc.close();
	}

}
