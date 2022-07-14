import java.util.Scanner;

public class a07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i;
		double a, b, c;
		
		System.out.print("I: ");
		i = sc.nextInt();
		System.out.print("A: ");
		a = sc.nextInt();
		System.out.print("B: ");
		b = sc.nextInt();0
		System.out.print("C: ");
		c = sc.nextInt();
		
		if (i == 1) {
			if (a < b && a < c) {
				if(b <c ) {
					System.out.println(a + ", " + b + " e " + c);
				}
			}
		}

	}

}
