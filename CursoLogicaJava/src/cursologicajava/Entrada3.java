package cursologicajava;

import javax.swing.JOptionPane;

public class Entrada3 {

	public static void main(String[] args) {
		/*String nome = JOptionPane.showInputDialog("Digite o seu Nome: ");
		System.out.println("Seu Nome é: " + nome);*/
		
		
		String nome = JOptionPane.showInputDialog("Digite o seu Nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua Idade: "));
		float salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu Salário: "));
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade + " anos!");
		System.out.println("Salário: R$ " + salario);
		
		

	}

}
