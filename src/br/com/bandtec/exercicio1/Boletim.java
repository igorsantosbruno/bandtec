package br.com.bandtec.exercicio1;

public class Boletim {
	
	private String nomeEstudante;
	private double notas[];
	private String historico [];
	
	public Boletim() {
		
		this.nomeEstudante = "";
		this.notas = new double[2];
		this.historico = new String[100];
	}
	
	public Boletim(String nomeEstudante,double[]notas) {
		
		this.nomeEstudante = nomeEstudante;
		this.notas = notas;
		this.historico = new String[100];
	}
	
	public String getNomeEstudante() {
		return nomeEstudante;
	}

	public void setNomeEstudante(String nomeAluno) {
		this.nomeEstudante = nomeAluno;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public String[] getHistorico() {
		return historico;
	}

	public void setHistorico(String resultado, int posicao) {
		this.historico[posicao] = resultado;
	}
}














