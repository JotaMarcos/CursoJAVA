package colecoes;

public class OperacoesVetor <E> {
	private E[] obj;
	private int posicao;
	
	public OperacoesVetor(int limite){
		
		obj = extracted(limite);
		
	}

	@SuppressWarnings("unchecked")
	private E[] extracted(int limite) {
		return (E[]) new Object[limite];
	}
	
	//
	public void InserirItem(E valor){
		obj[posicao] = valor;
		posicao ++;
	}
	
	//Excluir o �ltimo item
	public E  excluirUltimo(){
		--posicao;
		E elemento = obj[posicao];
		obj[posicao] = null;
		return elemento;
	}
	
	//Excluir tuod - Limpar
	public void limpar(){
		while (posicao > 0) {
			--posicao;
			obj[posicao] = null;
			
		}
	}
	
	//Listar todos
	public String litarTodos(){
		String txt = "";
		for (E elemento : obj) {
			if(elemento == null)
				break;
			txt += elemento + "\n ";
		}
		return txt;
	}
	
	public E verUltimo(){
		return obj[posicao - 1];
	}
	
	//Verifica se o Vetor est� cheio
	public boolean estaCheio(){
		//Verifica se o objeto � um igual a posi��o
		return obj.length == posicao;
	}
	
	//Verifica se o Vetor est� vazio
	public boolean estaVazio(){
		//Verifica se posicao � igual a zer
		return posicao == 0;
	}
	
	
	

}
