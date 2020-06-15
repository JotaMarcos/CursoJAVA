package curso_poo;

public class ContaCorrente extends Conta {
	//Atributos
	private int diasUsado = 0;
	private double limite;

	protected ContaCorrente(Cliente cliente, double limite) {
		super(cliente);
		this.limite = limite;
	}

	public int getDiasUsado() {
		return this.diasUsado;
	}

	public void setDiasUsado(int diasUsado) {
		this.diasUsado = diasUsado;
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void imprimiExtratoCompleto(){
		double total = 0;
		total = (this.saldoAtual()) + (this.getLimite());
		System.out.println("EXTRATO DA CONTA CORRENTE");
		System.out.println("Saldo: " + this.saldoAtual());
		System.out.println("Limite: " + this.getLimite());
		System.out.println("Juros: " + this.saldoAtual() * (0.02 * this.getDiasUsado()));
		System.out.println("Saldo Disponível: " + total);
		
	}

}
