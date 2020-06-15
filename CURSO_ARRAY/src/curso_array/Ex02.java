package curso_array;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o Tamanho do Vetor: "));
		
		//Delcarando e Instanciando o Array
		String[] nome =  new String[tamanho];
		
		for(int i = 1; i <= tamanho; i++){
			String txt = JOptionPane.showInputDialog("Nome "  + i);
			
			if(txt == null){
				break;
			} else {
				nome[i - 1] = txt;
			}
		}
		
		String msg = "Lista de Nomes: ";		
		for(int i = 0; i < nome.length; i++){
			if(nome[i] == null){
				break;
			} else {
				msg += "\n - " + nome[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, msg);
		

	}

}
