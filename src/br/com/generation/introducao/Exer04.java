package br.com.generation.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {
	
	/*
	 *4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
		 calcule a seguinte express�o: D = R + S / 2 onde R = (A + B) elevado a 2 e
		 S = (B + C) elevado a 2. 
	*/

	public static void main(String[] args) {
		// Declara��o de vari�veis
		double a, b, c, r, s, d;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = sc.nextDouble();
		
		//PROCESSAMENTO
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		
		d = (r + s) / 2;
		
		//SA�DA
		System.out.printf("O resultado da express�o �: %.2f", d);
		
		sc.close();

	}

}
