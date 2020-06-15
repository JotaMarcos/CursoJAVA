package arquivosefluxodedados;

import java.io.File;
import java.io.IOException;


public class ProgBuffer {

	public static void main(String[] args) throws IOException {
		File entrada = new File("C:\\Curso Java\\ExemploClasseFile.txt");
		File saida = new File("C:\\Curso Java\\CopiaBuffer.txt");
		
		String s = LendoBuffer.ler(entrada);
		CriaTextoBuffer.escreve(saida, s);
		

	}

}
