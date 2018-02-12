package br.com.bandtec.exercicio3b;

public class ProgramBanco {
	
	public static void main(String[] args) {
		
		Cliente igor = new Cliente("igor");
		ContaCorrente contaIgor = new ContaCorrente("Santander 1456", "0021.09.13", 300, igor);
		Util util = new Util();
		Extrato extrato = new Extrato(util.atualizarExtrato("Abertura de conta",contaIgor.getSaldo()), contaIgor);
		util.exibirExtrato(extrato);
		contaIgor = util.depositar(100, contaIgor);
		extrato = new Extrato(util.atualizarExtrato("Depósito",contaIgor.getSaldo()), contaIgor);
		util.exibirExtrato(extrato);
		contaIgor = util.transferir(90, contaIgor);
		extrato = new Extrato(util.atualizarExtrato("Transferência",contaIgor.getSaldo()), contaIgor);
		util.exibirExtrato(extrato);
	}
}
