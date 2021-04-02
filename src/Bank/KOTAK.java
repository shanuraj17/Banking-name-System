package Bank;

public class KOTAK implements Bank{
    String bankName;

    public KOTAK(String bankName) {
        this.bankName=bankName;
    }

    @Override
    public String getBankName() {
        return bankName;
    }
}
