
import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codC, num, ac;
		
		System.out.println("Informe o c�digo da cidade");
		 codC = sc.nextInt();
		System.out.println("Informe o n�mero de ve�culos de passeio");
		 num = sc.nextInt();
		System.out.println("Informe o n�mero de acidentes de tr�nsito com v�timas");
		 ac = sc.nextInt();
		
		System.out.println("Informe o c�digo da cidade");
		int codC2 = sc.nextInt();
		System.out.println("Informe o n�mero de ve�culos de passeio");
		int num2 = sc.nextInt();
		System.out.println("Informe o n�mero de acidentes de tr�nsito com v�timas");
		int ac2 = sc.nextInt();
		
		System.out.println("Informe o c�digo da cidade");
		int codC3 = sc.nextInt();
		System.out.println("Informe o n�mero de ve�culos de passeio");
		int num3 = sc.nextInt();
		System.out.println("Informe o n�mero de acidentes de tr�nsito com v�timas");
		int ac3 = sc.nextInt();
		
		System.out.println("Informe o c�digo da cidade");
		int codC4 = sc.nextInt();
		System.out.println("Informe o n�mero de ve�culos de passeio");
		int num4 = sc.nextInt();
		System.out.println("Informe o n�mero de acidentes de tr�nsito com v�timas");
		int ac4 = sc.nextInt();
		
		System.out.println("Informe o c�digo da cidade");
		int codC5 = sc.nextInt();
		System.out.println("Informe o n�mero de ve�culos de passeio");
		int num5 = sc.nextInt();
		System.out.println("Informe o n�mero de acidentes de tr�nsito com v�timas");
		int ac5 = sc.nextInt();
		
		if (ac > ac2 && ac > ac3 && ac > ac4 && ac > ac5) {
			System.out.println("O maior numero de acidentes e" + ac + "pertence a cidade" + codC);
		}
		else if (ac2 > ac && ac2 > ac3 && ac2 > ac4 && ac2 > ac5) {
			System.out.println("O maior numero de acidentes e" + ac2 + "pertence a cidade" + codC2);
		}
		else if (ac3 > ac && ac3 > ac2 && ac3 > ac4 && ac3 > ac5) {
			System.out.println("O maior numero de acidentes e" + ac3 + "pertence a cidade" + codC3);
		}
		else if (ac4 > ac && ac4 > ac2 && ac4 > ac3 && ac4 > ac5) {
			System.out.println("O maior numero de acidentes e" + ac4 + "pertence a cidade" + codC4);
		}
		else if (ac5 > ac && ac5 > ac2 && ac5 > ac3 && ac5 > ac4) {
			System.out.println("O maior numero de acidentes e" + ac5 + "pertence a cidade" + codC5);
		}
		
		if (ac < ac2 && ac < ac3 && ac < ac4 && ac < ac5) {
			System.out.println("O menor numero de acidentes e" + ac + "pertence a cidade" + codC);
		}
		else if (ac2 < ac && ac2 < ac3 && ac2 < ac4 && ac2 < ac5) {
			System.out.println("O menor numero de acidentes e" + ac2 + "pertence a cidade" + codC2);
		}
		else if (ac3 < ac && ac3 < ac2 && ac3 < ac4 && ac3 < ac5) {
			System.out.println("O menor numero de acidentes e" + ac3 + "pertence a cidade" + codC3);
		}
		else if (ac4 < ac && ac4 < ac2 && ac4 < ac3 && ac4 < ac5) {
			System.out.println("O menor numero de acidentes e" + ac4 + "pertence a cidade" + codC4);
		}
		else if (ac5 < ac && ac5 < ac2 && ac5 < ac3 && ac5 < ac4) {
			System.out.println("O menor numero de acidentes e" + ac5 + "pertence a cidade" + codC5);
		}
		
		double mediaV = num + num2 + num3 + num4 + num5 / 5;
		System.out.println("A media de veiculos nas cidades � " + mediaV);
		
		sc.close();
	}

}

