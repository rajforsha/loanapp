package com.raj.shashi.dto;

import java.util.Random;

public class Person {

    private int customerId;
    private String name;
    private int age;
    private Gender gender;
    private MaritalStatus status;
    private Address address;
    private AddressProof addressProof;
    private EmploymentProof employmentProof;

    public Person(String name, int age, Gender gender) {
        this.customerId = new Random().nextInt();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static class AddressProof{

        private String documentId;
        private String documentName;

        public String getDocumentId() {
            return documentId;
        }

        public void setDocumentId(String documentId) {
            this.documentId = documentId;
        }

        public String getDocumentName() {
            return documentName;
        }

        public void setDocumentName(String documentName) {
            this.documentName = documentName;
        }

        @Override
        public String toString() {
            return "AddressProof{" +
                    "documentId='" + documentId + '\'' +
                    ", documentName='" + documentName + '\'' +
                    '}';
        }
    }

    public static class EmploymentProof{

        private String empId;
        private String companyName;
        private Address companyAddress;

        public String getEmpId() {
            return empId;
        }

        public void setEmpId(String empId) {
            this.empId = empId;
        }

        public String getCompanyName() {
            return companyName;
        }

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public Address getCompanyAddress() {
            return companyAddress;
        }

        public void setCompanyAddress(Address companyAddress) {
            this.companyAddress = companyAddress;
        }

        @Override
        public String toString() {
            return "EmploymentProof{" +
                    "empId='" + empId + '\'' +
                    ", companyName='" + companyName + '\'' +
                    ", companyAddress=" + companyAddress +
                    '}';
        }
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MaritalStatus getStatus() {
        return status;
    }

    public void setStatus(MaritalStatus status) {
        this.status = status;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AddressProof getAddressProof() {
        return addressProof;
    }

    public void setAddressProof(AddressProof addressProof) {
        this.addressProof = addressProof;
    }

    public EmploymentProof getEmploymentProof() {
        return employmentProof;
    }

    public void setEmploymentProof(EmploymentProof employmentProof) {
        this.employmentProof = employmentProof;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                ", addressProof=" + addressProof +
                ", employmentProof=" + employmentProof +
                '}';
    }
}
