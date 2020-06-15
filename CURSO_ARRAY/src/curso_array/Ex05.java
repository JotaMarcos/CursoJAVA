package curso_array;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		int[] origem = {1, 2, 3, 4, 5};
		int[] destino1 = new int[8];
		int[] destino2 = new int[6];
		int[] destino3 = new int[6];
		
		for(int i = 0; i < destino1.length; i++){
			System.out.println("Limpo: " + destino1[i]);
		}
		
		System.arraycopy(origem, 2, destino1, 6, 2);
		//System.arraycopy(origem, 0, destino2, 0, 4);
		destino2 = Arrays.copyOf(origem, 3);
		destino3 = Arrays.copyOfRange(origem, 2, 4);
		
		System.out.println("-----------------------");
		
		for(int i = 0; i < destino2.length; i++){
			System.out.println("Destino: " + destino2[i]);
		}
		
		System.out.println("-----------------------");
		
		for(int i = 0; i < destino3.length; i++){
			System.out.println("Destino: " + destino3[i]);
		}
		

	}

}
