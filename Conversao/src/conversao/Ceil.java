package conversao;

import javax.swing.JOptionPane;

public class Ceil {
	public static void main(String[] args) {
		double num;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um N�mero com Casas D�cimais: "));
		
		JOptionPane.showMessageDialog(null, "O Valor Digitado �: " + num +
									  "\n e usando o Ceil �: " + Math.ceil(num));
		
		
	}
	

}
