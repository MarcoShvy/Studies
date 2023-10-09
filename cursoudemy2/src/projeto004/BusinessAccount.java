package projeto004;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount(){}

    public BusinessAccount(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (loanLimit <= amount) {
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -=2;
    }
}
