package br.com.bandtec.exercicio3b;

public class Cliente {
	
	private String nome;
	
	public Cliente() {
		
		this.nome = "";
	}
	
	public Cliente(String nome) {
		
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
