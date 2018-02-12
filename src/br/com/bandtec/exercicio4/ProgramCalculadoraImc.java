package br.com.bandtec.exercicio4;

public class ProgramCalculadoraImc {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Igor", "M", 88, 1.78);
		Util util = new Util();
		pessoa.setImc(util.calcularImc(pessoa));
		System.out.println(util.obterStatusImc(pessoa));
	}
}
