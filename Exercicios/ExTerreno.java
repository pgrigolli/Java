package Exercicios;

import java.util.Scanner;


public class ExTerreno {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a largura: ");
        double larg = sc.nextDouble();

        System.out.println("Digite o comprimento: ");
        Double comp = sc.nextDouble();


        System.out.println("Digite o valor do metro quadrado: ");
        double valor = sc.nextDouble();

        double area = larg * comp;
        System.out.printf("A area total é %.2f metros quadrados\n", area);

        double precoTotal = area * valor;

        System.out.printf("O preco total do terreno é %.2f reais\n", precoTotal);

        sc.close();
    } 


}
