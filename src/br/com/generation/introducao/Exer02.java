package br.com.generation.introducao;

import java.util.Scanner;

public class Exer02 {
	
	/*
	 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
       expressa em anos, meses e dias.
	*/

	public static void main(String[] args) {
		// Declaração de variáveis
				int anos, meses = 0, dias = 0, totalDias;
				
				Scanner sc = new Scanner(System.in);
				
				// Base: 11262
				//ENTRADA
				System.out.println("Digite sua idade total em dias: ");
				totalDias = sc.nextInt();
				
				//PROCESSAMENTO
				anos = totalDias / 365;
				meses = (totalDias % 365) / 30;
				dias = (totalDias % 365) % 30;
				
				//SAÍDA
				System.out.printf("Sua idade total é: %d anos %d meses e %d dias", anos, meses, dias);

				sc.close();

	}

}
