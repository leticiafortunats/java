import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int dia, mes, ano, hora, min;
		
		System.out.println("Informe o dia: ");
		dia = sc.nextInt();
		System.out.println("Informe o mes: ");
		mes = sc.nextInt();
		System.out.println("Informe o ano: ");
		ano = sc.nextInt();
		System.out.println("Informe o hora: ");
		hora = sc.nextInt();
		System.out.println("Informe o minutos: ");
		min = sc.nextInt();
		
		
		if (hora > 24) {
			System.out.println("Invalido");
		} 
		if (dia > 31) {
			System.out.println("Dia invalido");
		} else if (mes > 12) {
			System.out.println("Mes invalido");
		} 
		if (dia <= 31 && mes <=12) {
			System.out.print("A data é: " + dia + "/");
			if (mes == 1) {
				System.out.print("Janeiro /");
			}
			if (mes == 2) {
				System.out.print("Fevereiro /");
			}
			if (mes == 3) {
				System.out.print("Março /");
			}
			if (mes == 4) {
				System.out.print("Abril /");
			}
			if (mes == 5) {
				System.out.print("Maio /");
			}
			if (mes == 6) {
				System.out.print("Junho /");
			}
			if (mes == 7) {
				System.out.print("Julho /");
			}
			if (mes == 8) {
				System.out.print("Agosto /");
			}
			if (mes == 9) {
				System.out.print("Setembro /");
			}
			if (mes == 10) {
				System.out.print("Outubro /");
			}
			if (mes == 11) {
				System.out.print("Novembro /");
			}
			if (mes == 12) {
				System.out.print("Dezembro /");
			}
			
			System.out.println(ano);
			
		}
		if (hora <= 24) {
			System.out.println("o horario é: " + hora + ":" + min);
		}
		

	}

}
