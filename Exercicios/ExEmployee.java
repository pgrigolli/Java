package Exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ExEmployee {
    

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee fabio = new Employee();

        System.out.print("Nome: ");
        fabio.name = sc.nextLine();

        System.out.print("Salário bruto: ");
        fabio.grossSalary = sc.nextDouble();

        System.out.print("Imposto: ");
        fabio.tax = sc.nextDouble();

        System.out.printf("Funcionario: %s, $ %.2f", fabio.name, fabio.NetSalary());

        System.out.print("Qual a porcentagem para aumentar o salario?: ");
        




        sc.close();



    }

}
