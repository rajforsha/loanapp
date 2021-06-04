package com.raj.shashi.dto;

public enum Gender {

    MALE("male"), FEMALE("female"), CANTDISCLOSE("can't disclose");

    private String value;

    private Gender(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
