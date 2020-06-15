package arquivosefluxodedados;

import java.io.File;


public class ProgLerTexto {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\Curso Java\\ExemploClasseFile.txt");
		String s = ExLerTexto.ler(arquivo);
		System.out.println(s);
		System.out.println("===================================================================");
		

	}

}
