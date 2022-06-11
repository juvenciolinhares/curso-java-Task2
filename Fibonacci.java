
public class Fibonacci {

	public static void main(String[] args) {
		
		//definnir os numeros: anterior e proximo numero:
		int anterior = 0;
		int proximo = 1;
		System.out.println(anterior);
				
		while(proximo < 50) {
			System.out.println(proximo);
			proximo += anterior;//proximo num fibonacci
			anterior = proximo - anterior;//atualizando o numero anterior(soma - anterior)
		}
	
	}

}
