package estruturadedados;



public class Clientes {
	private String codigo;
	private String nome;
	
	public Clientes (String codigo, String nome){
		this.codigo = codigo;
		this.nome = nome;
	}
	
	
	public String toString(){
		return codigo + " : " + nome;
	}
	

}
