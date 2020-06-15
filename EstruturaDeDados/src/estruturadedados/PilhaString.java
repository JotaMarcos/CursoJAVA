package estruturadedados;


import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;
import javax.swing.event.*;
import java.awt.event.*;

@SuppressWarnings({ "serial", "unused" })
public class PilhaString extends Formulario implements ActionListener{
	public static Pilha<String> pilha;
	
	public PilhaString(){
		
		btnIncluir.addActionListener(this);
		btnListar.addActionListener(this);
		btnExcluir.addActionListener(this);
		btnUltimo.addActionListener(this);
		

		int lim = Integer.parseInt(txtNumMaximo.getText());
		pilha = new Pilha<String>(lim);
	}
	
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		
		if(obj == btnIncluir)
			inserir(txtValor.getText());
		if(obj == btnListar)
			taTexto.setText(listar());
		if(obj == btnExcluir)
			excluir();
		if(obj == btnUltimo)
			ultimo();
		
		//taTexto.setText(listar());
		
	}
	
	public static void inserir(String txt){
		if(pilha.cheia()){
			JOptionPane.showMessageDialog(null, "A Pilha já está Cheia!!!", "Erro: ", ERROR_MESSAGE);
			return ;
		}
		
		pilha.inserir(txt);
	}
	
	public static String listar(){
		if(pilha.vazia()){
			return "A Pilha está Vazia!!!";
		} else {
			return pilha.listarTodos();
		}
	}
	
	public static void excluir(){
		if(pilha.vazia()){
			showMessageDialog(null, "Pilha Vazia!!!", "Erro: ", ERROR_MESSAGE);
		} else {
			showMessageDialog(null, "Item Removido: " + pilha.excluir());
		}
	}
	
	
		
	public static void ultimo(){
		if(pilha.vazia()){
			showMessageDialog(null, "Pilha Vazia!!!", "Erro: ", ERROR_MESSAGE);
		} else {
			showMessageDialog(null, "Último elemento: " + pilha.ultimo());
		}
	}

	
	
	public static void main(String[] args) {
		
		//new Formulario.setVisible(true); - não inicializou o formulário no Main
		
		//Inicializa o Formulário no Main
		PilhaString frm = new PilhaString();
		frm.setVisible(true);
		
	}
	

}
