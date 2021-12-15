package br.com.generation.poo;

public class TestaClasse {

	public static void main(String[] args) {
		
		//Testa Cliente
		Cliente c1 = new Cliente("Paulo Santos", 30, "25-12-1991", "masculino");
		Cliente c2 = new Cliente("Janaina Oliveira", 25, "08-06-1995", "feminino");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("O nome do cliente é: " + c1.getNome());
		System.out.println("O nome da cliente é: " + c2.getNome());
		
		
	}

}
