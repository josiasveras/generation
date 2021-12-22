package br.com.generation.repeticoes;

import java.util.Scanner;

public class Exer06dowhile {

	/*
	 * 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
          final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
          0(zero).(DO...WHILE) 
	 */

	public static void main(String[] args) {
		double n, soma = 0.0, media = 0.0;
		int contMult3 = 0;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("Digite um n�mero: ");
			n = sc.nextInt();
			if (n % 3 == 0 && n != 0) {
				contMult3++;
				soma = soma + n;
				media = soma / contMult3;
			}
			
		} while (n != 0);

		System.out.println();
		System.out.println("A m�dia do(s) n�mero(s) m�ltiplo de 3 digitados �: " + media);

	}

}
