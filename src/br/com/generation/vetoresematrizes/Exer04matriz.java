package br.com.generation.vetoresematrizes;

import java.util.Scanner;

public class Exer04matriz {
	
	/*
	 * 4. Crie um programa que receba valores do usu�rio para preencher uma matriz 3X3, e
       em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
       diagonal, ou seja, diagonal principal. 
	*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 // Declara��o das vari�veis do tipo matriz.
		int N[][] = new int[3][3];
		int soma = 0, somaDiagonal = 0;

		//Vari�veis recebem o n�mero correspondente ao n�mero de linhas e colunas da matriz
		int qtdLinha = 3, qtdColuna = 3;
		
		// Inserindo valores na matriz N
		for (int linha = 0; linha < qtdLinha; linha++) {
			for (int coluna = 0; coluna < qtdColuna; coluna++) {
				System.out.print("Digite um n�mero: ");
				N[linha][coluna] = sc.nextInt();
			}
		}

		for (int linha = 0; linha < qtdLinha; linha++) {
			for (int coluna = 0; coluna < qtdColuna; coluna++) {
				// Somando os valores na matriz N
				soma += N[linha][coluna];
				
				// Somando os valores na diagonal principal da matriz N
				if (linha == coluna) {
					somaDiagonal += N[linha][coluna];
				}
			}
		}
		
		System.out.println();
		System.out.println("A soma dos itens da matriz �: " + soma);
		System.out.println("A soma dos itens da diagonal principal da matriz �: " + somaDiagonal);
		
		sc.close();
	}

}
