import java.util.Scanner;

public class FunçãoTRYCATCH {
	public static void main(String[]args) {
		//Essa função vai procurar um erro 
		try { 
				int[][] bi = new int [8][8];
				
				Scanner leer;
				
				int i,j;
				leer = new Scanner(System.in);
				
				for (i = 0;i<bi.length;i++);
					for(j = 0;j<bi.length;j++);
					System.out.println("Insira um numero: ");
					bi[i][j] = leer.nextInt();
				
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
