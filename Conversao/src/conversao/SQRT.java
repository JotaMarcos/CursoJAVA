package conversao;

import javax.swing.JOptionPane;

public class SQRT {
	public static void main(String[] args) {
		int a = 9;
		double b = 16;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um  Valor Inteiro: "));
		
		
		JOptionPane.showMessageDialog(null, "N�mero Digitado �: " + a + 
									 "\nA Raiz Quadrada �: " + Math.sqrt(a) +
				                     "\nN�mero Digitado �: " + b + 
				                     "\nA Raiz Quadrada �: " + Math.sqrt(b));
		
		
		
	}
	
}
