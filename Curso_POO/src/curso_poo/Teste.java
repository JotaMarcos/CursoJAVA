package curso_poo;

public class Teste {

	public static void main(String[] args) {
		/*System.out.println("Olá, Mundo da POO!");
		System.out.println("Estou Testando Java!");
		
		Conta c1 = new Conta();
		c1.limite = 10;
		c1.numero = 15;
		
		System.out.println("----------------------------------------------------");
		System.out.println();
		
		System.out.println("==================Detalhe da Conta==================");
		System.out.println("Número da Conta: " + c1.numero);
		System.out.println("Saldo da Conta: " + c1.saldo);
		System.out.println("Limite da Conta: " + c1.limite);
		
		c1.deposita(250);
		c1.deposita(1000);
		
		System.out.println("==================Detalhe da Conta==================");
		System.out.println("Número da Conta: " + c1.numero);
		System.out.println("Saldo da Conta: " + c1.saldo);
		System.out.println("Limite da Conta: " + c1.limite);
		
		c1.saca(150);
		
		System.out.println("==================Detalhe da Conta==================");
		System.out.println("Número da Conta: " + c1.numero);
		System.out.println("Saldo da Conta: " + c1.saldo);
		System.out.println("Limite da Conta: " + c1.limite);
		
		
		
		Conta c2 = new Conta();
		c2.numero = 200;
		c2.saldo = 580;
		c2.deposita(1000);
		c2.limite = 1000;
		
		
		System.out.println("----------------------------------------------------");
		System.out.println();
		
		Conta c2 = c1;
		c2.deposita(300);
		
		c1.deposita(110);
		
		System.out.println("==================Detalhe da Conta==================");
		System.out.println("Número da Conta: " + c2.numero);
		System.out.println("Saldo da Conta: " + c2.saldo);
		System.out.println("Limite da Conta: " + c2.limite);
		
		
		System.out.println("==================Detalhe da Conta==================");
		System.out.println("Número da Conta: " + c1.numero);
		System.out.println("Saldo da Conta: " + c1.saldo);
		System.out.println("Limite da Conta: " + c1.limite);
		
		System.out.println("----------------------------------------------------");
		System.out.println();*/
		
		/*Conta c1 = new Conta();
		Cliente cli = new Cliente();
		
		c1.titular = cli;
		
		cli.nome = "João Marcos Aires Duarte";
		
		
		System.out.println("Cliente: " + c1.titular.nome);*/
		
		/*Conta c1 = new Conta();
		Cliente cli = c1.titular;						
		cli.nome = "Teste";	
		c1.deposita(250);
		
		if (c1.saca(250)){
			System.out.println("Foi possível Sacar!");
		} else {
			System.out.println("Não foi possível Sacar!");
		}
		
		c1.saldoAtual();
		System.out.println("Saldo Anterior!");
		System.out.println("O Saldo Atual do Cliente é: " + c1.saldoAtual());
		System.out.println("---------------------------------------------------");
		
		c1.deposita(2450.75);
		c1.saldoAtual();
		
		System.out.println("Saldo após o Depósitol!");
		System.out.println("O Saldo Atual do Cliente é: " + c1.saldoAtual());
		System.out.println("---------------------------------------------------");
		
		c1.saca(575.50);
		System.out.println("Saldo após o Depósitol!");
		System.out.println("O Saldo Atual do Cliente é: " + c1.saldoAtual());
		System.out.println("---------------------------------------------------");
		
		System.out.println("--------------------------------------------------------");
		System.out.println("O Saldo do Cliene é: R$ " + c1.getSaldo());
		System.out.println("--------------------------------------------------------");
		
		c1.setNumero(300);
		c1.setSaldo(2500);
						
		
		System.out.println("O Número da Conta do Cliene é: " + c1.getNumero());
		System.out.println("---------------------Saldo Anterior---------------------");
		System.out.println("O Saldo do Cliene é: R$ " + c1.getSaldo());
		System.out.println("--------------------------------------------------------");
		
		c1.saca(750.85);
		System.out.println("---------------------Saldo Atual------------------------");
		System.out.println("O Saldo do Cliene é: R$ " + c1.getSaldo());
		System.out.println("--------------------------------------------------------");
		*/
		
		
		/*Conta c1 = new Conta();
		System.out.println("Saldo Anterior de C1: R$ " + c1.saldoAtual());
		c1.deposita(300);
		System.out.println("Saldo Anterior de C1: R$ " + c1.saldoAtual());
				
		Conta c2 = new Conta();
		System.out.println("Saldo Anterior de C2: R$ " + c2.saldoAtual());		 
		
		if(c1.transferir(c2, 400)){
			System.out.println("Valor Transferido com Sucesso!");
		} else {
			System.out.println("Saldo Insuficiente!");
		}
		
		
		System.out.println("Saldo Atual de de C1: R$ " + c1.saldoAtual());
		System.out.println("Saldo Atual de C2: R$ " + c2.saldoAtual());
		*/
		
		
		/*Agencia ag1 = new Agencia();
		
		System.out.println("Código da Agência: " + ag1.getCodigo());
		*/
		
		
		/*Cliente cli = new Cliente();		
		Conta c = new Conta(cli, 2500);
		
		cli.setNome("João Marcos");
		
		
		//System.out.println("Cliente: " + cli.getNome());
		System.out.println("Cliente: " + c.getTitular().getNome());
		System.out.println("Limite: R$ " + c.getLimite());*/
		
		
		Cliente cli = new Cliente();
		cli.setNome("João Marcos");
		ContaPoupanca cp = new ContaPoupanca(cli, 30);
		cp.deposita(1000);
	
		ContaCorrente cc = new ContaCorrente(cli, 2000);
		cc.deposita(500);
		
		
		cp.imprimiExtratoCompleto();
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		cc.imprimiExtratoCompleto();
		
		
		
		
		
		
		
		
		
		
		

	}

}
