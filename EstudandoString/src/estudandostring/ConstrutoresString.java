package estudandostring;

public class ConstrutoresString {

	public static void main(String[] args) {
		/*int valor = 100;
		String str = "João Marcos";
		
		String str2 = new String("Poliane Cardoso");
		
		char[] arrayDeChar = {'J', 'o', 'ã', 'o', ' ', 'M', 'a', 'r', 'c', 'o', 's'};
		String s = new String("João Marcos");
		
		String s1 = new String();
		String s2 = new String(s);
		String s3 = new String(arrayDeChar);
		String s4= new String(arrayDeChar, 3, 5);
		String s5 = new String(s + s4);
		
		
		
		System.out.println("Seja Bem Vindo: " + str + "!");
		System.out.println("Seja Bem Vinda: " + str2 + "!");
		System.out.println("-----------------------------------------------");
		
		System.out.println("Valores do Vetor: ");
		for(int i = 0; i < arrayDeChar.length; i++){
			System.out.print(arrayDeChar[i]);
			
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		
		System.out.println("Nome: " + s);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Nome: " + s1);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Nome: " + s2);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Nome: " + s3);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Nome: " + s4);
		System.out.println("-----------------------------------------------");
		
		System.out.println("Nome: " + s5);
		System.out.println("-----------------------------------------------");
		
		s5 = "" + valor;
		System.out.println("Valor: " + s5);
		System.out.println("-----------------------------------------------");
		*/
		
		/*String s = new String("João Marcos");
		
		System.out.println("Quantidade de Caracteres: " + s.length());
		System.out.println("Quantidade de Caracteres: " + "Aires Duarte".length());
		
		System.out.println("----------------------------------");
		
		for(int i = 0; i < s.length(); i++){
			System.out.println(s.charAt(i));
		}
		
		System.out.println("-------------------------------------");
		System.out.println("Maiúsculo: " + s.toUpperCase());
		System.out.println("Minúsculo: " + s.toLowerCase());
		System.out.println("Original: " + s);
		*/
		
		/*String s = new String("João Marcos Aires Duarte");
		char[] meuChar = new char[5];
		
		s.getChars(12, 17, meuChar, 0);
		
		System.out.println("-------------------------------------");
		System.out.println("Maiúsculo: " + s.toUpperCase());
		System.out.println("Minúsculo: " + s.toLowerCase());
		System.out.println("Original: " + s);
		
		System.out.println("-------------------------------------");
		for(char ch : meuChar){
			System.out.println(ch);
		}*/
		
		
		/*String s1 = new String("Curso de Java");
		String s2 = "joão marcos";
		String s3 = "Formação Java";
		String s4 = "formação java";
		
		
		if(s1 == "Curso de Java"){
			System.out.println("Strings Iguais!");
		} else {
			System.out.println("Strings Diferentes!");
		}
		
		System.out.println("-------------------------------");
		
		if (s1.equals("Curso de Java")) {
			System.out.println("Strings Iguais!");
		} else {
			System.out.println("Strings Diferentes!");
		}
		
		System.out.println("-------------------------------");
		
		if (s3.equals(s4)) {
			System.out.println("Strigs Iguais!");
		} else {
			System.out.println("Strings Diferentes!");
		}
		
		System.out.println("-------------------------------");
		
		if (s3 == s4) {
			System.out.println("Strings Iguais!");
		} else {
			System.out.println("Strings Diferentes!");
		}
		
		System.out.println("-------------------------------");
		
		if (s3.equalsIgnoreCase(s4)) {
			System.out.println("Strings Iguais!");
		} else {
			System.out.println("Strings Diferentes!");
		}
		
		System.out.println("-------------------------------");
		
		System.out.println("s1 e s2: " + s1.compareTo(s2));
		System.out.println("s2 e s1: " + s2.compareTo(s1));
		System.out.println("s1 e s1: " + s1.compareTo(s1));
		System.out.println("s3 e s4: " + s3.compareTo(s4));
		System.out.println("s4 e s3: " + s4.compareTo(s3));
		
		System.out.println("-------------------------------");
		
		System.out.println("s1 e s2: " + s1.compareToIgnoreCase(s2));
		System.out.println("s2 e s1: " + s2.compareToIgnoreCase(s1));
		System.out.println("s1 e s1: " + s1.compareToIgnoreCase(s1));
		System.out.println("s3 e s4: " + s3.compareToIgnoreCase(s4));
		System.out.println("s4 e s3: " + s4.compareToIgnoreCase(s3));
		
		System.out.println("-------------------------------");
		
		if (s3.regionMatches (0, s4, 0, 8)) {
			System.out.println("Strings Iguais!");
		} else {
			System.out.println("Strings Diferentes!");
		}		
		
		System.out.println("-------------------------------");
		
		
		if (s3.regionMatches(true, 9, s4, 15, 4)) {
			System.out.println("Strings Iguais!");
		} else {
			System.out.println("Strings Diferentes!");
		}	*/
		
		
		//String s1 = new String("Curso de Java");
		/*String s1 = new String("masterbareweb@gmail.com");
		String s2 = "joão marcos";
		String s3 = "Formação Java";
		String s4 = "formação java";
		
		
		

		
		
		if (s1.startsWith("Java")) {
			System.out.println("String Localizada!");
		} else {
			System.out.println("String não Localizada!");
		}	
		
		System.out.println("---------------------------------------");
		
		if (s1.endsWith("Java")) {
			System.out.println("String Localizada!");
		} else {
			System.out.println("String não Localizada!");
		}	
		
		System.out.println("---------------------------------------");
		
		System.out.println(s1.charAt(10));
		
		System.out.println("---------------------------------------");
		
		System.out.println(s1.indexOf("@"));
		System.out.println(s1.indexOf("m"));
		System.out.println(s1.indexOf("m", 4));
		System.out.println(s1.lastIndexOf("m"));
		System.out.println(s1.charAt(13));*/
		
		
		
		
		/*String s1 = new String("masterbareweb@gmail.com");
		String s2 = "joão marcos";
		String s3 = "";
		String s4 = "formação java";
		
		System.out.println("-----------------------------------");
		s3 = s1.substring(0, s1.indexOf("@"));
		System.out.println("Usuário: " + s3);
		
		System.out.println("-----------------------------------");
		s3 = s1.substring(s1.indexOf("@"));
		System.out.println("Domínio: " + s3);
		
		System.out.println("-----------------------------------");
		s3 = s1.substring(0, s1.indexOf(".com") + 4);
		System.out.println("E-mail: " + s3);
		
		System.out.println("-----------------------------------");		
		s3 = s1.substring(s1.indexOf("@") + 1, s1.indexOf("."));	
		System.out.println("Serviço de E-mail: " + s3);
		*/
		
		/*String s1 = new String("masterbareweb@gmail.com");
		String s2 = "joão marcos";
		String s3 = "";
		String s4 = "";
		char[] ch = s2.toCharArray();
		
		System.out.println("-----------------------------------");
		s3 = s1.replace('.', '-');
		System.out.println(s3);
		
		System.out.println("-----------------------------------");
		s3 = s1.replace('-', '.');
		System.out.println(s3);
		
		System.out.println("-----------------------------------");
		System.out.println(s2);
		
		System.out.println("-----------------------------------");
		s4 = s2.trim();
		System.out.println(s4);
		
		System.out.println("-----------------------------------");
		System.out.println(s2.length());
		
		System.out.println("-----------------------------------");
		s4 = s2.trim();
		System.out.println(s4.length());
		
		
		System.out.println("-----------------------------------");
		s4 = s2.trim();
		System.out.println(ch);
		System.out.println("-----------------------------------");
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println(s2.concat(" " + s3));*/
		
		
		/*String s1 = new String("Eu João Marcos estou estudando Strings no Java!");
		String[] s2 = s1.split(" ");
		
		
		
		
		for(int i = 0; i < s2.length; i++){
			System.out.println("----------------------------------");
			System.out.println(s2[i]);
		}
		
		System.out.println(" ");
		
		String s3 = "www.masterbareweb.com.br";
		String[] s4 = s3.split("\\.");
		
		System.out.println("Acesse o Site!");
		for(int i = 0; i < s4.length; i++){
			
			System.out.println("----------------------------------");
			System.out.println(s4[i]);
		}*/
		
		/*
		String s1 = new String("www.masterbareweb");
		String[] s2 = s1.split("\\.");
		String s3 = "Aires Duarte";
		String s4 = "";
		
		int i = s3.codePointAt(0);
		char ch = (char) i;
		
		System.out.println("--------------------------------------");
		System.out.println(i);
		System.out.println("--------------------------------------");
		System.out.println(ch);
		
		System.out.println("");
		
		int i2 = s3.codePointBefore(3);
		char ch2 = (char) i2;
		
		System.out.println("--------------------------------------");
		System.out.println(i2);
		System.out.println("--------------------------------------");
		System.out.println(ch2);
		
		
		System.out.println("");
		
		int i3 = s3.codePointCount(0, 5);
		char ch3 = (char) i3;
		
		System.out.println("--------------------------------------");
		System.out.println(i3);
		System.out.println("--------------------------------------");
		System.out.println(ch3);
		*/
		
		
		/*String s1 = new String("www.masterbareweb.com.br");
		
		
		int a = 150;
		s1 = String.valueOf(a);
		
		System.out.println("-------------------------------------");
		System.out.println(s1);
		
		
		System.out.println("");
		
		String s2 = "1";
		
		if (s2.isEmpty()) {
			System.out.println("Zero!");
		} else {
			System.out.println("Maior que Zero!!");
		}*/
		
		
		/*
		String s1 = "João Marcos ";
		
		System.out.println("-------------------------------------");
		System.out.println(s1);
		
		for(int i = 0; i < 100; i++){
			System.out.println(s1.concat(" Aires Duarte" + i));
		}
		*/
		
		
		/*
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder(100);
		StringBuilder sb3 = new StringBuilder("João Marcos");
		
		
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		*/
		
		/*Object obj = "Objeto";
		String str = "String";
		char[] C = {'a', 'b', 'c', 'd'};
		boolean b = true;
		char ch = 'z';
		int i = 200;
		long l = 500000;
		float f = 3.5f;
		double d = 333.15;
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(0, obj);
		sb.append(0, " ");
		System.out.println(sb.toString());
		
		sb.append(0, str);
		sb.append(0, " ");
		System.out.println(sb.toString());
		
		sb.append(0, C);
		sb.append(0, " ");
		System.out.println(sb.toString());
		
		sb.append(0, b);
		sb.append(0, " ");
		System.out.println(sb.toString());
		
		sb.append(0, ch);
		sb.append(0, " ");
		System.out.println(sb.toString());
		
		sb.append(0, i);
		sb.append(0, " ");
		System.out.println(sb.toString());
		
		sb.append(0, l);
		sb.append(0, " ");
		System.out.println(sb.toString());
		
		sb.append(0, f);
		sb.append(0, " ");
		System.out.println(sb.toString());
		
		sb.append(0, d);
		sb.append(0, " ");
		System.out.println(sb.toString());
		*/
		
		/*String s = "Test";
		
		s += "ando";
		s += " String!";
		
		System.out.println(s);
		System.out.println();
		System.out.println("---------------------------------------");
		
		//Append
		Object obj = "Objeto";
		String str = "String";
		char[] C = {'a', 'b', 'c', 'd'};
		boolean b = true;
		char ch = 'z';
		int i = 200;
		long l = 500000;
		float f = 3.5f;
		double d = 333.15;
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(obj);
		sb.append(" ");		
		System.out.println(sb.toString());
		
		sb.append(str);
		sb.append(" ");
		System.out.println(sb.toString());
		
		sb.append(C);
		sb.append(" ");
		System.out.println(sb.toString());
		
		sb.append(b);
		sb.append(" ");
		System.out.println(sb.toString());
		
		sb.append(ch);
		sb.append(" ");
		System.out.println(sb.toString());
		
		sb.append(i);
		sb.append(" ");
		System.out.println(sb.toString());
		
		sb.append(l);
		sb.append(" ");
		System.out.println(sb.toString());
		
		sb.append(f);
		sb.append(" ");
		System.out.println(sb.toString());
		
		sb.append(d);
		sb.append(" ");
		System.out.println(sb.toString());
		*/
		
		StringBuilder sb = new StringBuilder("www.masterbareweb.com.br");
		
		/*sb.delete(0, 4);		
		System.out.println(sb.toString());
		
		sb.deleteCharAt(10);		
		System.out.println(sb.toString());*/
		
		sb.reverse();
		sb.trimToSize();
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.toString());
		
		
		
			
		
		
		
		

	}

}
