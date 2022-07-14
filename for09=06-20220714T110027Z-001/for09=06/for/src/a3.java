import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num, numP, numG;
		
		for (int numOp = 1; numOp <=15; numOp++) {
			
			System.out.println("Informe seu numero");
			 num = sc.nextInt();
			System.out.println("Informe o numero de peças que vc fabricou no mes");
			 numP = sc.nextInt();
			System.out.println("Informe seu genero: 1 mulher e 2 para homem");
			 numG = sc.nextInt();
		}
		
		
		
		sc.close();

	}

}
