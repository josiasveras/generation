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
		
		System.out.println("O modelo ?: " + av1.modelo + ". A capacidade de passageiros ?: " + av1.capacidade + ". A cor ?: " + av1.cor);
		av1.voar();
		av1.pousar();
		
		System.out.println();
		
		System.out.println("O modelo ?: " + av2.modelo + ". A capacidade de passageiros ?: " + av2.capacidade + ". A cor ?: " + av2.cor);
		av1.voar();
		av1.pousar();

		System.out.println();
		
		System.out.println("O modelo ?: " + av3.modelo + ". A capacidade de passageiros ?: " + av3.capacidade + ". A cor ?: " + av3.cor);
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
		System.out.printf("nome: %s, pre?o: R$ %.2f, quantidade: %d \n", p1.nome, p1.preco, p1.quantidade);
		System.out.printf("nome: %s, pre?o: R$ %.2f, quantidade: %d \n", p2.nome, p2.preco, p2.quantidade);
		p1.compra();
		
		//Testa Funcionario
		System.out.println();
		System.out.println("--------------------------------------------------------TESTA FUNCION?RIO--------------------------------------------------------");
		Funcionario f1 = new Funcionario();
		f1.nome = "Maria da silva";
		f1.salario = 3500.00;
		f1.cargo = "Assistente Administrativo";
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Isadora Mendes";
		f2.salario = 10000.00;
		f2.cargo = "Programadora";
		
		System.out.println("Funcion?rios: ");
		System.out.printf("nome: %s, sal?rio: R$ %.2f, cargo: %s \n", f1.nome, f1.salario, f1.cargo);
		System.out.printf("nome: %s, sal?rio: R$ %.2f, cargo: %s \n", f2.nome, f2.salario, f2.cargo);
		f2.trabalho();
		
		//Testa Patinete
		System.out.println();
		System.out.println("--------------------------------------------------------TESTA PATINETE--------------------------------------------------------");
		Patinete pat1 = new Patinete();
		pat1.modelo = "Patinete El?trico Street";
		pat1.cor = "vermelha";
		pat1.preco = 2698.90;
		
		Patinete pat2 = new Patinete();
		pat2.modelo = "Patinete El?trico Street";
		pat2.cor = "vermelha";
		pat2.preco = 3800.00;
		
		System.out.println("Patinetes: ");
		System.out.printf("modelo: %s, cor: %s, pre?o: R$ %.2f \n", pat1.modelo, pat1.cor, pat1.preco);
		pat1.dirigir();
		System.out.printf("modelo: %s, cor: %s, pre?o: R$ %.2f \n", pat2.modelo, pat2.cor, pat2.preco);
		pat2.parar();
		
		//Testa Conta
		System.out.println();
		System.out.println("--------------------------------------------------------TESTA CONTA--------------------------------------------------------");
		Conta co1 = new Conta();
		co1.titular = "Jo?o da silva";
		co1.tipo = "Poupan?a";
		co1.saldo = 50000.00;
		
		Conta co2 = new Conta();
		co2.titular = "Ana Soares";
		co2.tipo = "Corrente";
		co2.saldo = 100000.00;
		
		System.out.println("Contas: ");
		System.out.printf("titular: %s, tipo: %s, saldo: R$ %.2f \n", co1.titular, co1.tipo, co1.saldo);
		co1.deposito();
		System.out.printf("titular: %s, tipo: %s, saldo: R$ %.2f \n", co2.titular, co2.tipo, co2.saldo);
		co2.saque();
		
		//Testa Paciente
		System.out.println();
		System.out.println("--------------------------------------------------------TESTA PACIENTE--------------------------------------------------------");
		Paciente pa1 = new Paciente();
		pa1.nome = "Jos? Silva";
		pa1.hospital = "Albert Einstein";
		pa1.numQuarto = 547;
		
		Paciente pa2 = new Paciente();
		pa2.nome = "Marina Rodrigues";
		pa2.hospital = "S?rio Liban?s";
		pa2.numQuarto = 1050;
		
		System.out.println("Pacientes: ");
		System.out.printf("nome: %s, hospital: %s, n?mero do quarto: %d \n", pa1.nome, pa1.hospital, pa1.numQuarto);
		pa1.medicado();
		System.out.printf("nome: %s, hospital: %s, n?mero do quarto: %d \n", pa2.nome, pa2.hospital, pa2.numQuarto);
		pa2.alta();
	}

}
