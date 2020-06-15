package curso_poo;

//public class Circulo extends Figura {
public class Circulo implements Figura{
	//Atributos
	private double raio;
	
	//Métodos Públicos
	public Circulo (double raio){
		this.raio = raio;
	}
	

	public double area(){
		double area= 0;
		area = 3.14 * this.raio * this.raio;
		return area;
	}
	
	
	

}
