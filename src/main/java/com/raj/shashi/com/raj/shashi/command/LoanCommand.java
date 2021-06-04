package com.raj.shashi.com.raj.shashi.command;

public class LoanCommand  extends Command {

    private int amount;
    private int years;
    private int rateOfInterest;

    public LoanCommand(String command, String bankName, String customerName){
        super(command, bankName, customerName);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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
}
