package com.raj.shashi.command;

public class PaymentCommand extends Command {

    private int amount;
    private int emiCount;

    public PaymentCommand(String command, String bankName, String customerName){
        super(command, bankName, customerName);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getEmiCount() {
        return emiCount;
    }

    public void setEmiCount(int emiCount) {
        this.emiCount = emiCount;
    }
}
