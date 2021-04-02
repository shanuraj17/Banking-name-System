package Loan;

public abstract class Loan {
    protected double rate;
    public abstract void getInterestRate(double rate);
    public void calculateLoanPayment(Double year,int amount){
        Double interest = (amount * year * rate)/100;
        System.out.println("The Interest amount is :" + interest);
    }
}
