package br.com.generation.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {
	
	/*
	 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos
          quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
          d = raiz quadrada de (x2 - x1) elevado a 2 + (y2 - y1) elevado a 2.
	*/

	public static void main(String[] args) {
		// Declaração de variáveis
		double x1, x2, y1, y2, d;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite o valor de X1: ");
		x1 = sc.nextDouble();
		
		System.out.println("Digite o valor de X2: ");
		x2 = sc.nextDouble();
		
		System.out.println("Digite o valor de Y1: ");
		y1 = sc.nextDouble();
		
		System.out.println("Digite o valor de Y2: ");
		y2 = sc.nextDouble();
		
		//PROCESSAMENTO
		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		//SAÍDA
		System.out.printf("O resultado da expressão é: %.2f", d);
						
		sc.close();

	}

}
