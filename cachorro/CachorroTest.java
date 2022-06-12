package cachorro;

public class CachorroTest {

	public static void main(String[] args) {
		Cachorro pitbull = new Cachorro();
		pitbull.raca = "PIt Bull";
		pitbull.tamanho = 40;

		pitbull.latir();

		// criar outro cachorro:

		Cachorro viralata = new Cachorro();
		viralata.raca = "Vira-Lata";
		viralata.tamanho = 30;
		viralata.latir();
	}

}
