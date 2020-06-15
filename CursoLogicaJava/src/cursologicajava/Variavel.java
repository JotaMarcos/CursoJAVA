package cursologicajava;

public class Variavel {

	public static void main(String[] args) {
		//Atenção com o Java, pois ele é 
		//Case Sensitive
		/*int valor = 10;	
		int Valor = 20;
		System.out.println("O Valor é: " + valor);
		System.out.println("O Valor é: " + Valor);
		*/
		
		/*
		 int x;
		x = 15;
		
		if(x == 15){
			int w = 5;
			System.out.println("O Valor de X: " + x);
			System.out.println("O Valor de W: " + w);
			
			if(x > 0){
				System.out.println("O Valor de W Novamente: " + w);
			}
		}
		System.out.println("O Valor de X Novamente: " + x);
		 */
		
		/*byte valor1 = 15;
		byte valor2 = 25;
		//Casting Explícito
		byte valor3 = (byte) (valor1 + valor2);*/
		/*short valor1 = 15;
		short valor2 = 25;
		//Casting Implícito
		short valor3 = (byte)(valor1 + valor2);*/
		/*
		int valor1 = 15;
		int valor2 = 25;
		int valor3 = valor1 + valor2;
		int valor4 = 16;		
		
		System.out.println("O Valor 01 é: " + valor1);
		System.out.println("O Valor 02 é: " + valor2);		
		System.out.println("O Valor 03 é: " + valor3);
		System.out.println("O Valor 04 é: " + valor4);
		valor4 = 20;
		System.out.println("O Valor 04 é: " + valor4);
		valor4 = 0x10;
		System.out.println("O Valor 04 é: " + valor4);*/
		
		/*long valor1 = 5555555555533335L;
		long valor2 = 4444444444355435L;
		
		long valor3 = valor1 + valor2;
		System.out.println("O Valor de 01 é: " + valor1);
		System.out.println("O Valor de 02 é: " + valor2);
		System.out.println("O Valor de 03 é: " + valor3);*/
		
		/*float valor1 = (float) 2.5;
		float valor2 = 3.5f;
		
		float valor3 = valor1 + valor2;
		
		System.out.println("O Valor de 01 é: " + valor1);
		System.out.println("O Valor de 02 é: " + valor2);
		System.out.println("O Valor de 03 é: " + valor3);*/
		
		
		/*char valor1 = 'B';
		char valor2 = '\n';
		char valor3 = 'C';
		
		
		
		System.out.println("O Valor de 01 é: " + valor1);
		valor1 = '\100';
		System.out.println("O Valor de 01 é: " + valor1);		
		System.out.println("O Valor de 02 é: " + valor2 + "Teste!");
		valor2 = '\102';
		System.out.println("O Valor de 02 é: " + valor2);	
		System.out.println("O Valor de 03 é: " + valor3);
		valor3 = '\u0042';
		System.out.println("O Valor de 03 é: " + valor3);
		
		int i = valor1;
		System.out.println("O Valor de i é: " + valor1);*/
		
		
		/*for(int i = 65; i <= 70; i++){
			System.out.println("O Valor da Letra i é: " + (char) i);
		}*/
		
		/*int a = 5,  b = 2;
		int soma = a + b;
		int subtr = a - b;
		int mult = a * b;
		int div = a / b;
		int resto = a % b;
		int expo = (int) Math.pow(a, b);
		
		System.out.println("O Valor de a é: " + a);
		System.out.println("O Valor de b é: " + b);
		System.out.println("O Valor de a + b é: " + soma);
		System.out.println("O Valor de a - b é: " + subtr);
		System.out.println("O Valor de a * b é: " + mult);
		System.out.println("O Valor de a / b é: " + div);
		System.out.println("O Valor de a % b é: " + resto);
		System.out.println("O Valor de a ^ b é: " + expo);*/
		
		
		/*int a = 5, b = 2;
		a += b;
		System.out.println("O Valor de a + b é: " + a);
		
		a = 5; b = 2;
		a -= b;
		System.out.println("O Valor de a - b é: " + a);
		
		a = 5; b = 2;
		a *= b;
		System.out.println("O Valor de a * b é: " + a);
		
		a = 5; b = 2;
		a /= b;
		System.out.println("O Valor de a / b é: " + a);
		
		a = 5; b = 2;
		a %= b;
		System.out.println("O Valor de a % b é: " + a);
		
		a = 5; b = 2;
		a = (int) Math.pow(a,b);
		System.out.println("O Valor de a ^ b é: " + a);*/
		
		//Pré-Incremento e Pós-Incremento
		/*int a = 1, b = 1;
		System.out.println("O Valor de A é: " + a);
		System.out.println("O Valor de ++A é: " + (++a));
		System.out.println("O Valor de A++ é: " + (a++));
		System.out.println("O Valor de A é: " + a);
		System.out.println("--------------------------");
		System.out.println("O Valor de B é: " + b);
		System.out.println("O Valor de ++B é: " + (++b));
		System.out.println("O Valor de B++ é: " + (b++));
		System.out.println("O Valor de B é: " + (b));
		System.out.println("--------------------------");*/
		
		//Pré-Decremento e Pós-Decremento
	    int a = 2, b = 3;
		System.out.println("O Valor de A é: " + a);
		System.out.println("O Valor de --A é: " + (--a));
		System.out.println("O Valor de A-- é: " + (a--));
		System.out.println("O Valor de A é: " + a);
		System.out.println("--------------------------");
		System.out.println("O Valor de B é: " + b);
		System.out.println("O Valor de --B é: " + (--b));
		System.out.println("O Valor de B-- é: " + (b--));
		System.out.println("O Valor de B é: " + (b));
		
	
		
		
		

	}

}
