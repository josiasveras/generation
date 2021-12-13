package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class Exer02vetor {
	
	/*
	 * 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		  que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		  imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		  quantas foram as ocorr�ncias da maior pontua��o. 
	*/

	public static void main(String[] args) {
		// Declara��o das vari�veis
		int dados[] = new int[10]; // Declara��o vari�vel do tipo vetor.
		int maiorPontuacao = 0, somaDados = 0, contMaiorPontuacao = 0;
		double media = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		for(int i = 0; i < dados.length; i++) {
			System.out.printf("Digite o %d� valor do dado: \n", i+1);
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
		
		//SA�DA
		System.out.println("");
		System.out.printf("A maior pontua��o �: %d \n", maiorPontuacao);
		System.out.printf("A m�dia �: %.2f \n", media);
		System.out.printf("A contagem de ocorr�ncias da maior pontua��o �: %d \n", contMaiorPontuacao);
		
		sc.close();
	}

}
