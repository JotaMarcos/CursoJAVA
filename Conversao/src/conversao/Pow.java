package conversao;

import javax.swing.JOptionPane;

public class Pow {

	public static void main(String[] args) {
		int base = 5, expoente = 3;
		double b = 2, e = 5;
		double d;
		
		
		JOptionPane.showMessageDialog(null, "Pont�ncia 1 �: " + Math.pow(base, expoente) +
									  "\nPont�ncia 2 �: " + Math.pow(b, e));
		d = Double.parseDouble(JOptionPane.showInputDialog("Digite um Valor: "));
		
	   JOptionPane.showMessageDialog(null, "O Valor Arrendondado �: " + Math.round(d));

	}

}
