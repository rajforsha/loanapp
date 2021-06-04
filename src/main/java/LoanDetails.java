public class LoanDetails {

    private String loanId;
    private Integer totolAmount;
    private Integer balance;
    private int years;
    private int rateOfInterest;
    private int emiLeft;

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public Integer getTotolAmount() {
        return totolAmount;
    }

    public void setTotolAmount(Integer totolAmount) {
        this.totolAmount = totolAmount;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(int rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getEmiLeft() {
        return emiLeft;
    }

    public void setEmiLeft(int emiLeft) {
        this.emiLeft = emiLeft;
    }
}
