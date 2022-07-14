import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double n = 0, cub, raiz, quad;
		
		while (n > 0) {
			System.out.println("Informe um numero: ");
			n = sc.nextDouble();
			
			cub = n * n * n;
			raiz = Math.sqrt(n);
			quad = n * n;
			
			System.out.println(cub);
			System.out.println(raiz);
			System.out.println(quad);
			
			
		}
		sc.close();

	}

}
