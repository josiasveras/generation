package br.com.generation.introducao;

import java.util.Scanner;

public class Exer03 {
	
	/*
	 * 3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
       expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	*/

	public static void main(String[] args) {
		// Declara��o de vari�veis
		int horas, minutos = 0, segundos = 0, totalsegundos;
		
		Scanner sc = new Scanner(System.in);
		
		// Base: 7200
		//ENTRADA
		System.out.println("Digite a dura��o total do evento em segundos: ");
		totalsegundos = sc.nextInt();
		
		//PROCESSAMENTO
		horas = totalsegundos / 60 / 60;// segundos -> minutos -> horas
		minutos = (totalsegundos % 60) / 60;
		segundos = (totalsegundos % 60) % 60;
	
		//SA�DA
		System.out.printf("A dura��o total do evento � de: %d horas %d minutos e %d segundos", horas, minutos, segundos);

		sc.close();
	}

}
