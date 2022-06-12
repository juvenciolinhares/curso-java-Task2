package logica;
import java.util.ArrayList;
import java.util.Scanner;

public class WhileDoWhile {

	public static void main(String[] args) {

		//while:

		int i = 0;
		while(i < 2) {
			System.out.println(i);
			i ++;
		}

		//do while:
		do {
			i = 3;
			System.out.println(i);
			i ++;
		}while(i < 2);

		//programa teste:

		ArrayList<String> produtos = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);

		//explicação ao usuário:
		System.out.println("Liste seus produtos, para sair digite fim");

		//coleta de informações:

		String produto;
		
		while(!"fim".equals(produto = sc.next())) {
			
			produtos.add(produto);
			
		}

		System.out.println(produtos.toString());

	}

}

/* estrutura while é executada 0 ou n vezes.
 * estrutura do while é executada 1 ou mais vezes.
 * .equals : compara duas strings
 */

