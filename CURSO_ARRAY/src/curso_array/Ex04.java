package curso_array;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		byte[] vetor = {10, 12, 15, 18, 40, 65, 70, 80, 87, 90, 101};
		
		byte valor = Byte.parseByte(JOptionPane.showInputDialog("Digite o Valor a ser Pesquisado: "));
		
		int resultado = Arrays.binarySearch(vetor, valor);
		
		if(resultado <= 0){
			JOptionPane.showMessageDialog(null, "Valor Inválido! Posição não Encontrada! Tente Novamente!");
		} else {
			JOptionPane.showMessageDialog(null, "A Posição Encontrada: " + resultado);
		}
		
		

	}

}
