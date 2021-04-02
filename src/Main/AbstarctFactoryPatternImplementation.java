package Main;

import Bank.Bank;
import Factories.AbstractFactory;
import Factories.FactoryCreator;
import Loan.Loan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstarctFactoryPatternImplementation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Bank name");
        String bankName = br.readLine();
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);
        System.out.println("Enter the interest rate of bank :" + bank.getBankName());
        Double rate = Double.valueOf(br.readLine());
        System.out.println("Loan Type : ");
        String loanType = br.readLine();

        Double year = Double.valueOf(br.readLine());
        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan(loanType);
        loan.getInterestRate(rate);
        loan.calculateLoanPayment(year,100000);


    }
}
