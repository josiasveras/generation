package br.com.generation.vetoresematrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exer01vetor {
	
	/*
	 * 1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
		  atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
	*/

	public static void main(String[] args) {
		// Declara��o das vari�veis
		double notas[] = new double[5]; // Declara��o vari�vel do tipo vetor.
		double maiorPontuacao = 0.0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d� pontua��o: \n", i+1);
			notas[i] = sc.nextDouble();
			
			//PROCESSAMENTO
			if(notas[i] > maiorPontuacao) {
				maiorPontuacao = notas[i];
			}
		}
		
		//SA�DA
		System.out.println("");
		System.out.printf("A maior pontua��o �: %.2f", maiorPontuacao);
		
		sc.close();
	}
}
