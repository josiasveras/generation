package br.com.generation.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {
	
	/*
	 *5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
         aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
         respectivamente. 
	*/

	public static void main(String[] args) {
		// Declaração de variáveis
		double n1, n2, n3, media;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite a 1ª nota: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a 2ª nota: ");
		n2 = sc.nextDouble();
		
		System.out.println("Digite a 3ª nota: ");
		n3 = sc.nextDouble();
		
		//PROCESSAMENTO
		
		media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 5.0)) / (1 + 2 + 3);
		
		//SAÍDA
		System.out.printf("A média ponderada é: %.2f", media);
				
		sc.close();
	}

}
