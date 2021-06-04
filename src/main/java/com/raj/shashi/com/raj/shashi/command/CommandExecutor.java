package com.raj.shashi.com.raj.shashi.command;

import com.raj.shashi.bank.BankFactory;
import com.raj.shashi.dto.Person;

import java.util.List;

public class CommandExecutor {

    public void execute(List<Command> commands){

        commands.forEach(command->{

            // for each command
            String commandName = command.getCommand();
            String bankName = command.getBankName();
            String customerName = command.getCustomerName();

            Person person = new Person(customerName);
            int amount =0;
            int emiCount = 0;
            switch(commandName){

                case "LOAN":
                    amount = ((LoanCommand)command).getAmount();
                    int years = ((LoanCommand)command).getAmount();
                    int rateOfInterest = ((LoanCommand)command).getAmount();
                    BankFactory.getBank(bankName).sanctionLoan(person,amount, years, rateOfInterest);
                    break;
                case "PAYMENT":
                    amount = ((PaymentCommand)command).getAmount();
                    emiCount = ((PaymentCommand)command).getEmiCount();
                    BankFactory.getBank(bankName).makePayment();
                    break;
                case "BALANCE":
                    emiCount = ((BalanceCommand)command).getEmiNumber();
                    BankFactory.getBank(bankName).getBalance();
                    break;

                default:
                    System.out.println("no such command ");

            }

        });
    }
}
