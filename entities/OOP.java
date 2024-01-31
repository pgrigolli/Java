package entities;

import java.util.Scanner;
import java.util.Locale;

public class OOP {
    

    public static void main(String[] args){

        // Problema exemplo aula 17  BLOCK32
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the measures of triangle X: ");
        double med1Tri1 = sc.nextDouble();
        double med2Tri1 = sc.nextDouble();
        double med3Tri1 = sc.nextDouble();
        
        
        System.out.println("Enter the measures of triangle Y: ");
        double med1Tri2 = sc.nextDouble();
        double med2Tri2 = sc.nextDouble();
        double med3Tri2 = sc.nextDouble();
    
        double p1 = (med1Tri1 + med2Tri1 + med3Tri1)/2;
        double p2 = (med1Tri2 + med2Tri2 + med3Tri2)/2;


        double area1 = Math.sqrt(p1*(p1 - med1Tri1)* (p1 - med2Tri1) * (p1 - med3Tri1));
        double area2 = Math.sqrt(p2*(p2 - med1Tri2)* (p2 - med2Tri2) * (p2 - med3Tri2));

        char maiorTri;

        if (area1 > area2){ 
            maiorTri = 'X';
        }else{
            maiorTri = 'Y';
        }

        System.out.printf("Triangle X area: %f\n", area1);
        System.out.printf("Triangle Y area: %f\n", area2);
        System.out.printf("Larger area: %s", maiorTri);

        sc.close();

    }


}
