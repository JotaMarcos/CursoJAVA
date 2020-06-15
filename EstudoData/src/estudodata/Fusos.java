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
		
		System.out.println("Fuso Horário Padrão: " + tr.getDisplayName());
		System.out.println("Idioma da Alemanha: " + tr.getDisplayName(Locale.GERMAN));
		*/
		
		TimeZone tz = TimeZone.getDefault();
		
		System.out.println("=====================================================================================================");
		System.out.println("Fuso Padrão: " + tz.getDisplayName());
		System.out.println("Fuso em Francês: " + tz.getDisplayName(Locale.FRANCE));
		System.out.println("Fuso com Estilo Longo: " + tz.getDisplayName(false, TimeZone.LONG));
		System.out.println("Fuso com Estilo Curto: " + tz.getDisplayName(false, TimeZone.SHORT));
		System.out.println("Fuso acrescido em Milíssegundos: " + tz.getDSTSavings() + " milíssegundos!");
		System.out.println("Fuso com horas acrescida: " + tz.getDSTSavings()/1000/60/60 + " horas!");
		System.out.println("Está no Horário de Verão?: " + tz.inDaylightTime(new Date()));
		
		
		System.out.println("=====================================================================================================");
		

	}

}
