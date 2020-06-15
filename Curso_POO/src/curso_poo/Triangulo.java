package curso_poo;

//public class Triangulo extends Figura{
public class Triangulo implements Figura{
	//Atributos
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}
	
	public double area(){
		double area = 0;
		area = (this.base * this.altura) / 2;
		return area;
	}
	

}
