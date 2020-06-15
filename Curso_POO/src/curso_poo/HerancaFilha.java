package curso_poo;

public class HerancaFilha extends HerancaMae {
	public String mostrar(){
		return "Está é a Classe Filha!";
		
	}
	
	public String imprimir1(){
		//return "É da Classe Filha!";
		return super.imprimir() + " - Este Método é da Classe Filha!";	
		
	}
	
	public String imprimir2(){
		//return "É da Classe filha!";
		return this.mostrar();
	}
	
	

}
