package logica;

public class BreakContinueRotulos {

	public static void main(String[] args) {
		/*break: encerra o loop inteiro
		 * continue:encerra a itera��o atual
		 * r�tulo: indica qual loop voc� quer continuar ou parar
		 */
		
		//exemplo de break:
		while(true) {
			System.out.println("Entrou");
			break; //sem o break seria um loop infinito.
		}
		
		//exemplo de continue:
		for(int i = 0; i < 10; i ++) {
			if(i == 5) {
				continue;//ele pula o 5 e continua do 6. 
			}
			System.out.println(i);
		}
		
		
		/*exemplo de r�tulo:
		 * encontrar o true dentro de uma sequencia de false numa matriz:
		 */
		
		boolean[][] matrix = {{false, true, false, false, false}, {false, false, false, false, false}};
		
		/*passo 1: percorrer os elementos do primeiro array:
		 *passo 2: percorrer o for de dentro; 
		 */
		
		
		busca://rotulo
		for(int a = 0; a < matrix.length; a ++ ) {
			System.out.println("A ");
						
			for(int b = 0; b< matrix[a].length; b ++) {
				if(matrix[a][b]) {
					System.out.println("True");
					break busca;// quando ele acha, ele para o la�o mais externo.
				}
				System.out.println("B ");
			}
			
		}
	
	}

}
