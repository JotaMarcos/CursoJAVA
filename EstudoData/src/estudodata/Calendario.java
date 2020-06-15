package estudodata;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;



public class Calendario {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		DateFormat df = DateFormat.getDateInstance();
		
		
		
		System.out.println("============================================================================");
		System.out.println("Data e Hora Atual: " + c.getTime());
		System.out.println("Data e Hora Atual em Milíssegundos: " + c.getTimeInMillis() + " ms!");
		System.out.println("Nome da Classe: " + c.getClass().getName());
		System.out.println("----------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Dia: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("Hora: " + c.get(Calendar.HOUR_OF_DAY));
		System.out.println("----------------------------------------------------------------------------");
				
		c.set(Calendar.YEAR, 2009);
		System.out.println("Ano: " + c.get(Calendar.YEAR));
		
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println("Mês: " + c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()));
		
		System.out.println("----------------------------------------------------------------------------");
		
		//c.set(Calendar.MONTH, 5);
		c.add(Calendar.MONTH, 5);
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Mês: " + df.format(c.getTime()));
		
		System.out.println("----------------------------------------------------------------------------");
		
		c.roll(Calendar.MONTH, 5);
		System.out.println("Mês: " + c.get(Calendar.MONTH));
		System.out.println("Mês: " + df.format(c.getTime()));
				
		
		System.out.println("============================================================================");
		
		
		
	}

}
