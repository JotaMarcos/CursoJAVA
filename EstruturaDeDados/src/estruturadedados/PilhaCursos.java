package estruturadedados;


import static javax.swing.JOptionPane.*;
import javax.swing.JOptionPane;
import javax.swing.event.*;
import java.awt.event.*;

@SuppressWarnings({ "serial", "unused" })
public class PilhaCursos extends Formulario implements ActionListener{
	public static Pilha<Cursos> pilha;
	
	public PilhaCursos(){
		btnIncluir.addActionListener(this);
		btnExcluir.addActionListener(this);
		//btnLimpar.addActionListener(this);
		btnListar.addActionListener(this);
		btnUltimo.addActionListener(this);
		

		int lim = Integer.parseInt(txtNumMaximo.getText());
		pilha = new Pilha<Cursos>(lim);
	}
	
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		
		if(obj == btnIncluir)
			incluir(txtValor.getText(), Double.parseDouble(txtNumMaximo.getText()));
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
	
	public static void incluir(String txt, double preco){
		if(pilha.cheia()){
			JOptionPane.showMessageDialog(null, "A Pilha já está Cheia!!!", "Erro: ", ERROR_MESSAGE);
			return ;
		}
		
		pilha.inserir(new Cursos(txt, preco));
	}
	
	public static void excluir(){
		if(pilha.vazia()){
			showMessageDialog(null, "Pilha Vazia!!!", "Erro: ", ERROR_MESSAGE);
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
			return "A Pilha está Vazia!!!";
		} else {
			return pilha.listarTodos();
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
		PilhaCursos frm = new PilhaCursos();
		frm.setVisible(true);
		
	}
	

}
