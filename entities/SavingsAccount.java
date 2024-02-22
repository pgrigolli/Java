package entities;

public class SavingsAccount extends Account{
    
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }
    



    public void updateBalance(){

        balance += balance * interestRate;

    }

    @Override //<-- SOBREPOSICAO
    public void withdraw(double amount){
        balance -= amount;
    }


    

}
