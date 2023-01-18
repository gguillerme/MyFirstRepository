
public class OperadoresLógicos {
	public static void main(String[] args) {
		/*
		 * OPERADORES LÓGICOS: e = && (Somente se tiver dois true vai dar true no final,
		 * diferente disso vai ser sempre falso.) ou = || (Somente se tiver dois false
		 * vai dar false no final, diferente disso vai ser sempre true.) not = ! (Vai
		 * sempre inverter o resultado)
		 */
		int a = 10, b = 5;

		if ((a > b) && (b < a)) {
			System.out.println("Certo");
		} else {
			System.out.println("Errado");
		}

		if ((a < b) || (b < a)) {
			System.out.println("Certo");
		} else {
			System.out.println("Errado");
		}

		if (!(a > b) || (b < a)) {
			System.out.println("Certo");
		} else {
			System.out.println("Errado");
		}

	}
}
/*  10 > 5 = false;
	10 < 5 = true;
	10 == 5 = false;
	10 == 10 = true;
	10 <= 10 = true;
	10 >= 10 = true;
	10 >= 5 = false;
	10 <= 5 = false;
	20 != 10  = true;
	20 != 20 = false;  */

//Guilherme da Silva Dutra