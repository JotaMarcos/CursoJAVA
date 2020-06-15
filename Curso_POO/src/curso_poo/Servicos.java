package curso_poo;

public class Servicos {
	//Atributos
	private Cliente contratante;
	private Funcionario atendente;
	private String dataDeContrato;
	
	//Métodos Especiais
	public Cliente getContratante() {
		return this.contratante;
	}
	public void setContratante(Cliente contratante) {
		this.contratante = contratante;
	}
	public Funcionario getAtendente() {
		return this.atendente;
	}
	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}
	public String getDataDeContrato() {
		return this.dataDeContrato;
	}
	public void setDataDeContrato(String dataDeContrato) {
		this.dataDeContrato = dataDeContrato;
	}
	
	
	

}
