
public class AutoBoxing {

	public static void main(String[] args) {
		
		/* forma antiga de fazer:
		 * Integer x = new Integer(555);//empacotado
		int a = x.intValue(); //desempacotei
		a ++;// incrementa
		x = new Integer(a); //empacotei de novo
		System.out.println(x.intValue());
		 */
		//forma atual de criar uma wrapper class:
		Integer x = 555;
		//incrementar:
		x++; //desempacota, incrementa e reempacota;
		
		System.out.println(x);
		
		/*com booleano:
		 * forma antiga:
		 * Boolean v = new Boolean("True");
		if(v.booleanValue()) {
			System.out.println(v);
		}
		 */
		//forma atual:
		
		Boolean v = new Boolean("TRUE");
		if(v) {
			System.out.println(v);
		}
	
	}

}
