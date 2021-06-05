package com.raj.shashi;

import com.raj.shashi.command.*;
import com.raj.shashi.utils.Reader;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public  static void main(String [] args){

        List<Command> commands = new ArrayList<>();
        List<String> lines = Reader.get("/Users/shraj/Documents/groupon/shraj/loanapp/src/main/resources/input2.txt");
        CommandExecutor commandExecutor = new CommandExecutor();
        lines.forEach(line->{

            String [] values = line.split("\\s");

            switch(values[0]){
                case "LOAN":
                    LoanCommand loanCommand = new LoanCommand("LOAN", values[1], values[2]);
                    loanCommand.setAmount(Integer.valueOf(values[3]));
                    loanCommand.setYears(Integer.valueOf(values[4]));
                    loanCommand.setRateOfInterest(Integer.valueOf(values[5]));
                    commands.add(loanCommand);
                    break;
                case "PAYMENT":
                    PaymentCommand paymentCommand = new PaymentCommand("PAYMENT", values[1], values[2]);
                    paymentCommand.setAmount(Integer.valueOf(values[3]));
                    paymentCommand.setEmiCount(Integer.valueOf(values[4]));
                    commands.add(paymentCommand);
                    break;

                case "BALANCE":
                    BalanceCommand balanceCommand = new BalanceCommand("BALANCE", values[1], values[2]);
                    balanceCommand.setEmiNumber(Integer.valueOf(values[3]));
                    commands.add(balanceCommand);
                    break;

                default:
                    System.out.println("Command not supported");

            }

        });

        commandExecutor.execute(commands); // executes all the command

    }

}
