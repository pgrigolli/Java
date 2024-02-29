package Exercicios;

import java.util.Scanner;

public class ExIdades {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa: ");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Idade: ");
        int idade1 = sc.nextInt();
        
        
        
        System.out.println("Dados da segunda pessoa: ");
        System.out.print("Nome: ");
        sc.nextLine();
        String nome2 = sc.nextLine();
        System.out.print("Idade: ");
        int idade2 = sc.nextInt();

        double media = (double)(idade1 + idade2)/2;

        System.out.printf("A media das idade entre %s e %s é %f\n",nome1, nome2, media);

        sc.close();

    }

}
