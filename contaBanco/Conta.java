package contaBanco;

public class Conta {
	String cliente;
	double saldo;
	
	public void exibirSaldo() {
		System.out.println(cliente + ", seu saldo é de: " + saldo);
	}
	
	//primeiro metodo com parametros:
	
	void saca(double valor) {
		/*pra que ele possa sacar, precisa ser analisado:
		 * se tem autorização
		 * se o limite do dia não foi ultrapassado
		 * se tem saldo na conta
		 * deduzir o salddo do valor do saque(única que vamos fazer agora)
		 * atualizar registro do banco.
		 * entregar o dinheiro ao cliente.
		 */
		saldo -= valor;
		
		
	}
	void deposita(double valor) {
		saldo +=valor;
	}
	
	/*metodo com dois parametros:
	 * vai ter como objetivo transferir
	 * p uma conta de destino o valor informado.
	 */
	void transferePara(Conta destino, double valor) {
		this.saca(valor);
		destino.deposita(valor);
	}

}
