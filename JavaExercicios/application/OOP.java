package application;

import java.util.Scanner;

import entities.Triangle;

import java.util.Locale;

public class OOP {
    

    public static void main(String[] args){

        // Problema exemplo aula 17  BLOCK32

        Triangle t1, t2;
        t1 = new Triangle();
        t2 = new Triangle();
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle X: ");
        t1.a = sc.nextDouble();
        t1.b = sc.nextDouble();
        t1.c = sc.nextDouble();
        
        System.out.println("Enter the measures of triangle Y: ");
        t2.a = sc.nextDouble();
        t2.b = sc.nextDouble();
        t2.c = sc.nextDouble();
    
        char maiorTri;

        if (t1.area() > t2.area()){ 
            maiorTri = 'X';
        }else{
            maiorTri = 'Y';
        }

        System.out.printf("Triangle X area: %f\n", t1.area());
        System.out.printf("Triangle Y area: %f\n", t1.area());
        System.out.printf("Larger area: %s", maiorTri);

        sc.close();

    }


}
