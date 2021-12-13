package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class Exer02vetor {
	
	/*
	 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		  que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		  imprima a média aritmética dos lançamentos, contabilize e apresente também
		  quantas foram as ocorrências da maior pontuação. 
	*/

	public static void main(String[] args) {
		// Declaração das variáveis
		int dados[] = new int[10]; // Declaração variável do tipo vetor.
		int maiorPontuacao = 0, somaDados = 0, contMaiorPontuacao = 0;
		double media = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		for(int i = 0; i < dados.length; i++) {
			System.out.printf("Digite o %dº valor do dado: \n", i+1);
			dados[i] = sc.nextInt();
			
			//PROCESSAMENTO
			somaDados = somaDados + dados[i];
			
			if(dados[i] > maiorPontuacao) {
				contMaiorPontuacao = 0;
				maiorPontuacao = dados[i];
				contMaiorPontuacao = 1;
			}
			
			else if(dados[i] == maiorPontuacao) {
				contMaiorPontuacao = contMaiorPontuacao + 1;
			}
			
		}
		
		media = somaDados / dados.length;
		
		//SAÍDA
		System.out.println("");
		System.out.printf("A maior pontuação é: %d \n", maiorPontuacao);
		System.out.printf("A média é: %.2f \n", media);
		System.out.printf("A contagem de ocorrências da maior pontuação é: %d \n", contMaiorPontuacao);
		
		sc.close();
	}

}
