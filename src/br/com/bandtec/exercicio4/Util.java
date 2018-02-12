package br.com.bandtec.exercicio4;

public class Util {
	
	public double calcularImc(Pessoa pessoa) {
		
		return pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());
	}
	
	public String obterStatusImc(Pessoa pessoa) {
		
		if(pessoa.getImc() < 19.1 && pessoa.getSexo().equals("F") || pessoa.getImc() < 20.7 && pessoa.getSexo().equals("M")) {
			
			return pessoa.getNome() + " Seu IMC é " + String.format("%.1f", pessoa.getImc()) + ". Sua condição é " + "abaixo do peso";
		}else if(pessoa.getImc() <= 25.8 && pessoa.getSexo().equals("F") || pessoa.getImc() <= 26.4 && pessoa.getSexo().equals("M")) {
			
			return pessoa.getNome() + " Seu IMC é " + String.format("%.1f", pessoa.getImc()) + ". Sua condição é " + "no peso normal";
		}else if(pessoa.getImc() <= 27.3 && pessoa.getSexo().equals("F") || pessoa.getImc() <= 27.8 && pessoa.getSexo().equals("M")) {
			
			return pessoa.getNome() + " Seu IMC é " + String.format("%.1f", pessoa.getImc()) + ". Sua condição é " + "marginalmente acima do peso";
		}else if(pessoa.getImc() <= 32.3 && pessoa.getSexo().equals("F") || pessoa.getImc() <= 31.1 && pessoa.getSexo().equals("M")) {
			
			return pessoa.getNome() + " Seu IMC é " + String.format("%.1f", pessoa.getImc()) + ". Sua condição é " + "acima do peso ideal";
		}else {
			
			return pessoa.getNome() + " Seu IMC é " + String.format("%.1f", pessoa.getImc()) + ". Sua condição é " + "obeso";
		}
	}
}
