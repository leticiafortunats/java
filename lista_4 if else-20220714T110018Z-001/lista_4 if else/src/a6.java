import java.util.Scanner;

public class a6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int resp;
		double sal, conta1, conta2, conta3, sal2, c1, c2, c3, c4, sal3;
		
		System.out.println("Digite 4 para imposto, 5 para novo salario, e 6 para classificacao");
		resp = sc.nextInt();
		
		if (resp == 1) {
			System.out.println("informe seu salario: ");
			sal = sc.nextDouble();
			if ( sal < 500) {
				conta1 = (sal * 5) / 100;
				System.out.println(conta1 + "e o valor do imposto");
			}
			if (sal >= 500 && sal <=850) {
				conta2 = (sal * 10) / 100;
				System.out.println(conta2 + "e o valor do imposto");
			}
			else {
				conta3 = (sal * 15) /100;
				System.out.println(conta3 + "e o valor do imposto");
			}
		}
		if (resp == 2) {
			System.out.println("informe seu salario: ");
			sal2 = sc.nextDouble();
			if (sal2 > 1500) {
				c1 = sal2 + 25;
				System.out.println(c1 + "valor do novo salario");
			}
			if (sal2 >= 750 && sal2 <= 1500) {
				c2 = sal2 + 50;
				System.out.println(c2 + "valor do novo salario");
			}
			if (sal2 >= 450 && sal2 < 750) {
				c3 = sal2 + 75;
				System.out.println(c3 + "valor do novo salario");
			}
			if (sal2 < 450) {
				c4 = sal2 + 100;
				System.out.println(c4 + "valor do novo salario");
			}
		}
		if (resp == 3) {
			System.out.println("informe seu salario: ");
			sal3 = sc.nextDouble();
			if (sal3 <= 700) {
				System.out.println("Mal renumerado");
			}
			else {
				System.out.println("Bem renumerado");
			}
		}

	}

}
