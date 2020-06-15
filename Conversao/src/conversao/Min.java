package conversao;

import javax.swing.JOptionPane;

public class Min {
	public static void main(String[] args) {
		int n1 = -5, n2 = 0;
		float n3 = 8f, n4 = 15;
		long n5 = 1000000, n6 = 1505065842;
		double n7 = 148.9, n8 = 148.8;
		
		
		JOptionPane.showMessageDialog(null, "\n Menor Inteiro é: " + Math.min(n1, n2) +
				                            "\n Menor Float é: " + Math.min(n3, n4) + 
				                            "\n Menor Long é: " + Math.min(n5, n6) + 
				                            "\n Menor Double é: " + Math.min(n7, n8));
		
		
		
	}
	
}
