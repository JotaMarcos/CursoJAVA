package curso_poo;

public class Telefonista extends Funcionario {
	public Telefonista(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	//Atributos
	private int estacaDeTrabalho;

	public int getEstacaDeTrabalho() {
		return this.estacaDeTrabalho;
	}

	public void setEstacaDeTrabalho(int estacaDeTrabalho) {
		this.estacaDeTrabalho = estacaDeTrabalho;
	}
	
	

}
