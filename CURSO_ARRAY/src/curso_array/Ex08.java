package curso_array;

import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		int[] vetor = {11, 2, 0, 8, 5, 9, 100, 20};
		
		System.out.println("Vetor Original");
		for(int i : vetor){
			System.out.println("Valor: " + i);
		}
		
		//Arrays.sort(vetor);
		Arrays.sort(vetor, 3, 5);
		
		
		System.out.println("-------------------");
		
		System.out.println("Vetor Ordenado");
		for(int i : vetor){
			System.out.println("Valor: " + i);
		}
		

	}

}
