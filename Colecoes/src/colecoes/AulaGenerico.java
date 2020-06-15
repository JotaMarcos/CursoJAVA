package colecoes;

import javax.swing.JOptionPane;

public class AulaGenerico {
	public static <E> void ImprimeArray(E[] entrada){
		
		String msg = "Lista dos Nomes: ";
		for(E valor : entrada){
			msg += "\n => " + valor;
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
	/*public static void ImprimeArray(String[] entrada){
			
		String msg = "Lista dos Nomes: ";
		for(String valor : entrada){
			msg += "\n => " + valor;
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static void ImprimeArray(Integer[] entrada){
		
		String msg = "Lista dos Nomes: ";
		for(Integer valor : entrada){
			msg += "\n => " + valor;
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
    public static void ImprimeArray(Character[] entrada){
		
		String msg = "Lista dos Nomes: ";
		for(Character valor : entrada){
			msg += "\n => " + valor;
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

    public static void ImprimeArray(Double[] entrada){
	
	String msg = "Lista dos Nomes: ";
	for(Double valor : entrada){
		msg += "\n => " + valor;
	}
	
	JOptionPane.showMessageDialog(null, msg);
   }*/
	
	
	public static void main(String[] args) {
		String[] arrayDeString = {"João Marcos", "Poliane Duarte", "Ellen Duarte"};
		Integer[] arrayDeInteiros = {2, 4, 5, 6, 7};
		Character[] arrayDeCaractere = {'A', 'C', 'D', 'E', 'F'};
		Double[] arrayDeDouble = {1.1, 2.5, 4.6, 6.8};
		
		ImprimeArray(arrayDeString);
		ImprimeArray(arrayDeInteiros);
		ImprimeArray(arrayDeCaractere );
		ImprimeArray(arrayDeDouble);

	}

}