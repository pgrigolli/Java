package entities;

public class BankAccount {
    
    private int accountNumber;
    private String accountHolder;
    private double initialDeposit;
    private double accountBalance;

    public BankAccount(){
    }

    public BankAccount(int accountNumber, String accountHolder, double initialDeposit){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        Deposit(initialDeposit);
    }

    public BankAccount(int accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String newAccountHolder){
        this.accountHolder = newAccountHolder;
    }

    public double getInitialDeposit(){
        return initialDeposit;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public void Deposit(double depositMoney){
        this.accountBalance += depositMoney;
    }

    public void Withdrawal(double amount){
        amount += 5;
        this.accountBalance -= amount;
    }

    public String toString(){
        return "Account: " + String.format("%s", getAccountNumber()) + ", Holder: " + String.format("%s",getAccountHolder()) + ", Balance: $" + String.format("%s",getAccountBalance()); 
    }


}
