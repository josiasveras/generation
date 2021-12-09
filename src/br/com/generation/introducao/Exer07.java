package br.com.generation.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exer07 {
	
	/*
	 * 7. Um sistema de equa��es lineares do tipo: ax + by = e tamb�m dx + ey = f. 
	 *    pode ser resolvido segundo mostrado abaixo :
	 *    x = ce - bf / ae - bd e tamb�m y = af - cd / ae - bd.
	*/

	public static void main(String[] args) {
		// Declara��o de vari�veis
		double a, b, c, d, e, f, x, y;
				
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite o valor de A: ");
		a = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = sc.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = sc.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = sc.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e = sc.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = sc.nextDouble();
		
		//PROCESSAMENTO
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		
		//SA�DA
		System.out.printf("O valor de X �: %.2f %n", x);
		System.out.printf("O valor de Y �: %.2f", y);
								
		sc.close();
	}

}
