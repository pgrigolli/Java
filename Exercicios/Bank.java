package Exercicios;

import entities.BankAccount;
import java.util.Scanner;
import java.util.Locale;


public class Bank {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount b1;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println("Is there a initial deposit? (y/n): ");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.print("Enter initial deposit: ");
            double initialDeposit = sc.nextDouble();
            b1 = new BankAccount(number, name, initialDeposit);
        }else{
            b1 = new BankAccount(number, name);
        }

        System.out.println(b1);
        
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        b1.Deposit(depositValue);
        
        System.out.println(b1);
        
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        b1.Withdrawal(withdrawValue);
        
        System.out.println(b1);
            
            






        sc.close();
    } 



}
