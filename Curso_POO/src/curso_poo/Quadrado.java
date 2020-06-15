package curso_poo;

//public class Quadrado extends Figura {
public class Quadrado implements Figura{
	//Atributo
	private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	
	}
	
	public double area(){
		double area = 0;
		area = lado * lado;
		return area;
	}
	
	

}
