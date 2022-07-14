import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n, r;
		
		System.out.println("Informe um numero: ");
		n = sc.nextInt();
		
		for(int x = 1; x <=10; x++) {
            r = x * n;
            System.out.println(n + " x " + x + " = " + r);
        }
		sc.close();

	}

}
