package com.raj.shashi.bank;

import com.raj.shashi.dto.LoanStatus;

import java.util.Date;
import java.util.Random;

public class LoanDetails {

    private int loanId;
    private Integer loanAmount;
    private Integer balance;
    private Integer totalAmountToBePaid;
    private int years;
    private int totalInterest;
    private int rateOfInterest;
    private int totalEmi;
    private int emiLeft;
    private int emiPaid;
    private int emiAmount;
    private Date startDate;
    private Date closedDate;
    private LoanStatus status;
    private int amountPaid;

    public LoanDetails(int amount, int years, int rateOfInterest){
        this.loanId = new Random().nextInt(500);
        this.setLoanAmount(amount);
        this.setRateOfInterest(rateOfInterest);
        this.setYears(years);
        this.setStatus(LoanStatus.PENDING);
        this.setStartDate(new Date());
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public Integer getLoanAmountt() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(Date closedDate) {
        this.closedDate = closedDate;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }

    public Integer getTotalAmountToBePaid() {
        return totalAmountToBePaid;
    }

    public void setTotalAmountToBePaid(Integer totalAmountToBePaid) {
        this.totalAmountToBePaid = totalAmountToBePaid;
    }

    public int getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(int totalInterest) {
        this.totalInterest = totalInterest;
    }

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public int getTotalEmi() {
        return totalEmi;
    }

    public void setTotalEmi(int totalEmi) {
        this.totalEmi = totalEmi;
    }

    public int getEmiPaid() {
        return emiPaid;
    }

    public void setEmiPaid(int emiPaid) {
        this.emiPaid = emiPaid;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getEmiAmount() {
        return emiAmount;
    }

    public void setEmiAmount(int emiAmount) {
        this.emiAmount = emiAmount;
    }

    /**
     * updates the emi details when the loan is sanctioned
     */
    public void updateEmiDetails(){

        int interest = (this.loanAmount * this.years * (this.rateOfInterest)/ 100);
        int AmountToBePaid = interest + this.loanAmount;
        int emiCount = (int)Math.ceil(this.years* 12);
        int emiAmount = (int)Math.ceil(AmountToBePaid / (this.years* 12));

        this.setEmiLeft(this.years*12);
        this.setEmiPaid(0);
        this.setTotalEmi(emiCount);
        this.setBalance(AmountToBePaid);
        this.setTotalAmountToBePaid(AmountToBePaid);
        this.setEmiAmount(emiAmount);
        this.setAmountPaid(0);
    }

    /**
     *
     * @param lumpSumpAmount
     * @param emiNo
     * it receives the lump sump amount, which will reduce the no of emiLeft
     * increases the amount paid
     */

    public void updatePayment(int lumpSumpAmount, int emiNo){
        int reduceEmiCountByNumber = 0;

        if(lumpSumpAmount >= this.emiAmount){
            reduceEmiCountByNumber = (int)Math.ceil(lumpSumpAmount / this.emiAmount);
        }

        this.amountPaid += lumpSumpAmount;
        this.balance = this.totalAmountToBePaid - this.amountPaid;
        this.setEmiLeft(this.totalEmi - this.emiPaid - reduceEmiCountByNumber);
    }

    /**
     *
     * @param emiNo
     * emiNo indicates that the user has made the payment till the emiNo and now we need to
     * return the balance left
     */

    public void updateBalance(int emiNo){

        // this is updated for the emi number

        this.amountPaid += (emiNo - this.emiPaid) * this.emiAmount;
        this.balance = this.totalAmountToBePaid - this.amountPaid;
        this.setEmiPaid(emiNo);
        this.setEmiLeft(this.totalEmi - this.emiPaid);
    }

    @Override
    public String toString() {
        return "LoanDetails{" +
                "loanId=" + loanId +
                ", totolAmount=" + loanAmount +
                ", balance=" + balance +
                ", totalAmountToBePaid=" + totalAmountToBePaid +
                ", years=" + years +
                ", rateOfInterest=" + rateOfInterest +
                ", emiLeft=" + emiLeft +
                ", startDate=" + startDate +
                ", closedDate=" + closedDate +
                ", status=" + status +
                '}';
    }
}
