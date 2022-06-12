package matematica;

public class Matematica {

	/*
	 * metodo maior, retorna o numero maior: comentario sobre metodos:
	 */
	/**
	 * param = parametro
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois numeros.
	 */
	 int maior(int um, int dois) {
		if (um > dois) {
			return um;
			
		} else {
			return dois;
		}
		
	}
	//metodo que soma dois valores:
	 double soma(double um, double dois) {
		
		 double s = um + dois;
		 return s;
		
	}
}
