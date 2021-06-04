package com.raj.shashi.dto;

public class Address{
    private String city;
    private String pincode;
    private String state;
    private String roadNo;
    private String reference;

    public String getCity() {
        return city;
    }

    public String getPincode() {
        return pincode;
    }

    public String getState() {
        return state;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public String getReference() {
        return reference;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                ", state='" + state + '\'' +
                ", roadNo='" + roadNo + '\'' +
                ", reference='" + reference + '\'' +
                '}';
    }
}