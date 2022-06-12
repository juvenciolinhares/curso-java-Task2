package logica;
import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		int[] pares = {2,4,6,8};
		
		//laco for comum:
		for(int i = 0; i < pares.length; i++) {
			int par = pares[i];
			System.out.println(par);
		}
		
		//for each:
		for( int par : pares) {
			System.out.println(par);
		}
		/*limitação:
		 * -não tem acesso ao int = i;
		 */
		
		/*outro exemplo:
		 * preencher um ArrayList usando o for
		 * apresentando usado for each:
		 */
		ArrayList<Integer> list = new ArrayList();
		
		for(int i = 0; i < 10; i ++) {
			list.add(i);
		}
		
		for (Integer numero : list) {
			System.out.println(numero);
		}
		
	}

}
