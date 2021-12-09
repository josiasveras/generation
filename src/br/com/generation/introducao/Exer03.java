package br.com.generation.introducao;

import java.util.Scanner;

public class Exer03 {
	
	/*
	 * 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
       expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	*/

	public static void main(String[] args) {
		// Declaração de variáveis
		int horas, minutos = 0, segundos = 0, totalsegundos;
		
		Scanner sc = new Scanner(System.in);
		
		// Base: 7200
		//ENTRADA
		System.out.println("Digite a duração total do evento em segundos: ");
		totalsegundos = sc.nextInt();
		
		//PROCESSAMENTO
		horas = totalsegundos / 60 / 60;// segundos -> minutos -> horas
		minutos = (totalsegundos % 60) / 60;
		segundos = (totalsegundos % 60) % 60;
	
		//SAÍDA
		System.out.printf("A duração total do evento é de: %d horas %d minutos e %d segundos", horas, minutos, segundos);

		sc.close();
	}

}
