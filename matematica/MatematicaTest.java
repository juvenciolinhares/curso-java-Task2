package matematica;

public class MatematicaTest {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		int major = m.maior(10,20);
		System.out.println(major);
		
		double so = m.soma(10, 20);
		System.out.println(so);
		
		int par = m.maior(2, 4);
		int impar = m.maior(3, 5);
		
		double soma = m.soma(par, impar);
		System.out.println( soma);
		
	}

}
