package arquivosefluxodedados;

import java.io.File;

public class ProgCopiaBinario {

	public static void main(String[] args) {
		File entrada = new File("C:\\Curso Java\\Panfleto.jpg");
		File saida = new File("C:\\Curso Java\\CopiaPanfleto.jpg");
		System.out.println("Inicianco a Cópia...");
		ExCopiaBinario.copia(entrada, saida);
		System.out.println("Copia Realizada com Sucesso!!!");

	}

}
