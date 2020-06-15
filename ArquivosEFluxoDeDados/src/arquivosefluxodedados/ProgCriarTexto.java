package arquivosefluxodedados;

import java.io.File;

public class ProgCriarTexto {

	public static void main(String[] args) {
		File arquivo = new File("C:\\Curso Java\\Saida.txt");		
		String texto = "Este Texto será Passado para o arquivo Criado!";
		ExCriarTexto.escreve(arquivo, texto);
		
		

	}

}
