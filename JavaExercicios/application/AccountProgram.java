package application;

import java.util.Locale;


import entities.Account;
import entities.SavingsAccount;




public class AccountProgram {

    


    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        // Account acc = new Account(1001, "Alex", 0.0);
        // BusinessAcount bAcc = new BusinessAcount(1002, "Maria", 0.0, 500.0);

        // //UPCASTING!!!!!!!


        // Account acc1 = bAcc;
        // Account acc2 = new BusinessAcount(1003, "Pedro", 0.0, 750.00);
        // Account acc3 = new SavingsAccount(1004, "Julia", 0.0, 0.01);

        // //DOWNCASTING!!!!!
        

        // BusinessAcount acc4 = (BusinessAcount)acc2;
        // acc4.loan(100.0);

        // if(acc3 instanceof BusinessAcount){
        //     BusinessAcount acc5 = (BusinessAcount) acc3;
        //     acc5.loan(200.0);
        //     System.out.println("Loan!");

        // }

        // if(acc3 instanceof SavingsAccount){
        //     SavingsAccount acc5 = (SavingsAccount) acc3;
        //     acc5.updateBalance();
        //     System.out.println("Update!");

        // }

            // Account acc1 = new Account(1002, "Julia", 1000);
            // acc1.withdraw(200);
            // System.out.println(acc1.getBalance());

            // SavingsAccount acc2 = new SavingsAccount(1000, "Pedro", 1000, 0.01);
            // acc2.withdraw(200);    
            // System.out.println(acc2.getBalance());
            
            // BusinessAcount acc3 = new BusinessAcount( 1003, "Pedro", 1000.0, 1000.0);
            // acc3.withdraw(200);
            // System.out.println(acc3.getBalance());


            Account x = new Account(1003, "Pedro", 1000);
            Account y = new SavingsAccount(1002, "Julia", 1000, 0.01);

            x.withdraw(50);
            y.withdraw(50);

            System.out.println(x.getBalance());
            System.out.println(y.getBalance());




    }




}
