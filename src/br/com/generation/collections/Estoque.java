package br.com.generation.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/*
 * 3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
	  trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
	  programa deverá atender as seguintes funcionalidades:
	  
	  Armazenar dados da List
	  Remover dados da list;
	  Atualizar dados da list.
	  Apresentar todos os dados da list. 
*/

public class Estoque {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Produto p1 = new Produto("PC Gamer ITX Arena", 6699.00, 10);
		Produto p2 = new Produto("Apple iPhone 12 ", 6213.90, 5);
		Produto p3 = new Produto("Smart TV 55 4K Samsung", 4459.88, 8);
		Produto p4 = new Produto("Fone de Ouvido Bluetooth JBL", 237.30, 50);
		Produto p5 = new Produto("Apple Watch Serie 6 GPS", 3899.99, 15);
		
		List<Produto> produto = new ArrayList<>();
		
		// Armazenando os dados da list
		produto.add(p1);
		produto.add(p2);
		produto.add(p3);
		produto.add(p4);
		produto.add(p5);
		
		// Apresentando todos os dados da list. 
		System.out.println("PRODUTOS NO ESTOQUE: ");
		for(Produto prod : produto) {
			System.out.printf("nome: %s, preço: R$ %.2f, quantidade: %d \n", prod.getNome(), prod.getPreco(), prod.getQuantidade());
		}
		
		// Removendo os dados da list
		produto.remove(p1);
		produto.remove(p2);
		
		System.out.println();
		
		System.out.println("PRODUTOS NO ESTOQUE APÓS A REMOÇÃO: ");
		for(Produto prod : produto) {
			System.out.printf("nome: %s, preço: R$ %.2f, quantidade: %d \n", prod.getNome(), prod.getPreco(), prod.getQuantidade());
		}
		
		System.out.println();
		
		Produto p6 = new Produto("ThunderX3 Cadeira Gamer", 1399.00, 90);
		
		// Atualizando dados da list.
		produto.set(0, p6);
		
		System.out.println("PRODUTOS APÓS A ATUALIZAÇÃO: ");
		for(Produto prod : produto) {
			System.out.printf("nome: %s, preço: R$ %.2f, quantidade: %d \n", prod.getNome(), prod.getPreco(), prod.getQuantidade());
		}
		
	}
}
