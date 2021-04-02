package Loan;

public class EducationLoan extends Loan{
    double rate;
    @Override
    public void getInterestRate(double rate) {
        this.rate = rate;
        super.rate = rate;
    }
}
