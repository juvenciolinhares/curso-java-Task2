package modificadoresDeAcesso;

public class FuncionarioPacote {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		//f.nome ="Juvencio";o atrubuto nome é private então essa classe nao terá acesso a ele.
		
		f.sobrenome ="Linhares"; // o sobrenome tem o modificador package, por isso consegue ser acessado
		f.getNome();//metodo publico
		
		f.getSobrenome();//utilizando package em metodos
		//f.getTerceiroNome(); não é acessivel por ser private.

	}

}
