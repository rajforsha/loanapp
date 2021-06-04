public abstract class Bank {

    public Bank(String bankName, String regId, Address address){
        this.bankName = bankName;
        this.regId = regId;
        this.address = address;
    }

    private String bankName;
    private Address address;

    private String regId;

    public String getBankName() {
        return bankName;
    }

    public Address getAddress() {
        return address;
    }

    public String getRegId() {
        return regId;
    }

    public abstract boolean sanctionLoan(Person person);

    public abstract boolean makePayment();

    public abstract void getBalance();

}
