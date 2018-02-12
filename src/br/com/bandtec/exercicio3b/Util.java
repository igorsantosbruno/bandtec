package br.com.bandtec.exercicio3b;

public class Util {

	public String atualizarExtrato(String descricao, double valor) {

		return valor < 0 ? descricao + " - " + valor + "(D)" : descricao + " - " + valor + "(C)";
	}

	public ContaCorrente depositar(double valor, ContaCorrente conta) {

		if (valor <= 0) {

			return conta;
		} else {

			conta.setSaldo(conta.getSaldo() + valor);
			return conta;
		}
	}

	public ContaCorrente transferir(double valor, ContaCorrente conta) {

		if (valor <= 0) {

			return conta;
		} else {

			conta.setSaldo(conta.getSaldo() - valor);
			return conta;
		}
	}
	
	public void exibirExtrato(Extrato extrato) {
		
		System.out.println("== Extrato do cliente " + extrato.getContaCorrente().getCliente().getNome() + " ==");
		System.out.println("Ag." + extrato.getContaCorrente().getAgencia() + " - " + "Conta." + extrato.getContaCorrente().getConta());
		System.out.println(extrato.getStatus());
		System.out.println();
	}
}
