import java.util.Random;
import java.util.Scanner;

public class DesafioDosDados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Random r = new Random();
		
		int [] dado = {1, 2, 3, 4, 5, 6 };
		
		System.out.println("Qual o Palpite?");
		int palpite = sc.nextInt();
			
		System.out.println("Qual o valor do dado?");
		int valorDoDado = r.nextInt(6)+1;
		System.out.println("O seu palpite foi: " + palpite);
		System.out.println("O valor do dado foi: " + valorDoDado);
		
		if(palpite == valorDoDado) {
			System.out.println("Voce acertou!!!");
		} else {
			System.out.println("Voce errou");
			
		}
		
		sc.close();
	
	}

}
