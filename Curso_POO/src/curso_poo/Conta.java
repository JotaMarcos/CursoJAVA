package curso_poo;

public abstract class Conta {
	//Atributos
	private int numero;
	private double saldo;
	private Agencia agencia;
	private Cliente titular;
	
	//Métodos Públicos
	protected void deposita(double valor){
		this.saldo += valor;
	}
	
	protected boolean saca(double valor){
		if(this.saldo < valor){
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	protected double saldoAtual(){
		return this.saldo;
	}
	
	protected boolean transferir(Conta destino, double valor){
		boolean sacou = this.saca(valor);
		
		if (sacou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}
		
		//this.saldo = this.saldo - valor; //retirando da conta origem
		//destino.saldo = destino.saldo + valor; //adicionando na conta de destino
		
	}
	
	//Métodos Especiais
	protected Conta(Cliente cliente){
		this.titular = cliente;
		this.saldo = 0;
		
	}
	
	protected int getNumero() {
		return this.numero;
	}

	protected void setNumero(int num) {
		this.numero = num;
	}

	protected double getSaldo() {
		return this.saldo;
	}

	protected void setSaldo(double sal) {
		this.saldo = sal;
	}

	protected Agencia getAgencia() {
		return this.agencia;
	}

	protected void setAgencia(Agencia ag) {
		this.agencia = ag;
	}

	protected Cliente getTitular() {
		return this.titular;
	}

	protected void setTitular(Cliente titu) {
		this.titular = titu;
	}
	
	
	public abstract void imprimiExtratoCompleto();
	

}
