package importante;

public class Funcionario extends Pessoa {
	
	
	public Funcionario(String nome, double salario) {
		super(nome, salario);
		
	}

	public String toString(){
		return "O salário de " + this.nome + " é R$ " + this.salario;
	}

	/*public boolean equals(Object o){
	Funcionario f = (Funcionario) o;
	if(this.nome == f.nome){
		return true;
	} else {
		return false;
	  }
    }*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
