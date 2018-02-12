package br.com.bandtec.exercicio4;

public class Pessoa {
	
	private String nome;
	private String sexo;
	private double peso;
	private double altura;
	private double imc;
	
	public Pessoa() {
		
		this.nome = "";
		this.sexo = "";
		this.peso = 0;
		this.altura = 0;
		this.imc = 0;
	}

	public Pessoa(String nome, String sexo, double peso, double altura) {
	
		this.nome = nome;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.imc = 0;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
			
		this.nome = nome;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		
		if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
			
			this.sexo = sexo;
		}
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		
		return this.peso;
	}
	
	public double getAltura() {
		return this.altura;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}
}
