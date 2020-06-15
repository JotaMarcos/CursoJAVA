package curso_poo;

public class ProgramaHeranca {
	public static void main(String[] args) {
		HerancaMae mae = new HerancaMae();
		
		HerancaFilha filha = new HerancaFilha();
		
		
		System.out.println(mae.imprimir());
		System.out.println(filha.imprimir1());
		System.out.println(filha.mostrar());
		System.out.println(filha.imprimir2());
		
		
	}

}
