package com.example.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {

            Claim c1 = new ClaimBuilder("C1", 1, "01/01/2022", 1000)
                    .setAddress("Prayagraj")
                    .setAge(40)
                    .build();

            System.out.println(c1);
    }
}
