package com.raj.shashi.command;

public class BalanceCommand extends Command {

    private int emiNumber;

    public BalanceCommand(String command, String bankName, String customerName){
        super(command, bankName, customerName);
    }

    public int getEmiNumber() {
        return emiNumber;
    }

    public void setEmiNumber(int emiNumber) {
        this.emiNumber = emiNumber;
    }
}
