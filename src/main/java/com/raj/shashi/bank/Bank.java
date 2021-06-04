package com.raj.shashi.bank;

import com.raj.shashi.dto.Address;
import com.raj.shashi.dto.Person;

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

    public abstract boolean sanctionLoan(String customerName, int amount, int years, int rateOfInterest);

    public abstract void makePayment(String customerName, int lumpSumpAmount, int emiNo);

    public abstract void getBalance(String customerName, int emiNo);

}
