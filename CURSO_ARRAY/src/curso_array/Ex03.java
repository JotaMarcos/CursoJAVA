package curso_array;

public class Ex03 {

	public static void main(String[] args) {
		int[] origem = {1, 2, 3, 4,5};
		int[] destino1 = new int[8];
		int[] destino2 = new int[4];
		
		for(int i = 0; i < destino1.length; i++){
			System.out.println("Destino: " + destino1[i]);
		}
		
		System.out.println("------------------------------------");
		
		System.arraycopy(origem,2, destino1, 5, 3);
		
		for(int i = 0; i < destino1.length; i++){
			System.out.println("Destino: " + destino1[i]);
		}
		
		System.out.println("------------------------------------");
		
		System.arraycopy(origem, 0, destino2, 0, 4);
		for(int i = 0; i < destino2.length; i++){
			System.out.println("Destino: " + destino2[i]);
		}

	}

}
