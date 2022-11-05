
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Cliente nogDev = new Cliente();
		nogDev.setNome("NogDev");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		Conta juridica  = new ContaJuridica(nogDev);
			
			juridica.depositar(10000.00);
			juridica.obter_emprestimo(200000.00);
			juridica.DDAemprestimo(15000.00);
			juridica.imprimirExtrato();
	}

}
