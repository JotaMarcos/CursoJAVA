package conversao;

import javax.swing.JOptionPane;

public class SQRT {
	public static void main(String[] args) {
		int a = 9;
		double b = 16;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um  Valor Inteiro: "));
		
		
		JOptionPane.showMessageDialog(null, "Número Digitado é: " + a + 
									 "\nA Raiz Quadrada é: " + Math.sqrt(a) +
				                     "\nNúmero Digitado é: " + b + 
				                     "\nA Raiz Quadrada é: " + Math.sqrt(b));
		
		
		
	}
	
}
