package conversao;
import javax.swing.JOptionPane;

public class Max {
	public static void main(String[] args) {
		int n1 = 5, n2 = 10;
		float n3 = 10.5f, n4 = 5.8f;
		double n5 = 150.8, n6 = 100.3;

		
		/*n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor Inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor Inteiro: "));
		n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite um Valor Decimal: "));
		n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite um Valor Decimal: "));
		n5 = Double.parseDouble(JOptionPane.showInputDialog("Digite um Valor Decimal: "));
		n6 = Double.parseDouble(JOptionPane.showInputDialog("Digite um Valor Decimal: "));*/
		
		
		
		JOptionPane.showMessageDialog(null, "\n O Valor Usando Max é: " + Math.max(n1, n2) +
									  "\n O Valor Usando Max é: " + Math.max(n3, n4) +
									  "\n O Valor Usando Max é: " + Math.max(n5, n6));
																	  
		
		
		
	}
	
	

}
