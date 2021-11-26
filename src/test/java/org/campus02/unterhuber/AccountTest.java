package org.campus02.unterhuber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account accountMichael;

    @BeforeEach
    void initialize() {
        this.accountMichael = new Account("Michael");
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals("Michael", accountMichael.getOwner());
        Assertions.assertEquals(100.0, accountMichael.getAmount());
    }


    @Test
    void testSingleCredit() {
        accountMichael.credit(120.0);
        Assertions.assertEquals(220.0, accountMichael.getAmount());
    }


    @Test
    void testMultiCredit() {
        accountMichael.credit(110.0);
        Assertions.assertEquals(210.0, accountMichael.getAmount());
        accountMichael.credit(120.0);
        Assertions.assertEquals(330.0, accountMichael.getAmount());
        accountMichael.credit(130.0);
        Assertions.assertEquals(460.0, accountMichael.getAmount());
    }
}
