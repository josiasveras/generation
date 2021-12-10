package br.com.generation.condicionais;

import java.util.Scanner;

public class Exer03 {
	
	/*
	 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		  categoria ela se encontra:
			
			10-14 infantil
			15-17 juvenil
			18-25 adulto
	*/

	public static void main(String[] args) {
		// Declaração das variáveis
		int idade;
		
		Scanner sc = new Scanner(System.in);
		
		//ENTRADA
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
				
		//PROCESSAMENTO
		if (idade >= 10 && idade <= 14) {
			//SAÍDA
			System.out.print("Categoria infantil");
		} else if (idade >= 15 && idade <= 17) {
			//SAÍDA
			System.out.print("Categoria juvenil");
		} else if (idade >= 18 && idade <= 25) {
			//SAÍDA
			System.out.print("Categoria adulto");
		} else {
			//SAÍDA
			System.out.print("Não temos categoria disponível que atenda sua idade!");
		}
		
		sc.close();
	}

}
