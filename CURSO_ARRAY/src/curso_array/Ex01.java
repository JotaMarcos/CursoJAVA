package curso_array;

public class Ex01 {

	public static void main(String[] args) {
		int[] idade; //Declarando o Array
		
		idade = new int[4]; //Instanciando o Array
		
		//Inicializandoo Array
		
		idade[0] = 25;
		idade[1] = 30;
		idade[2] = 10;
		idade[3] = 3;
		
		//Consultando o Array
		
		/*System.out.println("Idade[0] = " + idade[0]);
		System.out.println("Idade[1] = " + idade[1]);
		System.out.println("Idade[2] = " + idade[2]);
		System.out.println("Idade[3] = " + idade[3]);*/
		//Consultando o Array
		for(int i = 0; i < 4; i++){
			System.out.println("Idade[" + i + "] = " + idade[i] + " anos!");
		}
		System.out.println("---------------------------------------");
		//Declarando e Instanciando o Array
		String[] nome = new String[4]; 
		
		//Inicializando o Array
		nome[0] = "João Marcos";
		nome[1] = "Poliane";
		nome[2] = "Ellen";
		nome[3] = "Elza";
		
		//Consultando o Array
		for(int i = 0; i < 4; i++){
			System.out.println("Nome[" + i + "] = " + nome[i]);
		}
		
		System.out.println("---------------------------------------");
		
		//Declarando, Instanciando e Inicializando o Array
		char[] letras = {'A', 'B', 'K', 'H', 'I', 'S'};
		
		//Consultando o Array
		for(int i = 0; i <4; i++){
			System.out.println("Letras [" + i + "] = " + letras[i]);
		} 


		

	}

}
