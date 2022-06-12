package logica;

public class FluxoCondicionalIfElse {

	public static void main(String[] args) {

		int idade = 31;
		if(idade <=10) {
			System.out.println("Crianca");
		} else if(idade >= 11 && idade <= 18) {
			System.out.println("Adolescente");
		} else if(idade > 18 && idade <=60) {
			System.out.println("Adulto");
		} else  {
			System.out.println("Melhor Idade");
		}
		
		//if aninhado 
		
		int nota = 6;
		if(nota >= 7) {
			System.out.println("Passou");
		} else {
			System.out.println("reprovou");
			if (nota >= 6) {
				System.out.println("Mas pode  fazer a recuperação");
			}
			
		}

	}

}
