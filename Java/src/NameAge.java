import java.util.Scanner;

public class NameAge {
	public static void main(String[] args) {
		// Diga seu nome e idade

		System.out.println("Entre com o seu nome: ");
		Scanner LerNome = new Scanner(System.in);
		String nome = LerNome.next();

		System.out.println("Entre com sua idade: ");
		Scanner LerIdade = new Scanner(System.in);
		int idade = LerIdade.nextInt();

		System.out.println("Me chamo " + nome + " e tenho " + idade + " anos.");
	}
}

//Guilherme Dutra