
public class EstruturaDecisãoIF {
	public static void main(String[] args) {
		int idade, media, numero;

		idade = 18;

		if (idade >= 18) {
			System.out.println("Maior de Idade");
		} else {
			System.out.println("Menor de Idade");
		}

		if (idade <= 17) {
			System.out.println("Maior de Idade");
		} else {
			System.out.println("Menor de Idade");
		}

		String nome = "Rodrigo";

		if (nome.equals("Rodrigo")) {
			System.out.println("Correto");
		} else {
			System.out.println("Errado");
		}

		if (nome.equals("Rogerio")) {
			System.out.println("Correto");
		} else {
			System.out.println("Errado");
		}

		// IF ANINHADO

		media = 16;

		if (15 >= media) {
			System.out.println("Victor Passou na Prova 1");
			if (15 >= media) {
				System.out.println("Victor Tambem Passou na Prova 2");
				if (15 >= media) {
					System.out.println("Victor Passou novamente na Prova 3");
				}
			}
		} else {
			System.out.println("Victor Rodou");

		}
		// ELSE IF

		numero = 20;

		if (numero == 9) {
			System.out.println("9");
		} else if (numero == 8) {
			System.out.println("8");
		} else if (numero == 7) {
			System.out.println("7");
		} else if (numero == 6) {
			System.out.println("6");
		} else if (numero == 20) {
			System.out.println("Numero Econtrado");
		} else {
			System.out.println("Numero nao encontrado");

		}

	}
}
//Guilherme da Silva Dutra