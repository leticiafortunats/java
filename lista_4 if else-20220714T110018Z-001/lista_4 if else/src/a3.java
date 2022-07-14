import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int dia, mes, ano, dia2, mes2, ano2;
		
		System.out.println("Informe o dia: ");
		dia = sc.nextInt();
		System.out.println("Informe o mes: ");
		mes = sc.nextInt();
		System.out.println("Informe o ano: ");
		ano = sc.nextInt();
		
		System.out.println("Informe o dia: ");
		dia2 = sc.nextInt();
		System.out.println("Informe o mes: ");
		mes2 = sc.nextInt();
		System.out.println("Informe o ano: ");
		ano2 = sc.nextInt();
		
		if (ano > ano2) {
			System.out.println("A primeira data é maior");
			}
		if (ano2 > ano) {
			System.out.println("A segunda data é maior");
		}
		else if (ano == ano2) {
			if (mes > mes2) {
				System.out.println("A primeira data é maior");
			}
			if (mes2 > mes) {
				System.out.println("A segunda data é maior");
			}
			else if (mes == mes2) {
				if (dia > dia2) {
					System.out.println("A primeira data é maior");
				}
				if (dia2 > dia) {
					System.out.println("A segunda data é maior");
				}
			}
		}

	
 }
}

		 
	


