import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double salc, salj;
		int cont = 0;
		
		System.out.println("Carlor informe seu salario: ");
		salc = sc.nextDouble();
		
		salj = salc / 3;
		
		while(salj < salc) {
			
			 salc *= 1.02;
			 salj *= 1.05;
			 
			 cont++;
			
		}
		 System.out.println(cont);
		
		sc.close();

	}

}
