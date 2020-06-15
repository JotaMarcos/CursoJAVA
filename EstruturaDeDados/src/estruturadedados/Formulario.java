package estruturadedados;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Formulario extends JFrame {
	

	private JPanel pnNorte, pnCentro, pnSul;
	public JTextArea taTexto;
	public JTextField txtValor, txtNumMaximo;
	protected JButton btnIncluir, btnExcluir, btnLimpar, btnListar, btnUltimo;
	

	 
    
	public Formulario(){	
		super("Formulário Padrão");
		setSize(250, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container tela = getContentPane();
		tela.setLayout(new BorderLayout());
		
		txtValor = new JTextField();
		pnNorte = new JPanel();
		pnNorte.setLayout(new GridLayout(1,2,5,5));
		pnNorte.add(txtValor);
		
		tela.add(pnNorte, BorderLayout.NORTH);
		
		taTexto = new JTextArea();
		pnCentro = new JPanel();
		pnCentro.setLayout(new GridLayout(1,1));
		pnCentro.add(new JScrollPane(taTexto));
		
		tela.add(pnCentro, BorderLayout.CENTER);
		
		txtNumMaximo = new JTextField("5");
		
		
		
		btnIncluir = new JButton("Inserir");
		btnExcluir = new JButton("Excluir");
		
		//btnLimpar = new JButton("Limpar");
		btnListar = new JButton("Listar");
		
		btnUltimo = new JButton("Último");
		
		pnSul = new JPanel();
		pnSul.setLayout(new GridLayout(3,2,2,2));
		pnSul.add(btnIncluir);
		pnSul.add(btnExcluir);
		//pnSul.add(btnLimpar);
		pnSul.add(btnListar);
		pnSul.add(btnUltimo);
		pnSul.add(txtNumMaximo);
		
		tela.add(pnSul, BorderLayout.SOUTH);
		
	}
	
	/*public static void main(String[] args) {
		
		//new Formulario.setVisible(true); - não inicializou o formulário no Main
		
		//Inicializa o Formulário no Main
		Formulario frm = new Formulario();
		frm.setVisible(true);		
	}*/

}


