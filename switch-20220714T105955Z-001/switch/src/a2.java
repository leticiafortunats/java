import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int resp1, resp2;
		double pesok, conta, conta2, conta3, conta4, c1, c11;
		
		System.out.println("Digite o codigo de origem do pais:");
		resp1 = sc.nextInt();
		System.out.println("Agr digite o codigo do produto:");
		resp2 = sc.nextInt();
		System.out.println("Informe o peso do produto em quilos:");
		pesok = sc.nextDouble();
		
		conta = pesok / 1000;
		System.out.println("O peso do produto em gramas é: " + conta);
		
		if (resp2 <= 4) {
			conta2 = conta * 10;
			System.out.println("O preço total do produto é: " + conta2);
		}
		if (resp2 > 4 && resp2 <=7) {
			conta3 = conta * 25;
			System.out.println("O preço total do produto é: " + conta3);
		}
		if (resp2 > 7 && resp2 <=10) {
			conta4 = conta * 35;
			System.out.println("O preço total do produto é: " + conta4);
		}
		
		switch(resp1) {
		case 1:
			System.out.println("Não tem imposto");
			if (resp2 <= 4) {
				conta2 = conta * 10;
				System.out.println("O preço total do produto é: " + conta2);
			}
			if (resp2 > 4 && resp2 <=7) {
				conta3 = conta * 25;
				System.out.println("O preço total do produto é: " + conta3);
			}
			if (resp2 > 7 && resp2 <=10) {
				conta4 = conta * 35;
				System.out.println("O preço total do produto é: " + conta4);
			}
			break;
			
		case 2:
			if (resp2 <= 4) {
				conta2 = conta * 10;
				c1 = conta2 * 0.15;
				c11 = conta2 + c1;
				System.out.println("O valor do imposto é " + c1);
				System.out.println("O valor total do produto (valor total + imposto é:" + c11);
			}
			if (resp2 > 4 && resp2 <=7) {
				conta3 = conta * 25;
				c1 = conta3 * 0.15;
				c11 = conta3 + c1;
				System.out.println("O valor do imposto é " + c1);
				System.out.println("O valor total do produto (valor total + imposto é:" + c11);
				
			}
			if (resp2 > 7 && resp2 <=10) {
				conta4 = conta * 35;
				System.out.println("O preço total do produto é: " + conta4);
				c1 = conta4 * 0.15;
				c11 = conta4 + c1;
				System.out.println("O valor do imposto é " + c1);
				System.out.println("O valor total do produto (valor total + imposto é:" + c11);
			}
			break;
			
		case 3:
			if (resp2 <= 4) {
				conta2 = conta * 10;
				c1 = conta2 * 0.25;
				c11 = conta2 + c1;
				System.out.println("O valor do imposto é " + c1);
				System.out.println("O valor total do produto (valor total + imposto é:" + c11);
			}
			if (resp2 > 4 && resp2 <=7) {
				conta3 = conta * 25;
				c1 = conta3 * 0.25;
				c11 = conta3 + c1;
				System.out.println("O valor do imposto é " + c1);
				System.out.println("O valor total do produto (valor total + imposto é:" + c11);
				
			}
			if (resp2 > 7 && resp2 <=10) {
				conta4 = conta * 35;
				System.out.println("O preço total do produto é: " + conta4);
				c1 = conta4 * 0.25;
				c11 = conta4 + c1;
				System.out.println("O valor do imposto é " + c1);
				System.out.println("O valor total do produto (valor total + imposto é:" + c11);
			}
			break;
			
			
			
		}
		
		
		sc.close();
		
	}

}
