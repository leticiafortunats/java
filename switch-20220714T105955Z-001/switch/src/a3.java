import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int resp1;
		double conta1, conta2;
		
		System.out.println("Informe quantos livros deseja comprar:");
		resp1 = sc.nextInt();
		
		conta1 = (0.25 * resp1) + 7.50;
		conta2 = (0.50 * resp1) + 2.50;
		
		if(conta1 > conta2) {
			System.out.println("A melhor opção de desconto é A, vc ira pagar:" + conta1);
		}
		if(conta2 > conta1) {
			System.out.println("A melhor opção de desconto é B, vc ira pagar:" + conta2);
		}
		
		sc.close();

	}

}
