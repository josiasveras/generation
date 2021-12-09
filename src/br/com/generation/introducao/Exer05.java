package br.com.generation.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {
	
	/*
	 *5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
         aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
         respectivamente. 
	*/

	public static void main(String[] args) {
		// Declara��o de vari�veis
		double n1, n2, n3, media;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.println("Digite a 1� nota: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite a 2� nota: ");
		n2 = sc.nextDouble();
		
		System.out.println("Digite a 3� nota: ");
		n3 = sc.nextDouble();
		
		//PROCESSAMENTO
		
		media = ((n1 * 2.0) + (n2 * 3.0) + (n3 * 5.0)) / (1 + 2 + 3);
		
		//SA�DA
		System.out.printf("A m�dia ponderada �: %.2f", media);
				
		sc.close();
	}

}
