package logica;

public class Switch {

	public static void main(String[] args) {

		char sexo = 'M';
		switch (sexo) {
		case 'M':
			System.out.println("Macho");
			break;
		case 'F':
			System.out.println("Femea");
			break;
		default:
			System.out.println("outro");
			break;
		}

		//opção sem utilizar o break em todos os caso:
		String tecnologia = "C++";
		switch(tecnologia) {
		case "Java":
		case "C++":
		case "cobol":
			System.out.println("Linguagem de programacao");
			break;
		case "Oracle":
		case "sqlserver":
		case "postgresql":
			System.out.println("Banco de dados");
			break;
		default:
			System.out.println("Tecnologia desconhecida");
		}

	}

}
