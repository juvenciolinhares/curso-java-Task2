package logica;
import java.util.ArrayList;

public class ArrayManipulacao {
	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<>();
		cores.add("Branco");
		cores.add(0, "Vermelho");
		cores.add("Amarelo");
		cores.add("azul");
		
		System.out.println(cores.toString());
		
		//quantidade de elementos: .size()
		System.out.println("Tamanho = " +cores.size());
		
		//recuperar elemento: .get():
		System.out.println("Elemento 2 = " + cores.get(2));
		
		//pesquisa para descobrir o índice de um elemento: .indexof():
		System.out.println("Indice de Branco é = " + cores.indexOf("Branco"));
		
		//remover elementos.remove(object):
		cores.remove("Branco");
		System.out.println("tem a cor Branco: " + cores.contains("Branco"));
		
	}

}
