package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class ExRetangulo2 {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangle r1 = new Retangle();

        System.out.println("Entre com a largura e altura do retangulo: ");

        System.out.print("Largura: ");
        r1.width = sc.nextDouble();

        System.out.print("Altura: ");
        r1.height = sc.nextDouble();

        System.out.printf("Area: %.2f\n", r1.Area());
        System.out.printf("Perimetro: %.2f\n", r1.Perimeter());
        System.out.printf("Diagonal: %.2f\n", r1.Diagonal());




        sc.close();

    }



}
