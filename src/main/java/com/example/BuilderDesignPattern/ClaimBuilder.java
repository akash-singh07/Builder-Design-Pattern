package com.example.BuilderDesignPattern;

public class ClaimBuilder {
    String claimID;
    int customerID;
    String submitDate;
    int amount;
    int age;
    String address;
    String limits;
    String location;

    public ClaimBuilder(String claimID, int customerID, String submitDate, int amount) {
        this.claimID = claimID;
        this.customerID = customerID;
        this.submitDate = submitDate;
        this.amount = amount;
    }

    public ClaimBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public ClaimBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public ClaimBuilder setLimits(String limits) {
        this.limits = limits;
        return this;
    }

    public ClaimBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    public Claim build() {
        Claim cl = new Claim(this);
        return cl;
    }

}
