package estruturadedados;


import static javax.swing.JOptionPane.*;
import javax.swing.JOptionPane;
import javax.swing.event.*;


import java.awt.event.*;

@SuppressWarnings({ "serial", "unused" })
public class PilhaClientes extends Formulario implements ActionListener{
	public static Pilha<Clientes> pilha;
	
	public PilhaClientes(){
		btnIncluir.addActionListener(this);
		btnExcluir.addActionListener(this);
		//btnLimpar.addActionListener(this);
		btnListar.addActionListener(this);
		btnUltimo.addActionListener(this);
		

		int lim = Integer.parseInt(txtNumMaximo.getText());
		pilha = new Pilha<Clientes>(lim);
	}
	
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		
		if(obj == btnIncluir)
			incluir(txtValor.getText(), txtNumMaximo.getText());
		if(obj == btnListar)
			taTexto.setText(listar());
		if(obj == btnExcluir)
			excluir();
		/*if(obj == btnLimpar)
			limpar();*/
		if(obj == btnUltimo)
			ultimo();
		
		//taTexto.setText(listar());
		
	}
	
	public static void incluir(String txt, String nome){
		if(pilha.cheia()){
			JOptionPane.showMessageDialog(null, "A lista j� est� cheia!!!", "Erro: ", ERROR_MESSAGE);
			return ;
		}
		
		pilha.inserir(new Clientes(txt, nome));
	}
	
	public static void excluir(){
		if(pilha.vazia()){
			showMessageDialog(null, "Lista Vazia!!!", "Erro: ", ERROR_MESSAGE);
		} else {
			showMessageDialog(null, "Item Removido: " + pilha.excluir());
		}
	}
	
	/*public static void limpar(){
		if(pilha.vazia()){
			showMessageDialog(null, "Lista Vazia!!!", "Erro: ", ERROR_MESSAGE);
		} else {
			pilha.limpar();
		}
	}*/
	
	public static String listar(){
		if(pilha.vazia()){
			return "A lista est� vazia!!!";
		} else {
			return pilha.listarTodos();
		}
	}
	
	public static void ultimo(){
		if(pilha.vazia()){
			showMessageDialog(null, "Lista Vazia!!!", "Erro: ", ERROR_MESSAGE);
		} else {
			showMessageDialog(null, "�ltimo elemento: " + pilha.ultimo());
		}
	}

	
	
	public static void main(String[] args) {
		
		//new Formulario.setVisible(true); - n�o inicializou o formul�rio no Main
		
		//Inicializa o Formul�rio no Main
		PilhaClientes frm = new PilhaClientes();
		frm.setVisible(true);
		
	}
	

}
