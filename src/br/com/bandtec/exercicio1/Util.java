package br.com.bandtec.exercicio1;

public class Util {
	
	public String calcularResultado(Boletim boletim) {
		 
		 return 
				 this.gerarMensagem(this.calcularMedia(boletim.getNotas()[0],boletim.getNotas()[1]),(this.calcularMedia(boletim.getNotas()[0],boletim.getNotas()[1])) < 5 ? "reprovado(a)" : "aprovado(a)", 
						 boletim.getNomeEstudante());
	}
	
	private double calcularMedia(double nota, double nota2) {
		
		return (nota + nota2) / 2;
	}
	
	private String gerarMensagem(double media,String resultado, String nomeEstudante) {
		
		return nomeEstudante + "," + media + "," + resultado;
	}
	
	public void exibirHistorico(String [] historico, int ocorrencias) {
		
		for (int i = 0;i < ocorrencias;i++) {
			
			System.out.println(historico[i]);
		}
	}
}
