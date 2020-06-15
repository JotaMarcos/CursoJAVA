package excecoes;

import javax.swing.JOptionPane;

public class Ex01 {
	
	//Divisão por Zero
	/*public static int divisao(int numerador, int denominador) throws ArithmeticException{
		return numerador / denominador;
	}
	
	public static void main(String[] args) {
		int num, den;
		boolean continua = true;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite o Numeador: "));
		
		do{
			try {
				
				den = Integer.parseInt(JOptionPane.showInputDialog("Digite o Denominador: "));
				
				JOptionPane.showMessageDialog(null, "A Divisão é: " + divisao(num, den));
				continua = false;
				
			} catch (ArithmeticException erro1) {
				//JOptionPane.showMessageDialog(null, "Ocorreu o seguinte Erro: " + erro1 + "\n Digite os Valores Novamente!");
				JOptionPane.showMessageDialog(null, "O Denominador não pode ser Zero! \n Digite os Valores Novamente!");
			}
			
			catch(NumberFormatException erro2){
				JOptionPane.showMessageDialog(null, "O Denominador tem que ser um Valor Inteiro! ");
			}
			
			finally {
				JOptionPane.showMessageDialog(null, "Executou o Finally!!!");
			}
			
		} while(continua);*/
	
		

	public static void main(String[] args) {
		
		int x = 10, y =0, z;
		try {
			z = (x / y);
			//System.out.println("O Valor de Z é: " + z);
			JOptionPane.showMessageDialog(null, "O Valor de Z é: " + z);
		} catch (Exception erro) {
			//System.out.println(erro.getMessage());
			//System.out.println(erro.printStackTrace());
			JOptionPane.showMessageDialog(null, erro.getMessage());
			//erro.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
