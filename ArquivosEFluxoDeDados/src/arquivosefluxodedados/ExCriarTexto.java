package arquivosefluxodedados;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExCriarTexto {

	public static void escreve(File arquivo, String texto){
		
		try {
			FileWriter writer = new FileWriter(arquivo);
			char[] c = texto.toCharArray();
			
			for(int i = 0; i < c.length; i++){
				writer.write(c[i]);
			}
			
			writer.close();
					
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
