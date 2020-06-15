package curso_array;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		int[] origem = {1, 2, 3, 4, 5};
		
		System.out.println("Valores antes do fill!");
		for(int i : origem){
			System.out.println("Valor: " + i);
		}
		//Arrays.fill(origem, 10);
		Arrays.fill(origem, 2, 4, 10);
		
		
		System.out.println("Valores depois do fill!");
		System.out.println("------------------------");
		for(int i : origem){
			System.out.println("Valor: " + i);
		}

	}

}
