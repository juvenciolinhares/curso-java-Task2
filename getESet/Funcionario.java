package getESet;

/*pra saber se preciso encapsular
 * preciso analisar os atributos e perceber se
 * sao atributos que podem ser acessados por outros ou n�o 
 * caso n�o, utilizo os gets e sets
 */

public class Funcionario {
	
	//uso o private para proteger a variavel:
	private String nome;
	
	//a regra muda para booleanos:
	private boolean ativo;
	
	//para pegar esse nome uso o metdo get:
	
	public String getNome() {
		return nome;
	}
	
	/*para modificar o nome, uso o metodo set():
	 * esse metodo n�o retorna nada, apenas faz configura��o intera.
	 */
	public void setNome(String nome) {
		 this.nome = nome;
		
	}
	//a regra muda para booleanos:
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

}
