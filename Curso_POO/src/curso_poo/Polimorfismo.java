package curso_poo;

public class Polimorfismo {
	
	public static void main(String[] args) {
		Circulo circulo = new Circulo(10);
		Retangulo reta = new Retangulo(2, 20);
		Triangulo triangulo = new Triangulo(5, 30);
		Quadrado quadrado = new Quadrado(10);
		
		
		System.out.println("A área do Círculo é igual a: " + circulo.area());
		System.out.println("A área do Retângulo é igual a: " + reta.area());
		System.out.println("A área do Triângulo é igual a: " + triangulo.area());
		System.out.println("A área do Quadrado é igual a: " + quadrado.area());
		
		
	}

}
