package br.com.bandtec.exercicio3b;

public class ContaCorrente {
	
	private String agencia;
	private String conta;
	private double saldo;
	private Cliente cliente;
	
	public ContaCorrente() {
		
		this.agencia = "";
		this.conta = "";
		this.saldo = 0;
		this.cliente = new Cliente();
	}
	
	public ContaCorrente(String agencia, String conta, double saldo, Cliente cliente) {
		
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return this.conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public final Cliente getCliente() {
		return this.cliente;
	}

	public final void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
