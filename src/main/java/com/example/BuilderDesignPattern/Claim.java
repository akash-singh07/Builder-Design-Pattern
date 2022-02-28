package com.example.BuilderDesignPattern;

import org.springframework.beans.factory.annotation.Autowired;

public class Claim {

    private final String claimID; // required
    private final int customerID; // required
    private final String submitDate; // required
    private final int amount; // required
    private final int age; // optional
    private final String address; // optional
    private final String limits; // optional
    private final String location; // optional


    public Claim(ClaimBuilder builder) {
        this.claimID = builder.claimID;
        this.customerID = builder.customerID;
        this.submitDate = builder.submitDate;
        this.amount = builder.amount;
        this.age = builder.age;
        this.address = builder.address;
        this.limits = builder.limits;
        this.location = builder.location;
    }


    public String getClaimID() {
        return claimID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getSubmitDate() {
        return submitDate;
    }

    public int getAmount() {
        return amount;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getLimits() {
        return limits;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimID='" + claimID + '\'' +
                ", customerID=" + customerID +
                ", submitDate='" + submitDate + '\'' +
                ", amount=" + amount +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", limits='" + limits + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
