package conversao;

import javax.swing.JOptionPane;

public class Random {

	private static String s;

	public static void main(String[] args) {
		setS("");
		int num = 0;
		
		for(int qtd = 1; qtd <= 5; qtd++){
			
			for(int x = 1; x <= 6; x++){
				num = (int) (Math.random() * 100);
				setS(getS() + num + "\n");
			}
			
		}
	
		JOptionPane.showMessageDialog(null, "O Valor Gerado é: " + num);
		
		
	}

	public static String getS() {
		return s;
	}

	public static void setS(String s) {
		Random.s = s;
	}
	

}
