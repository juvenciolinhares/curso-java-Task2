package contaBanco;

public class ContaTeste {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.cliente = "Juvencio";
		conta.saldo = 1000.00;
		conta.exibirSaldo();
		conta.saca(100);
		conta.exibirSaldo();
		conta.deposita(5000.00);
		conta.exibirSaldo();

		// criar a conta destino:

		Conta destino = new Conta();
		destino.cliente = "Ana";
		destino.saldo = 8000.00;
		destino.exibirSaldo();
		
		conta.transferePara(destino, 1550.00);
		
		conta.exibirSaldo();
		destino.exibirSaldo();

	}

}
