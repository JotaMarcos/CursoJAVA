package conversao;

import javax.swing.JOptionPane;

public class Ceil {
	public static void main(String[] args) {
		double num;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite um Número com Casas Décimais: "));
		
		JOptionPane.showMessageDialog(null, "O Valor Digitado é: " + num +
									  "\n e usando o Ceil é: " + Math.ceil(num));
		
		
	}
	

}
