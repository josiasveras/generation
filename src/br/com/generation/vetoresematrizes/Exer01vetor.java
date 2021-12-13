package br.com.generation.vetoresematrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exer01vetor {
	
	/*
	 * 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		  atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	*/

	public static void main(String[] args) {
		// Declaração das variáveis
		double notas[] = new double[5]; // Declaração variável do tipo vetor.
		double maiorPontuacao = 0.0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dª pontuação: \n", i+1);
			notas[i] = sc.nextDouble();
			
			//PROCESSAMENTO
			if(notas[i] > maiorPontuacao) {
				maiorPontuacao = notas[i];
			}
		}
		
		//SAÍDA
		System.out.println("");
		System.out.printf("A maior pontuação é: %.2f", maiorPontuacao);
		
		sc.close();
	}
}
