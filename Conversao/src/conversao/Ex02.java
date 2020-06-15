package conversao;

import javax.swing.JOptionPane;

public class Ex02 {
	public static void main(String[] args) {
		char[] arrayDeChar = {'J','o','ã','o',' ','M','a','r','c','o','s'};
		String s = "Minha String";
		
		String s1 = new String();
		String s2 = new String(s);
		String s3= new String(arrayDeChar);
		String s4= new String(arrayDeChar, 0,4);
		
		
		JOptionPane.showMessageDialog(null, "O Valor de S1: " + s1 + 
											"\n O Valor de S2: " + s2 +
											"\n O Valor de S3: " + s3 +
											"\n O Valor de S4: " + s4);
		
	}

}
