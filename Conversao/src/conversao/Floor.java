package conversao;
import javax.swing.JOptionPane;

public class Floor {
	public static void main(String[] args) {
		double num;
		
		num = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor Decimal: "));
		
		
		JOptionPane.showMessageDialog(null, "O Valor Digitado é: " + num +
									  "\n O Valor Usando Ceil é: " + Math.ceil(num) +	
									  "\n O Valor Usando Floor é: " + Math.floor(num));
		
		
		
	}
	

}
