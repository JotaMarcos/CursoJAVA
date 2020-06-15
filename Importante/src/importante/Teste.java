package importante;

//import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) {
		/*System.out.println("Teste de Pacotes!");
		JOptionPane.showMessageDialog(null, "Teste de Pacotes!");*/
		
		/*@SuppressWarnings("unused")
		String str = "";
		@SuppressWarnings("unused")
		Funcionario s = new Funcionario("João Marcos", 2500);
		@SuppressWarnings("unused")
		Funcionario s2 = new Funcionario("João Marcos", 2500);
		FuncionarioPublico f = new FuncionarioPublico("Poliane", 4500);
		@SuppressWarnings("unused")
		Pessoa p = new Pessoa("Ellen", 15000);
		
		
		System.out.println("O Valor do toString: " + s.toString());
		str = "Resultado de Método! " + s;
		System.out.println(s.relatorio());
		System.out.println(str);*/
		
		/*if (s.equals(s2)) {
			System.out.println("Objetos são Iguais!");
		} else {
			System.out.println("Objetos são Diferentes!");
		}
		
		System.out.println("A Classe do s é: " + s.getClass().getName());
		System.out.println("A Classe do s2 é: " + s2.getClass().getName());
		System.out.println(s2.getClass());
		
		if(s2 instanceof Funcionario){
			System.out.println("É uma Instância!");
		} else {
			System.out.println("Não é uma Instância!");
		}*/
		
		
		/*if (f instanceof Funcionario) {
			System.out.println("É uma Instância!");
		} else {
			System.out.println("Não é uma Instância!");
		}
		
		if (s.getClass() == f.getClass()) {
			System.out.println("É uma Instância!");
		} else {
			System.out.println("Não é uma Instância!");
		}
		
		if (f instanceof Pessoa) {
			System.out.println("É uma Instância!");
		} else {
			System.out.println("Não é uma Instância!");
		}*/
		
		
		Animal c = new Cachorro();
		Cachorro c2 = (Cachorro) c;
		
		c2.latir();
		
		
		
		
		
		
	}
	
	

}
