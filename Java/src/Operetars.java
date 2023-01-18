import java.util.Scanner;

public class Operetars {
	public static void main(String[] args) {
		;
		// Soma,Subtração e etc
		int nA, nB, s, nC;

		nA = 10;
		nB = 20;
		s = nB + nA;
		nC = 40;

		System.out.println(nA + nC - nB);

		// Concatenação

		String Igual, a;
		System.out.println("Entre um mes: ");
		Scanner Lernumero = new Scanner(System.in);
		String mes = Lernumero.next();

		System.out.println("Entre um ano: ");
		try (Scanner LerOutroNumero = new Scanner(System.in)) {
			String ano = LerOutroNumero.next();

			Igual = mes + ano;

			System.out.println("O mês de " + mes + " e o ano de " + ano + " vai dar: " + Igual + " ");
		}

	}
}

//Guilherme Dutra
