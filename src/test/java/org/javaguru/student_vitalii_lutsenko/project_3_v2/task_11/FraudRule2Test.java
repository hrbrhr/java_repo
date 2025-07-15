package org.javaguru.student_vitalii_lutsenko.project_3_v2.task_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudRule2Test {

    private final FraudRule2 fraudRule2 = new FraudRule2();
    @Test
    public void withFraud(){
        Trader trader = new Trader("A","B","C");
        Transaction transaction = new Transaction(trader,1001001);
        assertTrue(fraudRule2.isFraud(transaction));
    }
    @Test
    public void withoutFraud(){
        Trader trader = new Trader("A","B","C");
        Transaction transaction = new Transaction(trader,100);
        assertFalse(fraudRule2.isFraud(transaction));
    }


}