import java.util.Scanner;

public class a5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int resp, sal;
		double conta1, conta2, conta3, conta4, c1, c2, c3, c4;
		System.out.println("Para escrituario digite: 1, secretario: 2, caixa: 3, gerente: 4, e diretor: 5");
		resp = sc.nextInt();
		
		System.out.println("Agr informe seu salario: ");
		sal = sc.nextInt();
		
		if (resp ==1) {
			conta1 = (sal * 50) / 100; 
			c1 = conta1 + sal;
			System.out.println("O seu cargo e: escrituario, seu aumento e:" + conta1 + "seu salario vai ficar" + c1);
		}
		if (resp ==2) {
			conta2 = (sal * 35) / 100; 
			c2 = conta2 + sal;
			System.out.println("O seu cargo e: secretario, seu aumento e:" + conta2 + "seu salario vai ficar" + c2);
		}
		if (resp ==3) {
			conta3 = (sal * 20) / 100; 
			c3 = conta3 + sal;
			System.out.println("O seu cargo e: caixa, seu aumento e:" + conta3 + "seu salario vai ficar" + c3);
		}
		if (resp ==4) {
			conta4 = (sal * 10) / 100; 
			c4 = conta4 + sal;
			System.out.println("O seu cargo e: gerente, seu aumento e:" + conta4 + "seu salario vai ficar" + c4);
		}
		if (resp == 5) {
			System.out.println("Seu cargo e diretor e nao tem aumento");
		}
		else {
			System.out.println("opca invalida");
		}

	}

}
