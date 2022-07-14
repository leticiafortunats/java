import java.util.Scanner;

public class a4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double resp, pvista, pv2, pc, pc2, pp, pj, pj2, pj3;
		int pg;
		
		System.out.println("Informe o valor da compra: ");
		resp = sc.nextDouble();
		
		System.out.println("Informe o tipo de pagamento desejado: ");
		System.out.println("1 a vista");
		System.out.println("2 em chque");
		System.out.println("3 parcelado em 6 vezes");
		System.out.println("4 parcelado em 12 vezes");
		pg = sc.nextInt();
		
		switch (pg) {
		case 1:
			pvista = resp * 0.15;
			pv2 = resp - pvista;
			System.out.println("O valor final da compra com desconto vai ser: " + pv2);
			break;
			
		case 2:
			pc = resp * 0.1;
			pc2 = resp - pc;
			System.out.println("O valor final da compra com desconto vai ser: " + pc2);
			break;
			
		case 3:
			pp = resp / 6;
			System.out.println("O valor final da compra vai ser em 6 parcelas de " + pp + " total de " + resp);
			break;
			
		case 4:
			pj2 = resp * 0.08;
			pj3 = resp + pj2;
			pj = pj3 / 12;
			System.out.println("O valor final da compra com juros vai ser " + pj3 + "em 12 parcelas de: " + pj);
			break;
			 
			
		}
		sc.close();

	}

}
