package Factories;

import Bank.Bank;
import Loan.Loan;
import Loan.HomeLoan;
import Loan.BusinessLoan;
import Loan.EducationLoan;

public class LoanFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if(loan==null)
            return null;
        else if(loan.equalsIgnoreCase("Business"))
            return new BusinessLoan();
        else if(loan.equalsIgnoreCase("Education"))
            return new EducationLoan();
        else if(loan.equalsIgnoreCase("Home"))
            return new HomeLoan();
        return null;
    }
}
