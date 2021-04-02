package Loan;

public class HomeLoan extends Loan{
    double rate;

    @Override
    public void getInterestRate(double rate) {
        this.rate = rate;
    }
}
