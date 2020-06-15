package estruturadedados;

public class Pilha <E> {
	private static final String UNCHECKED = "unchecked";
	private E[] P;
	private int topo;
	@SuppressWarnings(UNCHECKED)
	public Pilha(int limite	) {
		P = (E[]) new Object [limite];
		topo = -1;
		
	}
	
	
	public void inserir(E txt){
			topo++; // topo = topo + 1;
			P[topo] = (E) txt;
	}
	
	public E excluir(){
		E elemento = P[topo];
		P[topo] = null;
		topo--; // topo = topo - 1;
		return elemento;
	}
	
	
	public boolean vazia(){
		if(topo == -1){
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean cheia(){
		if (topo == (P.length -1)) {
			return true;
		} else {
			return false;
		}
	}
	
	public E ultimo(){
		return P[topo];
	}
		
	//Litar Todos
	public String listarTodos(){
		String txt = "";
		for (E elemento : P) {
			if(elemento == null){
				break;
			}
			txt += elemento + "\n";
		}
		return txt;
	}
	
	public void limpar(){
		while (topo > 0) {
			--topo;
			P[topo] = null;
			
		}
	}

	

}
