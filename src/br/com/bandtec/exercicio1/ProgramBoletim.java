package br.com.bandtec.exercicio1;

import br.com.bandtec.exercicio1.Util;

public class ProgramBoletim {
	
	public static void main(String[] args) {
		
		Boletim alunoZezinho = new Boletim("Zézinho",new double[] {5.4,1.6});
		Boletim alunaMariazinha = new Boletim("Mariazinha",new double[] {10,9.5});
		Util util = new Util();
		alunoZezinho.setHistorico(util.calcularResultado(alunoZezinho),0);
		alunaMariazinha.setHistorico(util.calcularResultado(alunaMariazinha),0);
		util.exibirHistorico(alunoZezinho.getHistorico(),1);
		util.exibirHistorico(alunaMariazinha.getHistorico(),1);
	}
}
