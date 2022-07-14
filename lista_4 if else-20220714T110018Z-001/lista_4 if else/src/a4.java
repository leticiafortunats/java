import java.util.Scanner;

public class a4 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int hri, hrf, mini, minf, conta, conta1;
		System.out.println("Informe a hora de inicio: ");
		hri = sc.nextInt();
		System.out.println("Informe a hora final: ");
		hrf = sc.nextInt();
		System.out.println("Informe os minutos de inicio: ");
		mini = sc.nextInt();
		System.out.println("Informe os minutos final: ");
		minf = sc.nextInt();
		
		if (hri > 24) {
			System.out.println("Hora invalida");
		}
		if (hrf > 24) {
			System.out.println("Hora invalida");
		}
		conta = hrf - hri;
		conta1 = minf - mini;
		System.out.println(conta + " hora(s) e " + conta1 + " min");
	}

}
