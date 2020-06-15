package estudodata;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Fusos {

	public static void main(String[] args) {

		/*String[] fusos = TimeZone.getAvailableIDs(-4 * 60 * 60 * 1000);
		
		for(int i = 0; i < fusos.length; i++){
			System.out.println("\t " + fusos[i]);
		}*/
		
		/*TimeZone tr = TimeZone.getDefault();
		
		System.out.println("Fuso Hor�rio Padr�o: " + tr.getDisplayName());
		System.out.println("Idioma da Alemanha: " + tr.getDisplayName(Locale.GERMAN));
		*/
		
		TimeZone tz = TimeZone.getDefault();
		
		System.out.println("=====================================================================================================");
		System.out.println("Fuso Padr�o: " + tz.getDisplayName());
		System.out.println("Fuso em Franc�s: " + tz.getDisplayName(Locale.FRANCE));
		System.out.println("Fuso com Estilo Longo: " + tz.getDisplayName(false, TimeZone.LONG));
		System.out.println("Fuso com Estilo Curto: " + tz.getDisplayName(false, TimeZone.SHORT));
		System.out.println("Fuso acrescido em Mil�ssegundos: " + tz.getDSTSavings() + " mil�ssegundos!");
		System.out.println("Fuso com horas acrescida: " + tz.getDSTSavings()/1000/60/60 + " horas!");
		System.out.println("Est� no Hor�rio de Ver�o?: " + tz.inDaylightTime(new Date()));
		
		
		System.out.println("=====================================================================================================");
		

	}

}
