package cursologicajava;

import javax.swing.JOptionPane;

public class Saida {

	public static void main(String[] args) {
		//Atributos
		String nome = "Jo�o Marcos Aires Duarte";
		int idade = 35;
		boolean casado = true;
		float salario = 12500.50f;
		char sexo = 'M';
		
		System.out.println("Nome: " + nome + "," + " Idade: "
				+ idade + " anos!" + "," + " Casado: " + casado 
				+  "," + " Sal�rio: " + salario + "," + " Sexo: " + sexo);
		System.out.println("");		
		//System.out.printf("Nome: %s \n Idade: %d \n Casado: %b \n Sal�rio: %f \n Sexo: %c", nome, idade, casado, salario, sexo);
		
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "," + " Idade: " + idade + " anos!" + "," + " Casado: " + casado +  "," + " Sal�rio: " + salario + "," + " Sexo: " + sexo);
				

	}

}
