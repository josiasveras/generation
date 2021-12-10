package br.com.generation.repeticoes;

import java.util.Iterator;
import java.util.Scanner;

public class Exer01for {
	
	/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
		 obtemos resto = 5. (FOR)
	*/

	public static void main(String[] args) {
		// Declaração das variáveis
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		for (i = 1000; i <= 1999; i++) {
			if (i % 11 == 5) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
