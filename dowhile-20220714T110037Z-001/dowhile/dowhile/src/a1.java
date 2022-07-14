import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int num, i, resultado = 0;
		 
		 System.out.println("Digite um número: ");
		 num = sc.nextInt();
		 
		 for (i = 2; i <= num / 2; i++) {
		    if (num % i == 0) {
		       resultado++;
		       break;
		    }
		 }
		 
		 if (resultado == 0) {
			 System.out.println(num + "e um numero primo");
		 }
		 else if (resultado != 0) {
			 System.out.println(num + "nao e um numero primo"); 
		 }
		 
		sc.close();
	}

}