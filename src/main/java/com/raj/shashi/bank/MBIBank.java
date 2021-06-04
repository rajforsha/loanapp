package com.raj.shashi.bank;

import com.raj.shashi.dto.Address;
import com.raj.shashi.dto.LoanStatus;
import com.raj.shashi.dto.Person;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MBIBank extends Bank {

    private Map<String, Person> customers;
    private Map<Integer, LoanDetails> customersSanctionedLoans;

    public MBIBank(String bankName, String regId, Address address){
        super(bankName, regId, address);
        this.customers = new HashMap<>();
        this.customersSanctionedLoans = new HashMap<Integer, LoanDetails>();
    }

    public  boolean sanctionLoan(String customerName, int amount, int years, int rateOfInterest){

        // before providing the loan make sure the person is the customer of the particular bank

        Person person = this.getPerson(customerName);
        // logic to validate the person and amount to be sanctioned, we assume that the person is sanctioned loan

        LoanDetails loanDetails = new LoanDetails(amount, years, rateOfInterest);
        loanDetails.setStatus(LoanStatus.SANCTIONED);
        loanDetails.updateEmiDetails();

        // calculate emi amount

        this.customersSanctionedLoans.put(person.getCustomerId(), loanDetails);
        return true; // return false if something goes wrong
    }

    public  void makePayment(String customerName, int lumpSumpAmount, int emiNo){

        Person person = this.getPerson(customerName);
        LoanDetails loanDetails = customersSanctionedLoans.get(person.getCustomerId());
        // emi no says the no of emi have been made, so need to update the remaining amount
        loanDetails.updateRemainingAmount(lumpSumpAmount, emiNo);
        customersSanctionedLoans.put(person.getCustomerId(), loanDetails);
    }

    public  void getBalance(String customerName, int emiNo){

        Person person = this.getPerson(customerName);
        LoanDetails loanDetails = customersSanctionedLoans.get(person.getCustomerId());
        int emiLeft = loanDetails.getEmiLeft();
        int amountPaidSoFar = loanDetails.getAmountPaid();

        System.out.println(this.getBankName() + " "+ person.getName()+ " "+ amountPaidSoFar + " "+emiLeft);

    }

    private Person getPerson(String customerName){
        Person person = null;
        if(this.customers.get(customerName) == null){
            person = new Person(customerName);
            this.customers.put(customerName, person);
        }
        else{
            person = this.customers.get(customerName);
        }
        return person;
    }

}
