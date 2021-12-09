package br.com.generation.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {
	
	/*
	 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		  percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		  Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		  escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
		  consumidor.
	*/

	public static void main(String[] args) {
		// Declara��o de vari�veis
		double custoFabrica, percentagemDistribuidor, impostos, custoConsumidor;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite o custo de f�brica do carro: ");
		custoFabrica = sc.nextDouble();
		
		//PROCESSAMENTO
		percentagemDistribuidor = custoFabrica * 0.28;
		impostos = custoFabrica * 0.45;
		custoConsumidor = custoFabrica + percentagemDistribuidor + impostos;
		
		//SA�DA
		System.out.printf("O custo total do carro �: %.2f", custoConsumidor);
										
		sc.close();
	}

}
