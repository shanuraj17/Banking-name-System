package Bank;

public class ICICI implements Bank{
    String bankName;

    public ICICI(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
