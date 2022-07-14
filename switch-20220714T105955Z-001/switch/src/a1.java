import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int r1;
		double conta, sal, saln;
		
		System.out.println("Digite:");
		System.out.println("1 para Escrituario");
		System.out.println("2 para Secretario");
		System.out.println("3 para Caixa");
		System.out.println("4 para Gerente");
		System.out.println("5 para Diretor");
		r1 = sc.nextInt();
		
		switch(r1) {
		
		case 1:
		System.out.println("Qual e o seu salario?");
		sal = sc.nextDouble();
		conta = sal * 0.5;
		saln = conta + sal;
		System.out.println("O seu aumento é de" + conta + "e o salario fica" + saln);
		break;
		
		case 2:
			System.out.println("Qual e o seu salario?");
			sal = sc.nextDouble();
			conta = sal * 0.35;
			saln = conta + sal;
			System.out.println("O seu aumento é de" + conta + "e o salario fica" + saln);
			break;
			
		case 3:
			System.out.println("Qual e o seu salario?");
			sal = sc.nextDouble();
			conta = sal * 0.2;
			saln = conta + sal;
			System.out.println("O seu aumento é de" + conta + "e o salario fica" + saln);
			break;
			
		case 4:
			System.out.println("Qual e o seu salario?");
			sal = sc.nextDouble();
			conta = sal * 0.1;
			saln = conta + sal;
			System.out.println("O seu aumento é de" + conta + "e o salario fica" + saln);
			break;
			
		case 5:
			System.out.println("Qual e o seu salario?");
			System.out.println("Não possui aumento");
			break;
			
			default: 
				System.out.println("Opção invalida");
		
		}
		
		sc.close();

	}

}
