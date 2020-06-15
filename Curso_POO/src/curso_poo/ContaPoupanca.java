package curso_poo;

public class ContaPoupanca extends Conta {
	//Atributos
	private int diaDoAniversario;
	
	public ContaPoupanca(Cliente cliente, int dia) {
		super(cliente);
		this.diaDoAniversario = dia;
	}
	@Override
	public void imprimiExtratoCompleto(){
		double total = 0;
		total = (this.saldoAtual() * 0.05) + (this.saldoAtual());
		System.out.println("EXTRATO DA CONTA POUPANÇA");
		System.out.println("Saldo: " + this.saldoAtual());
		System.out.println("Aniversário: " + this.getDiaDoAniversario());
		System.out.println("Juros: " + this.saldoAtual() * 0.05);
		System.out.println("Saldo Total: " + total);
		
	}

	//Métodos Especiais
	public int getDiaDoAniversario() {
		return diaDoAniversario;
	}

	public void setDiaDoAniversario(int diaDoAniversario) {
		this.diaDoAniversario = diaDoAniversario;
	}

	
	
}
