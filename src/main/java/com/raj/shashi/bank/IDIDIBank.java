package com.raj.shashi.bank;

import com.raj.shashi.dto.Address;
import com.raj.shashi.dto.LoanStatus;
import com.raj.shashi.dto.Person;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class IDIDIBank extends Bank {

    private Map<Integer, Person> customers;
    private Map<Integer, LoanDetails> customersSanctionedLoans;

    public IDIDIBank(String bankName, String regId, Address address){
        super(bankName, regId, address);
        this.customers = new HashMap<Integer, Person>();
        this.customersSanctionedLoans = new HashMap<Integer, LoanDetails>();
    }

    public  boolean sanctionLoan(Person person, int amount, int years, int rateOfInterest){

        // before providing the loan make sure the person is the customer of the particular bank

        if(this.customers.get(person.getCustomerId())!=null){
            this.customers.put(person.getCustomerId(), person);
        }

        // logic to validate the person and amount to be sanctioned, we assume that the person is sanctioned loan

        LoanDetails loanDetails = new LoanDetails();
        loanDetails.setLoanAmount(amount);
        loanDetails.setRateOfInterest(rateOfInterest);
        loanDetails.setYears(years);
        loanDetails.setStatus(LoanStatus.SANCTIONED);
        loanDetails.setStartDate(new Date());
        loanDetails.updateEmiDetails();

        // calculate emi amount

        this.customersSanctionedLoans.put(person.getCustomerId(), loanDetails);
        return true; // return false if something goes wrong
    }

    public  boolean makePayment(){
        return false;
    }

    public  void getBalance(){

    }

}
