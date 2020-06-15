package arquivosefluxodedados;

import java.io.File;

public class ExInformacaoSistema {

	public static void main(String[] args) {
		System.out.println("Separador de Path: " + File.pathSeparator);
		System.out.println("===================================================================");
		System.out.println("Separador de Diretório: " + File.separator);
		System.out.println("===================================================================");
		
		File discos[] = File.listRoots();
		
		for (int i = 0; i < discos.length; i++) {
			System.out.println("Disco: " + i + " : " + discos[i]);
		}
		
		System.out.println("===================================================================");
		

	}



}
