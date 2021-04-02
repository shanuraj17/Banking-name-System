package Bank;

public class HDFC implements Bank{
    String bankName;
    public HDFC(String bankName){
        this.bankName=bankName;
    }
    @Override
    public String getBankName() {
        return bankName;
    }
}
