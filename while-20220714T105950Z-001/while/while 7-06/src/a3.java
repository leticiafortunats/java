import java.util.Scanner;

public class a3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double n = 0, som=0, max=0, min=999999999, med=0;
        int conta=0;
        while(n != 30000) {
            System.out.print("valor: ");
            n = sc.nextDouble();        
            som += n;
            
            if(max > n) {
                max = max;
            }else {
                max = n;
            }
            
            if(min < n) {
                min = min;
            }else {
                min = n;
            }
            
            if(n%2==0) {
                med+=n;
            }
            
            conta++;
        }
        med = med/conta;
        
        System.out.println("maior valor "+max);
        System.out.println("menor valor "+min);
        System.out.println("media dos numeros "+med);
        System.out.println("soma de todos os numeros "+som);
        
        
        
        sc.close();
    }

}