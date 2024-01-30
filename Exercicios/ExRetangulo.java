package Exercicios;

import java.util.Scanner;

public class ExRetangulo {
    
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Insira a largura: ");
        double largura = sc.nextDouble();

        double area = altura * largura;
        System.out.printf("A area desse retangulo é %.4f\n", area);

        double perimetro = (2 * altura) + (2 * largura);
        System.out.printf("O perimetro desse retrangulo é %.4f\n", perimetro);

        double diagonal = Math.sqrt(altura * altura + largura * largura);
        System.out.printf("A diagonal desse retangulo é %.4f\n", diagonal);


        sc.close();
    }

}
