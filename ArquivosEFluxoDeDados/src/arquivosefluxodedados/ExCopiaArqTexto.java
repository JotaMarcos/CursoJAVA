package arquivosefluxodedados;

import java.io.File;

public class ExCopiaArqTexto {

	public static void main(String[] args) {
		File entrada = new File("C:\\Curso Java\\ExemploClasseFile.txt");
		File saida = new File("C:\\Curso Java\\CopiaArqTexto.txt");
		String s = ExLerTexto.ler(entrada);
		ExCriarTexto.escreve(saida, s);
	}

}
