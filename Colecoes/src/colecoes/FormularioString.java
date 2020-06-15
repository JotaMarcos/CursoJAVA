package colecoes;


import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;
import javax.swing.event.*;


import java.awt.event.*;

@SuppressWarnings({ "serial", "unused" })
public class FormularioString extends Formulario implements ActionListener{
	public static OperacoesVetor<String> cadastro;
	
	public FormularioString(){
		btnIncluir.addActionListener(this);
		btnExcluir.addActionListener(this);
		btnLimpar.addActionListener(this);
		btnListar.addActionListener(this);
		btnUltimo.addActionListener(this);
		

		int lim = Integer.parseInt(txtNumMaximo.getText());
		cadastro = new OperacoesVetor<String>(lim);
	}
	
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		
		if(obj == btnIncluir)
			incluir(txtValor.getText());
		if(obj == btnListar)
			taTexto.setText(listar());
		if(obj == btnExcluir)
			excluir();
		if(obj == btnLimpar)
			limpar();
		if(obj == btnUltimo)
			verUltimo();
		
		//taTexto.setText(listar());
		
	}
	
	public static void incluir(String txt){
		if(cadastro.estaCheio()){
			JOptionPane.showMessageDialog(null, "A lista já está cheia!!!", "Erro: ", ERROR_MESSAGE);
			return ;
		}
		
		cadastro.InserirItem(txt);
	}
	
	public static void excluir(){
		if(cadastro.estaVazio()){
			showMessageDialog(null, "Lista Vazia!!!", "Erro: ", ERROR_MESSAGE);
		} else {
			showMessageDialog(null, "Item Removido: " + cadastro.excluirUltimo());
		}
	}
	
	public static void limpar(){
		if(cadastro.estaVazio()){
			showMessageDialog(null, "Lista Vazia!!!", "Erro: ", ERROR_MESSAGE);
		} else {
			cadastro.limpar();
		}
	}
	
	public static String listar(){
		if(cadastro.estaVazio()){
			return "A lista está vazia!!!";
		} else {
			return cadastro.litarTodos();
		}
	}
	
	public static void verUltimo(){
		if(cadastro.estaVazio()){
			showMessageDialog(null, "Lista Vazia!!!", "Erro: ", ERROR_MESSAGE);
		} else {
			showMessageDialog(null, "Último elemento: " + cadastro.verUltimo());
		}
	}

	
	
	public static void main(String[] args) {
		
		//new Formulario.setVisible(true); - não inicializou o formulário no Main
		
		//Inicializa o Formulário no Main
		FormularioString frm = new FormularioString();
		frm.setVisible(true);
		
	}
	

}
