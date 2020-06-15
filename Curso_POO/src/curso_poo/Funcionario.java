package curso_poo;

public class Funcionario {
	//Atributos
	private String nome;
	private double salario;
	private double cpf;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	//Métodos Especiais
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getCpf() {
		return this.cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	
	
	

}
