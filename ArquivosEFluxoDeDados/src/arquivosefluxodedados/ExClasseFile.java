package arquivosefluxodedados;

import java.io.File;
import javax.swing.JOptionPane;

public class ExClasseFile {

	public static void main(String[] args) {
		File arquivo = new File("C:\\Curso Java\\ExemploClasseFile.txt");
		JOptionPane.showMessageDialog(null, "Nome do Arquivo: " + arquivo.getName());
		System.out.println("Nome do Arquivo: " + arquivo.getName());
		System.out.println("===================================================================");
		JOptionPane.showMessageDialog(null, "Carminho do Arquivo: " + arquivo.getAbsolutePath());
		System.out.println("Caminho do Arquivo: " + arquivo.getAbsolutePath());
		System.out.println("===================================================================");
		JOptionPane.showMessageDialog(null, "O Arquivo Existe?: " + arquivo.exists());
		System.out.println("O Arquivo Existe?: " + arquivo.exists());
		System.out.println("===================================================================");
		JOptionPane.showMessageDialog(null, "� um Diret�rio?: " + arquivo.isDirectory());
		System.out.println("� um Diret�rio?: " +  arquivo.isDirectory());
		System.out.println("===================================================================");
		JOptionPane.showMessageDialog(null, "� um Arquivo?: " + arquivo.isFile());
		System.out.println("� um Arquivo?: " + arquivo.isFile());
		System.out.println("===================================================================");
		JOptionPane.showMessageDialog(null, "Pode ser Lido?: " + arquivo.canRead());
		System.out.println("Pode ser Lido?: " + arquivo.canRead());
		System.out.println("===================================================================");
		JOptionPane.showMessageDialog(null, "Pode ser Escrito?: " + arquivo.canWrite());
		System.out.println("Pode ser Escrito?: " + arquivo.canWrite());
		System.out.println("===================================================================");
		
	
		
		

	}

}
