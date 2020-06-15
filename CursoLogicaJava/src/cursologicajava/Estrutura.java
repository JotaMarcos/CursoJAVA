package cursologicajava;

import javax.swing.JOptionPane;

public class Estrutura {

	public static void main(String[] args) {
		//If Else
		//int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um Nùmero de 1 a 12: "));		
		/*if (valor == 1) {
			System.out.println("Janeiro");
		} else if(valor == 2) {
			System.out.println("Fevereiro");
		} else if(valor == 3){
			System.out.println("Março");
		} else if(valor == 4){
			System.out.println("Abril");
		} else if(valor == 5){
			System.out.println("Maio");
		} else if(valor == 6){
			System.out.println("Junho");
		} else if(valor == 7){
			System.out.println("Julho");
		} else if(valor == 8){
			System.out.println("Agosto");
		} else if(valor == 9){
			System.out.println("Setembro");
		} else if(valor == 10){
			System.out.println("Outubro");
		} else if(valor == 11){
			System.out.println("Novembro");
		} else if(valor == 12){
			System.out.println("Dezembro");
		} else {
			System.out.println("Valor Inválido! Tente Novamente!");
		}
		
		System.out.println("");
		//If Else
		//int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um Nùmero de 1 a 12: "));
		if (valor == 1) {
			JOptionPane.showMessageDialog(null, "Janeiro");
		} else if(valor == 2) {
			JOptionPane.showMessageDialog(null, "Fevereiro");
		} else if(valor == 3) {
			JOptionPane.showMessageDialog(null, "Março");
		} else if(valor == 4) {
			JOptionPane.showMessageDialog(null, "Abril");
		} else if(valor == 5) {
			JOptionPane.showMessageDialog(null, "Maio");
		} else if(valor == 6) {
			JOptionPane.showMessageDialog(null, "Junho");
		}else if(valor == 7) {
			JOptionPane.showMessageDialog(null, "Julho");
		} else if(valor == 8) {
			JOptionPane.showMessageDialog(null, "Agosto");
		} else if(valor == 9) {
			JOptionPane.showMessageDialog(null, "Setembro");
		} else if(valor == 10) {
			JOptionPane.showMessageDialog(null, "Outubro");
		} else if(valor == 11) {
			JOptionPane.showMessageDialog(null, "Novembro");
		} else if(valor == 12) {
			JOptionPane.showMessageDialog(null, "Dezembro");
		} else {
			JOptionPane.showMessageDialog(null, "Valor Inválido! Tente Novamente!");
		}*/
		
		//Switch
		/*switch (valor) {
		case 1:
			JOptionPane.showMessageDialog(null, "Janeiro");			
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Fevereiro");			
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Março");			
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Abril");			
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Maio");			
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Junho");			
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Julho");			
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "Agosto");			
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "Setembro");			
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "Outubro");			
			break;
		case 11:
			JOptionPane.showMessageDialog(null, "Novembro");			
			break;
		case 12:
			JOptionPane.showMessageDialog(null, "Dezembro");			
			break;

		default:
			JOptionPane.showMessageDialog(null, "Valor Inválido! Tente Novamente!");
			break;
		}*/
		
		

		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite um Nùmero de 1 a 10: "));
		String resultado;
		
		/*if (nota >= 7) {
			JOptionPane.showMessageDialog(null, resultado = "Aprovado!");
		} else {
			JOptionPane.showMessageDialog(null, resultado = "Reprovado!");
		}*/
		
		//Operador Ternário
		resultado = ((nota >= 7) ? "Aprovado" : "Reprovado");
		JOptionPane.showMessageDialog(null, resultado);
		
		
		
		

	}

}
