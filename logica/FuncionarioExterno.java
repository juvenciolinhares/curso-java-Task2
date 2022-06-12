package logica;

import modificadoresDeAcesso.Funcionario;

public class FuncionarioExterno {

	public static void main(String[] args) {

		Funcionario f = new Funcionario();

		//f.nome = "Juvencio"; o atrubuto nome � private ent�o essa classe nao ter� acesso a ele.
		//f.sobrenome ="Linhares"; 
		/* o sobrenome tem o modificador package,
		 *  como essa classe est� em outro pacote
		 *  nao consegue ser acessado*/
		
		f.getNome();// metodo publico
		//f.getSobrenome();utilizando package em metodos, n�o � aceito por ser outro pacote.
		//f.getTerceiroNome(); n�o � acessivel por ser private.

	}

}
