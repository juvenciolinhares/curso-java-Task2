package modificadoresDeAcesso;

public class Funcionario {
	private String nome;// n�o consigo acesso em outras classes
	//usando o package(acesso a todos os membros do pacote):
	String sobrenome;// a ausencia de um mod de acesso deixa visivel pra todos os membros do pacote.
	
	//utilizando o modif public(acessivel a todos os membros)
	public String terceiroNome;
	//pode ser feito com metodos tamb�m:
	
	public String getNome() {
		return nome;
	}
	
	//utilizando package em metodos:
	String getSobrenome() {
		return sobrenome;
	}
	//utilizando private em metodos:
	private String TerceiroNome() {
		return terceiroNome;
	}

	public static void main(String[] args) {

		Funcionario f = new Funcionario();
		

		f.nome = "Juvencio";

	}

}
