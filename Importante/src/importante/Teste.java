package importante;

//import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) {
		/*System.out.println("Teste de Pacotes!");
		JOptionPane.showMessageDialog(null, "Teste de Pacotes!");*/
		
		/*@SuppressWarnings("unused")
		String str = "";
		@SuppressWarnings("unused")
		Funcionario s = new Funcionario("Jo�o Marcos", 2500);
		@SuppressWarnings("unused")
		Funcionario s2 = new Funcionario("Jo�o Marcos", 2500);
		FuncionarioPublico f = new FuncionarioPublico("Poliane", 4500);
		@SuppressWarnings("unused")
		Pessoa p = new Pessoa("Ellen", 15000);
		
		
		System.out.println("O Valor do toString: " + s.toString());
		str = "Resultado de M�todo! " + s;
		System.out.println(s.relatorio());
		System.out.println(str);*/
		
		/*if (s.equals(s2)) {
			System.out.println("Objetos s�o Iguais!");
		} else {
			System.out.println("Objetos s�o Diferentes!");
		}
		
		System.out.println("A Classe do s �: " + s.getClass().getName());
		System.out.println("A Classe do s2 �: " + s2.getClass().getName());
		System.out.println(s2.getClass());
		
		if(s2 instanceof Funcionario){
			System.out.println("� uma Inst�ncia!");
		} else {
			System.out.println("N�o � uma Inst�ncia!");
		}*/
		
		
		/*if (f instanceof Funcionario) {
			System.out.println("� uma Inst�ncia!");
		} else {
			System.out.println("N�o � uma Inst�ncia!");
		}
		
		if (s.getClass() == f.getClass()) {
			System.out.println("� uma Inst�ncia!");
		} else {
			System.out.println("N�o � uma Inst�ncia!");
		}
		
		if (f instanceof Pessoa) {
			System.out.println("� uma Inst�ncia!");
		} else {
			System.out.println("N�o � uma Inst�ncia!");
		}*/
		
		
		Animal c = new Cachorro();
		Cachorro c2 = (Cachorro) c;
		
		c2.latir();
		
		
		
		
		
		
	}
	
	

}
