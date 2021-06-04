package com.raj.shashi.command;

import com.raj.shashi.bank.BankFactory;

import java.util.List;

public class CommandExecutor {

    private BankFactory bankFactory;

    public CommandExecutor(){
        this.bankFactory = new BankFactory();
    }

    public void execute(List<Command> commands){

        commands.forEach(command->{

            // for each command
            String commandName = command.getCommand();
            String bankName = command.getBankName();
            String customerName = command.getCustomerName();

            int amount =0;
            int emiCount = 0;
            switch(commandName){

                case "LOAN":
                    amount = ((LoanCommand)command).getAmount();
                    int years = ((LoanCommand)command).getYears();
                    int rateOfInterest = ((LoanCommand)command).getRateOfInterest();
                    this.bankFactory.getBank(bankName).sanctionLoan(customerName, amount, years, rateOfInterest);
                    break;
                case "PAYMENT":
                    amount = ((PaymentCommand)command).getAmount();
                    emiCount = ((PaymentCommand)command).getEmiCount();
                    this.bankFactory.getBank(bankName).makePayment(customerName, amount, emiCount);
                    break;
                case "BALANCE":
                    emiCount = ((BalanceCommand)command).getEmiNumber();
                    this.bankFactory.getBank(bankName).getBalance(customerName, emiCount);
                    break;

                default:
                    System.out.println("no such command ");

            }

        });
    }
}
