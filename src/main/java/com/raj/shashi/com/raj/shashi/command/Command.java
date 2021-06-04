package com.raj.shashi.com.raj.shashi.command;

public abstract class Command {

    private String command;
    private String bankName;
    private String customerName;

    public Command(String command, String bankName, String customerName){
        this.command = command;
        this.bankName = bankName;
        this.customerName = customerName;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
