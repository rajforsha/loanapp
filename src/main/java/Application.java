import com.raj.shashi.com.raj.shashi.command.Command;
import com.raj.shashi.com.raj.shashi.command.LoanCommand;
import com.raj.shashi.com.raj.shashi.command.PaymentCommand;
import com.raj.shashi.utils.Reader;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public  static void main(String [] args){

        // we need to get the details of banks registered

        List<Command> commands = new ArrayList<>();
        List<String> lines = Reader.get("/resources/input.txt");
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



            }

        });

    }

}
