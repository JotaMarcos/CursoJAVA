package estudodata;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Calendario2 {

	public static void main(String[] args) {
		
		final long umDia = 24 * 60 * 60 * 100;
		final long umDia2 = 8640000;
		DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		System.out.println("============================================================================");
		String s1 = "01/01/2020";
		System.out.println("Data Inicial: " + s1);
		String s2 = "01/06/2020";
		System.out.println("Data Final: " + s2);
		System.out.println("----------------------------------------------------------------------------");
		
		try {
			Date data1 = df.parse(s1);
			Date data2 = df.parse(s2);
			
			c1.setTime(data1);
			c2.setTime(data2);
			
			long qtdeDia1 = c1.getTimeInMillis();
			long qtdeDia2 = c2.getTimeInMillis();
			
			long diferenca = (qtdeDia2 - qtdeDia1) / umDia2;
						
			System.out.println("Diferença: " + diferenca + " dias!");
			
			System.out.println("----------------------------------------------------------------------------");
			
			c2.add(Calendar.DAY_OF_YEAR, 30);
			Date maisTrinta = c2.getTime();
			System.out.println("Data: " + df.format(maisTrinta));
			
			System.out.println("----------------------------------------------------------------------------");
			
			c2.roll(Calendar.DAY_OF_YEAR, 30);
			Date maisTrinta2 = c2.getTime();
			System.out.println("Data: " + df.format(maisTrinta2));
			
			
		} catch (ParseException ex) {
			System.out.println(ex);
		}
		
		
		
		System.out.println("============================================================================");
		System.out.println("Milíssigundos: " + umDia + " ms!");		
		
		
		
		
		
		System.out.println("============================================================================");
		
	}

}
