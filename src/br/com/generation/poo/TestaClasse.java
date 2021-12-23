package br.com.generation.poo;

public class TestaClasse {

	public static void main(String[] args) {
		
		//Testa Cliente
		System.out.println("--------------------------------------------------------TESTA CLIENTE--------------------------------------------------------");
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.nome = "Paulo Santos";
		c1.idade = 30;
		c1.dtNasc = "25-12-1991";
		c1.genero = "masculino";
		
		System.out.println("Nome: " + c1.nome);
		
		c1.comprar();
		
		System.out.println();
		
		c2.nome = "Janaina Oliveira";
		c2.idade = 25;
		c2.dtNasc = "08-06-1995";
		c2.genero = "feminino";
		
		System.out.println("Nome: " + c2.nome);
		
		c2.consumir();
	
		System.out.println();
		
		//Testa Aviao
		System.out.println("--------------------------------------------------------TESTA AVIAO--------------------------------------------------------");
		Aviao av1 = new Aviao();
		Aviao av2 = new Aviao();
		Aviao av3 = new Aviao();
		
		av1.modelo = "A350 XWB";
		av1.capacidade = 270;
		av1.cor = "branca";
		
		av2.modelo = "Airbus A320";
		av2.capacidade = 132;
		av2.cor = "cinza";
		
		av3.modelo = "Boeing 787";
		av3.capacidade = 242;
		av3.cor = "azul e branca";
		
		System.out.println("O modelo é: " + av1.modelo + ". A capacidade de passageiros é: " + av1.capacidade + ". A cor é: " + av1.cor);
		av1.voar();
		av1.pousar();
		
		System.out.println();
		
		System.out.println("O modelo é: " + av2.modelo + ". A capacidade de passageiros é: " + av2.capacidade + ". A cor é: " + av2.cor);
		av1.voar();
		av1.pousar();

		System.out.println();
		
		System.out.println("O modelo é: " + av3.modelo + ". A capacidade de passageiros é: " + av3.capacidade + ". A cor é: " + av3.cor);
		av1.voar();
		av1.pousar();
		
		//Testa Produto
		System.out.println();
		System.out.println("--------------------------------------------------------TESTA PRODUTO--------------------------------------------------------");
		Produto p1 = new Produto();
		p1.nome = "Computador";
		p1.preco = 2500.99;
		p1.quantidade = 10;
		
		Produto p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 1500.99;
		p2.quantidade = 12;
		
		System.out.println("Produtos: ");
		System.out.printf("nome: %s, preço: R$ %.2f, quantidade: %d \n", p1.nome, p1.preco, p1.quantidade);
		System.out.printf("nome: %s, preço: R$ %.2f, quantidade: %d \n", p2.nome, p2.preco, p2.quantidade);
		p1.compra();
	}

}
