package modificadoresDeAcesso;

public class FuncionarioPacote {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		//f.nome ="Juvencio";o atrubuto nome � private ent�o essa classe nao ter� acesso a ele.
		
		f.sobrenome ="Linhares"; // o sobrenome tem o modificador package, por isso consegue ser acessado
		f.getNome();//metodo publico
		
		f.getSobrenome();//utilizando package em metodos
		//f.getTerceiroNome(); n�o � acessivel por ser private.

	}

}
