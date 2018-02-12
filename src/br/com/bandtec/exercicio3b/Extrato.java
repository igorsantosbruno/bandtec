package br.com.bandtec.exercicio3b;

public class Extrato {
	
	private String status;
	private ContaCorrente contaCorrente;
	
	public Extrato() {
		
		this.status = "";
		this.contaCorrente = new ContaCorrente();
	}
	
	public Extrato(String status, ContaCorrente conta) {

		this.status = status;
		this.contaCorrente = conta;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ContaCorrente getContaCorrente() {
		return this.contaCorrente;
	}

	public void setConta(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
}
