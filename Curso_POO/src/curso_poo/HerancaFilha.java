package curso_poo;

public class HerancaFilha extends HerancaMae {
	public String mostrar(){
		return "Est� � a Classe Filha!";
		
	}
	
	public String imprimir1(){
		//return "� da Classe Filha!";
		return super.imprimir() + " - Este M�todo � da Classe Filha!";	
		
	}
	
	public String imprimir2(){
		//return "� da Classe filha!";
		return this.mostrar();
	}
	
	

}
