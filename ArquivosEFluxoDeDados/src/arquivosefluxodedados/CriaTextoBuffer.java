package arquivosefluxodedados;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CriaTextoBuffer {

	public static void escreve(File arquivo, String texto) throws IOException  {
		FileWriter writer = new FileWriter(arquivo);
		BufferedWriter bufWriter = new BufferedWriter(writer);
		bufWriter.write(texto);
		bufWriter.close();
		writer.close();
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
