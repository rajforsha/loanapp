import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDIDI extends Bank{

    private List<Person> customers;
    private Map<Person, LoanDetails> cutomersSanctionedLoans;

    public IDIDI(String bankName, String regId, Address address){
        super(bankName, regId, address);
        this.customers = new ArrayList<Person>();
        this.cutomersSanctionedLoans = new HashMap<Person, LoanDetails>();
    }

    public  boolean sanctionLoan(Person person){
        return false;
    }
    public  boolean makePayment(){
        return false;
    }
    public  void getBalance(){

    }
}
