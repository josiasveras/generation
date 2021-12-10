package br.com.generation.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {
	
	/*
	 * 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		  n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
          �mpar exiba o n�mero elevado ao quadrado.
	*/

	public static void main(String[] args) {
		// Declara��o das vari�veis
		int num;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.print("Digite um n�mero: ");
		num = sc.nextInt();
		
		//PROCESSAMENTO
		if (num % 2 == 0.0) {
			//SA�DA
			System.out.printf("%d � PAR %n", num);
			System.out.printf("A raiz quadrada de %d �: %.2f ", num, Math.sqrt(num));
		} else {
			//SA�DA
			System.out.printf("%d � �MPAR %n", num);
			System.out.printf("%d elevado ao quadrado �: %.2f ", num, Math.pow(num, 2));
		}
		
		sc.close();
	}

}
