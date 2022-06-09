import java.util.Random;

public class ArrayMultidimensional {

	public static void main(String[] args) {
						
		String [][] matriz = {{"Ricardo", "M", "DF"}, {"Sandra", "F", "SP"}};
		System.out.println(matriz[1][2]);
		
		//quantidade de elementos do array: 
		System.out.println(matriz.length);
		
		//tamanho do array interno:
		System.out.println(matriz[0].length);
		
		//alterar valores:
		matriz[1][0]= "Juvencio";
		System.out.println(matriz[1][0]);
		
		//arrays com várias dimensões: 
		int [][][][] n;//pouco usado.
		
		//criando um jogo de cartas:
		
		String[] faces = {"As", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "Valete ", "Damas ", "Rei "};
		String[] naipes = {"Espadas ", "Paus ", "Copas ", "Ouros "};
		
		//selecionando uma carta acessando os índices dos arrays:
		String carta = faces[0] + " de " + naipes[0];
		System.out.println("A carta selecionada foi: " + carta);
		
		//escolhendo uma classe aleatória(classe random, precisa ser importada):
		Random r = new Random();
		
		//indice das faces:
		String face = faces[r.nextInt(faces.length)];
		
		//indice dos naipes:
		String naipe = naipes[r.nextInt(naipes.length)];
		
		carta = face + "de " + naipe;
				
		System.out.println(carta);
		
	}

}
