package arquivosefluxodedados;

import java.io.File;
import java.io.FileReader;
//import java.io.IOException;

public class LerTexto {
public static String ler(File arquivo){
		
		StringBuffer sb = new StringBuffer();
		
		try {
			FileReader reader = new FileReader(arquivo);
			int c;
			
			do{
				c = reader.read();
				if(c != -1){
					sb.append( (char) c);
				}
				
			}while(c != -1);
			reader.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();			
		}
		
		return sb.toString();
		
	}
	
	

	public static void main(String[] args) {
		
		
	}
	
}
