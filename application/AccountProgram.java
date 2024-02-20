package application;

import java.util.Locale;


import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;




public class AccountProgram {

    


    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAcount bAcc = new BusinessAcount(1002, "Maria", 0.0, 500.0);

        //UPCASTING!!!!!!!


        Account acc1 = bAcc;
        Account acc2 = new BusinessAcount(1003, "Pedro", 0.0, 750.00);
        Account acc3 = new SavingsAccount(1004, "Julia", 0.0, 0.01);

        //DOWNCASTING!!!!!
        

        BusinessAcount acc4 = (BusinessAcount)acc2;
        acc4.loan(100.0);

        if(acc3 instanceof BusinessAcount){
            BusinessAcount acc5 = (BusinessAcount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");

        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");

        }

        // TERMINEI A AULA 038 EM 35:23 !!



    }




}
