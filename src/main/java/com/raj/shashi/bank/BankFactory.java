package com.raj.shashi.bank;

import java.util.HashMap;
import java.util.Map;

public class BankFactory {

    public static Bank getBank(String bankName){

        Map<String, Bank> factory = new HashMap<String, Bank>();
        factory.put("IDIDI", new IDIDIBank("IDIDI", "123", null));
        factory.put("MBI", new MBIBank("MBI", "234", null));
        factory.put("UON", new UONBank("UON", "345", null));

        return factory.get(bankName);

    }
}
