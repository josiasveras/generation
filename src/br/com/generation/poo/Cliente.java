package br.com.generation.poo;

/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
*/

public class Cliente {
	
	// Declaração dos atributos da classe
	private String nome;
	private int idade;
	private String dtNasc;
	private String genero;
	
	public Cliente() {
	
	}
	
	public Cliente(String nome, int idade, String dtNasc, String genero) {
		this.nome = nome;
		this.idade = idade;
		this.dtNasc = dtNasc;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Cliente --> nome: " + nome + " | idade: " + idade + " | data de nascimento: " + dtNasc + " | gênero: " + genero + "";
	}
}
