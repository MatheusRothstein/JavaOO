public class Conta {
	private double saldo;
	private int agencia = 42;
	private int numero;
	private Cliente titular;
	
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
		
	}
	
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor; 
			destino.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
