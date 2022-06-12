package logica;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
		
		//conjuntos indexados de informa��o:
		
		int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		
		String[] paises = {"Brasil", "Russia", "India", "China" };
		
		System.out.println(paises[0]);
		
		//alterar o valor da posi��o:
		paises[0] = "BRAZIL";
		
		System.out.println(paises[0]);
		
		//quantas posi��es tem o array:
		System.out.println("O numero de posi��es do array �: " +paises.length);
		
		/*classe para manipula��o de arrays tem que ser importada. import java.util.Arrays;
		 * podemos utilizar pra apresentar todos os valores de um array:
		 */
		
		System.out.println(Arrays.toString(paises));
		
		//pesquisa dentro do array:
		int posicao = Arrays.binarySearch(paises, "Russia");
		System.out.println(posicao);
		
		//ordenar:
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		//acessar m�todos de um objeto de dentro do array:
		
		Double[] valores = {12.35, 3456.3456};
		
		System.out.println(valores[0].doubleValue());
		
	
	}


}
