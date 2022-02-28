package com.example.BuilderDesignPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaimBuilderTest {

    @Test
    public void createClaimTest() {
        Claim c1 = new ClaimBuilder("C1", 1, "01/01/2022", 1000)
                .setAddress("Prayagraj")
                .setAge(40)
                .build();

        assertEquals("C1", c1.getClaimID());
        assertEquals(1, c1.getCustomerID());
        assertEquals("01/01/2022", c1.getSubmitDate());
        assertEquals(1000, c1.getAmount());
        assertEquals("Prayagraj", c1.getAddress());
        assertEquals(40, c1.getAge());
        assertNull(c1.getLocation());
        assertNull(c1.getLimits());

    }
}