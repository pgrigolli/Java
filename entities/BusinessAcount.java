package entities;

public class BusinessAcount extends Account {
    
    private Double loanLimit;


    public BusinessAcount(){

    }


    public BusinessAcount(Integer number, String holder, double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }


    public Double getLoanLimit() {
        return loanLimit;
    }


    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){
            deposit(amount);
        }
    }


}
