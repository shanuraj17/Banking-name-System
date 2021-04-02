package Loan;

public class BusinessLoan extends Loan{
    double rate;

    @Override
    public void getInterestRate(double rate) {
        this.rate = rate;
    }
}
