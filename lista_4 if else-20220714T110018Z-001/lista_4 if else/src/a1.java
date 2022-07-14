import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        double resp, conta, num1, num2, numr, raiz;
        
		System.out.println("Para somar dois numeros digite: 1, para a raiz quadrade digite: 2");
		resp = sc.nextInt();
		
		if (resp == 1) {
			System.out.println("Informe um numero: ");
			num1 = sc.nextInt();
			System.out.println("Informe outro numero: ");
			num2 = sc.nextInt();
			conta = num1 + num2;
			System.out.println("A soma é: " + conta);
			
		} else if (resp == 2){
			System.out.println("Informe um numero: ");
			numr = sc.nextInt();
			raiz = Math.sqrt(numr);
					System.out.println("A raiz quadrade é: " + raiz);
		} else {
			System.out.println("Numero invalido");
			
			
		}
		sc.close();
	}

}
