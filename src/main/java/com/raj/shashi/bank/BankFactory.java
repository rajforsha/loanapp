package com.raj.shashi.bank;

import java.util.HashMap;
import java.util.Map;

public class BankFactory {

    private Map<String, Bank> factory;

    public BankFactory() {
        factory = new HashMap<>();
        factory.put("IDIDI", new IDIDIBank("IDIDI", "123", null));
        factory.put("MBI", new MBIBank("MBI", "234", null));
        factory.put("UON", new UONBank("UON", "345", null));
    }

    public Bank getBank(String bankName){

        return factory.get(bankName);

    }
}
