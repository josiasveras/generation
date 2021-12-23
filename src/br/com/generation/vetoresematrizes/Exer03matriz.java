package br.com.generation.vetoresematrizes;

import java.util.Random;
import java.util.Scanner;

public class Exer03matriz {

	/*
	  3. Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:

		a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o
		das matrizes N1 e N2;
		
		b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma
		posi��o das matrizes N1 e N2.
	*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 // Declara��o das vari�veis do tipo matriz.
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		
		//Vari�veis recebem o n�mero correspondente ao n�mero de linhas e colunas da matriz
		int qtdLinha = 4, qtdColuna = 6;
		
		//inst�ncia um objeto da classe Random usando o construtor padr�o
        Random gerador = new Random();
		
		// Inserindo valores na matriz N1
		for (int linha = 0; linha < qtdLinha; linha++) {
			for (int coluna = 0; coluna < qtdColuna; coluna++) {
				N1[linha][coluna] = gerador.nextInt(99);
			}
		}
		
		// Mostrando o conte�do da matriz N1
		System.out.println("Valores matriz N1: ");
		for (int linha = 0; linha < qtdLinha; linha++) {
			for (int coluna = 0; coluna < qtdColuna; coluna++) {
				System.out.print(N1[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		// Inserindo valores na matriz N2
		for (int linha = 0; linha < qtdLinha; linha++) {
			for (int coluna = 0; coluna < qtdColuna; coluna++) {
				N2[linha][coluna] = gerador.nextInt(49);
			}
		}
		
		System.out.println();

		// Mostrando o conte�do da matriz N2
		System.out.println("Valores matriz N2: ");
		for (int linha = 0; linha < qtdLinha; linha++) {
			for (int coluna = 0; coluna < qtdColuna; coluna++) {
				System.out.print(N2[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		// Inserindo valores na matriz M1
		for (int linha = 0; linha < qtdLinha; linha++) {
			for (int coluna = 0; coluna < qtdColuna; coluna++) {
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
			}
		}

		System.out.println();

		// Mostrando o conte�do da matriz M1
		System.out.println("Valores matriz M1: ");
		for (int linha = 0; linha < qtdLinha; linha++) {
			for (int coluna = 0; coluna < qtdColuna; coluna++) {
				System.out.print(M1[linha][coluna] + " ");
			}
			System.out.println();
		}

		// Inserindo valores na matriz M2
		for (int linha = 0; linha < qtdLinha; linha++) {
			for (int coluna = 0; coluna < qtdColuna; coluna++) {
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}
		}

		System.out.println();

		// Mostrando o conte�do da matriz M2
		System.out.println("Valores matriz M2: ");
		for (int linha = 0; linha < qtdLinha; linha++) {
			for (int coluna = 0; coluna < qtdColuna; coluna++) {
				System.out.print(M2[linha][coluna] + " ");
			}
			System.out.println();
		}

	}

}
