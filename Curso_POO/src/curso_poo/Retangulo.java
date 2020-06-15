package curso_poo;

//public class Retangulo extends Figura {
public class Retangulo implements Figura {
	//Atributos
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public double area(){
		double area = 0;
		area = this.base *  this.altura;
		return area;
		
	}
	

}
