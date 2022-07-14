package quiz;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
    	//declarando o scanner
        Scanner sc = new Scanner(System.in);
        
        int Inicio, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, sol = 0, lua = 0; //declarando as variaveis
        
        System.out.println("Criadoras: Maria Cecilia e Leticia Fortunato");

        System.out.println("Bem-vinde! Você deseja iniciar o quiz? \n1.SIM \n2.NÃO"); //pergunta que determina se o quiz vai ser realizado ou nao
        Inicio = sc.nextInt();
        
        while(Inicio !=1 && Inicio!= 2) {
        	System.out.println("Resposta invalida, tente novamente");
        	 System.out.println("Bem-vinde! Você deseja iniciar o quiz? \n1.SIM \n2.NÃO");
             Inicio = sc.nextInt();
        } // While para quando a pessoa nao responder um dos numeros das opções.
        
        while (Inicio == 1) { //while com as perguntas do quiz a serem feitas e estão sendo armazenadas nas variaveis
        
        System.out.println("Ok, vamos começar e descobrir se você é sol ou lua!");
        System.out.println("Você se considera uma pessoa extrovertida? \n1.Não \n2.Sim");
        r1 = sc.nextInt();
        System.out.println("Você tem muitos amigos? \n1.Não \n2.Sim");
        r2 = sc.nextInt();
        System.out.println("Você tem medo de falar em público? \n1.Sim \n2.Não");
        r3 = sc.nextInt();
        System.out.println("Você tinha muitos colegas na escola? \n1.Não \n2.Sim");
        r4 = sc.nextInt();
        System.out.println("Você desculpa as pessoas facilmente? \n1.Sim \n2.Não");
        r5 = sc.nextInt();
        System.out.println("Você se arrepende de coisas pequenas? \n1.Sim \n2.Não");
        r6 = sc.nextInt();
        System.out.println("Você é preso no passado? \n1.Sim \n2.Não");
        r7 = sc.nextInt();
        System.out.println("Você é grosso? \n1.Sim \n2.Não");
        r8 = sc.nextInt();
        System.out.println("Você escuta mais e fala menos? \n1.Sim \n2.Não");
        r9 = sc.nextInt();
        System.out.println("Você pensa bem antes de falar? \n1.Sim \n2.Não");
        r10 = sc.nextInt();
        
        if(r1 == 1) { //estrutura de repetição com um contador para contar as respostas, quantas foram sim e quantas foram nao
            lua++;
        } else {
            sol++;
        }
        if(r2 == 1) {
            lua++;
        } else {
            sol++;
        }
        if(r3 == 1) {
            lua++;
        } else {
            sol++;
        }
        if(r4 == 1) {
            lua++;
        } else {
            sol++;
        }
        if(r5 == 2) {
            lua++;
        } else {
            sol++;
        }
        if(r6 == 1) {
            lua++;
        } else {
            sol++;
        }
        if(r7 == 1) {
            lua++;
        } else {
            sol++;
        }
        if(r8 == 1) {
            lua++;
        } else {
            sol++;
        }
        if(r9 == 1) {
            lua++;
        } else {
            sol++;
        }
        if(r10 == 1) {
            lua++;
        } else {
            sol++;
        }
        
        if(lua > sol) {
            System.out.println("Voce é mais lua"); //estrutura de condição que analisa se lua foi maior que sol, determinado o resultado
            System.out.println("         _.._");
            System.out.println("        .' .-'`");
            System.out.println("       /  /");
            System.out.println("       |  |");
            System.out.println("       \\  '.___.;");
            System.out.println("jgs     '._  _.'");
            System.out.println("           ``");
        } else if (lua < sol) {
            System.out.println("Voce é mais sol"); //estrutura que compara se sol foi maior que lua, determinado o resultado
            System.out.println("      ;   :   ;\r\n"
            		+ "   .   \\_,!,_/   ,\r\n"
            		+ "    `.,'     `.,'\r\n"
            		+ "     /         \\\r\n"
            		+ "~ -- :         : -- ~\r\n"
            		+ "     \\         /\r\n"
            		+ "    ,'`._   _.'`.\r\n"
            		+ "   '   / `!` \\   `\r\n"
            		+ "      ;   :   ;  hjw");
                   
            
        } else if(lua == sol) {
            System.out.println("Voce é mais eclipse"); //estrutura que compara se lua e sol foram iguais, determinado o resultado
            System.out.println("       _..._     \r\n"
            		+ "     .'  ::::.    \r\n"
            		+ "    :    ::::::    \r\n"
            		+ "    :    ::::::  \r\n"
            		+ "    `.   :::::'  \r\n"
            		+ "      `-.::''   ");
        }
        
        System.out.println("\nDeseja iniciar o quiz novamente? \n1.SIM \n2.NÃO");
        Inicio = sc.nextInt(); // pergunta para saber se o jogador deseja fazer o quiz novamente
        }    
            
        
        sc.close();
    }

}