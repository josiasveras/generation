package br.com.generation.repeticoes;

import java.util.Scanner;

public class Exer03while {
	
	/*
	 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		  21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
          idade for =-99. (WHILE).
	*/

	public static void main(String[] args) {
		// Declaração das variáveis
		int idade = 0, contMenor21 = 0, contMaior50 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (idade != -99) {
			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
			if (idade > 0 && idade < 21) {
				contMenor21 = contMenor21 + 1;
			} else if (idade > 50) {
				contMaior50 = contMaior50 + 1;
			} else if (idade == 50) {
				
			} else if (idade == 21) {
				
			} else {
				System.out.println("Idade inválida!!");
			}
		}
		System.out.printf("Total de pessoas com menos de 21 anos: %d %n", contMenor21);
		System.out.printf("Total de pessoas com mais de 50 anos: %d", contMaior50);
		
		sc.close();
	}

}
