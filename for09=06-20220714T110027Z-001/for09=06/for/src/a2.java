import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	
		int idade = 0, p=0, a=0, id, id2, idd=0;
		double peso, alt, peso2, alt2, mediaP=0, mediaAlt=0;
		
		
		for(int t1 = 1; t1 <=11; t1++) {
			System.out.println("Informe a idade: ");
			id = sc.nextInt();
			mediaP += id;
			idd++;
			System.out.println("Informe o peso: ");
			 peso = sc.nextDouble();
			System.out.println("Informe a altura: ");
			 alt = sc.nextDouble();
			a++;
			mediaAlt += alt;
			if(id < 18) {
				idade++;
			}
			if (peso > 80) {
				p++;
			}
			
		}
		
		for(int t2 = 1; t2 <=11; t2++) {
			System.out.println("Informe a idade: ");
			id2 = sc.nextInt();
			mediaP += id2;
			idd++;
			System.out.println("Informe o peso: ");
			 peso2 = sc.nextDouble();
			System.out.println("Informe a altura: ");
			 alt2 = sc.nextDouble();
			a++;
			mediaAlt += alt2;
			if(id2 < 18) {
				idade++;
			}
			if (peso2 > 80) {
				p++;
			}
			
		}
		
		
		
		System.out.println("Jogadores menor que 18" + idade);
		System.out.println("Media idade" + (mediaP / idd));
		System.out.println("Media altura" + (mediaAlt / a));
		System.out.println("Porcentagem com mais de 80kg" + ((p/22)*100) + "%");
		

		
		sc.close();

	}

}
