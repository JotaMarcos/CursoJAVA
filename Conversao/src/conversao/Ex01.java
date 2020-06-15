package conversao;
import javax.swing.JOptionPane;

public class Ex01 {

	private static String y5;
	private static byte[] bs;

	public static void main(String[] args) {
		//Conversão de Inteiro para Float, Double, String
		int x = 10;
		//System.out.println("O Valor de X é: " + x + " Inteiro!");
		JOptionPane.showMessageDialog(null, "O Valor de X é: " + x + " Inteiro!");
		float y = (float) x;
		//System.out.println("O Valor de Y é: " + y  + " Float!");
		JOptionPane.showMessageDialog(null, "O Valor de Y é: " + y  + " Float!");
		double y2 = (double) x;
		//System.out.println("O Valor de Y é: " + y2  + " Double!");
		JOptionPane.showMessageDialog(null, "O Valor de Y é: " + y2  + " Double!");
		String y3 = String.valueOf(x);
		//System.out.println("O Valor de Y é: " + y3 + " String!");
		JOptionPane.showMessageDialog(null, "O Valor de Y é: " + y3 + " String!");
		
		//System.out.println("-------------------------------------");
		//Conversão de Double para Inteiro e String
		double x2 = 10.5;
		//System.out.println("Valor de X: " + x2);
		JOptionPane.showMessageDialog(null,"Valor de X: " + x2);
		int y4 = (int) x;
		//System.out.println("O Valor de Y: " + y4);
		JOptionPane.showMessageDialog(null, "O Valor de Y: " + y4);
		setY5(String.valueOf(x));
		
		//System.out.println("-------------------------------------");
		//Conversão de String para Inteiro, Double, Float e Vetores de Byte
		String x3 = "10";
		String x4 = "10.5";
		String x5 = "Java";
		
		int y6 = Integer.parseInt(x3);
		//System.out.println("O Valor de Y: " + y6);
		JOptionPane.showMessageDialog(null, "O Valor de Y: " + y6);
		double y7 = Double.parseDouble(x4);
		//System.out.println("Valor de Y: " + y7);
		JOptionPane.showMessageDialog(null, "O Valor de Y: " + y7);
		float y8 = Float.parseFloat(x4);
		//System.out.println("O Valor de Y: " + y8);
		JOptionPane.showMessageDialog(null, "O Valor de Y: " + y8);
		setBs(x5.getBytes());
		
		//System.out.println("-------------------------------------");
		//Conversão de Vetores de Byte para String
		byte[] x6 = {8, 5, 1, 9, 2, 7, 3};
		String y9 = new String(x6);
		//System.out.print("A quantidade de Valores de Y: " + y9.getBytes().length);
		JOptionPane.showMessageDialog(null, "A quantidade de Valores de Y: " + y9.getBytes().length);
		
		

	}

	public static byte[] getBs() {
		return bs;
	}

	public static void setBs(byte[] bs) {
		Ex01.bs = bs;
	}

	public static String getY5() {
		return y5;
	}

	public static void setY5(String y5) {
		Ex01.y5 = y5;
	}

}
