package br.com.generation.repeticoes;

import java.io.IOException;
import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

public class Exer04while {
	
	/*
	 * 4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
		  psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
		  era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
		  (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		  agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		  pessoas, calcule e mostre: (WHILE)
			o n�mero de pessoas calmas;
			o n�mero de mulheres nervosas;
			o n�mero de homens agressivos;
			o n�mero de outros calmos;
			o n�mero de pessoas nervosas com mais de 40 anos;
			o n�mero de pessoas calmas com menos de 18 anos.
	*/

	public static void main(String[] args) throws IOException {
		// Declara��o das vari�veis
		int idade, genero = 0, sair = 0, estadoEspirito = 0; 
		int contPessoaDados = 0; 
		int contPessoaCalma = 0, contMulherNervosa = 0, contHomemAgressivo = 0; 
		int contOutrosCalmo = 0, contPessoaNervosaMais40 = 0, contPessoaCalmaMenos18 = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		while (contPessoaDados != 5) {
			System.out.print("Informe sua idade: ");
			idade = sc.nextInt();
			System.out.print("\n");
			
			/*while (genero != 1 && genero != 2 && genero != 3) {
				System.out.println("Op��o inv�lida!!");
				System.out.print("Considere:  1 = feminino ----- 2 = masculino ----- 3 = Outros\n");
			}*/
			
			System.out.print("Considere:  1 = feminino ----- 2 = masculino ----- 3 = Outros\n");
			System.out.print("Informe seu g�nero: ");
			genero = sc.nextInt();
			System.out.print("\n");
			
			System.out.print("Considere:  1 = calmo ----- 2 = nervoso ----- 3 = agressivo\n");
			System.out.print("Informe seu estado de esp�rito: ");
			estadoEspirito = sc.nextInt();
			
			contPessoaDados = contPessoaDados + 1;
			
			// n�mero de pessoas calmas
			if (estadoEspirito == 1) {
				contPessoaCalma = contPessoaCalma + 1;
				
			// n�mero de mulheres nervosas	
			} if (genero == 1 && estadoEspirito == 2) { 
				contMulherNervosa = contMulherNervosa + 1;
				
		    // n�mero de homens agressivos;	
			} if (genero == 2 && estadoEspirito == 3) { 
				contHomemAgressivo = contHomemAgressivo + 1;
				
			// n�mero de outros calmos
			} if (estadoEspirito == 1 && genero == 3) {
					contOutrosCalmo = contOutrosCalmo + 1;
			
			// n�mero de pessoas nervosas com mais de 40 anos
			} if (estadoEspirito == 2 && idade > 40) { 
				contPessoaNervosaMais40 = contPessoaNervosaMais40 + 1;
				
			// n�mero de pessoas calmas com menos de 18 anos
			} if (estadoEspirito == 1 && idade < 21) { 
				contPessoaCalmaMenos18 = contPessoaCalmaMenos18 + 1;
			}
			
			System.out.print("\n");
		}
		
		System.out.println("N�mero de pessoas com dados coletados: " + contPessoaDados);
		System.out.println("N�mero de pessoas calmas: " + contPessoaCalma);
		System.out.println("N�mero de mulheres nervosas: " + contMulherNervosa);
		System.out.println("N�mero de outros g�neros calmos: " + contOutrosCalmo);
		System.out.println("N�mero de pessoas nervosas com mais de 40 anos: " + contPessoaNervosaMais40);
		System.out.println("N�mero de pessoas calmas com menos de 18 anos: " + contPessoaCalmaMenos18);
	}

}
