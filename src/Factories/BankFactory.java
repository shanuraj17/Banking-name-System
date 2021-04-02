package Factories;

import Bank.Bank;
import Loan.Loan;
import Bank.KOTAK;
import Bank.HDFC;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        if(bank==null)
            return null;
        else if(bank.equalsIgnoreCase("HDFC"))
            return new HDFC("HDFC");
        else if(bank.equalsIgnoreCase("KOTAK"))
            return new KOTAK("KOTAK");
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
