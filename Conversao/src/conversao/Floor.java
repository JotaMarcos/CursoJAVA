package conversao;
import javax.swing.JOptionPane;

public class Floor {
	public static void main(String[] args) {
		double num;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Decimal: "));
		
		
		JOptionPane.showMessageDialog(null, "O Valor Digitado �: " + num +
									  "\n O Valor Usando Ceil �: " + Math.ceil(num) +	
									  "\n O Valor Usando Floor �: " + Math.floor(num));
		
		
		
	}
	

}
