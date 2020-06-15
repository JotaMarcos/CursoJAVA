package curso_poo;

public class Gerente extends Funcionario {
	public Gerente(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	//Atributos
	private String usuario;
	private String senha;
	
	
	//Métodos Especiais
	public String getUsuario() {
		return this.usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
