package logica;

import modificadoresDeAcesso.Funcionario;

public class FuncionarioExterno {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();

		//f.nome = "Juvencio"; o atrubuto nome é private então essa classe nao terá acesso a ele.
		//f.sobrenome ="Linhares"; 
		/* o sobrenome tem o modificador package,
		 *  como essa classe está em outro pacote
		 *  nao consegue ser acessado*/
		
		f.getNome();// metodo publico
		//f.getSobrenome();utilizando package em metodos, não é aceito por ser outro pacote.
		//f.getTerceiroNome(); não é acessivel por ser private.

	}

}
