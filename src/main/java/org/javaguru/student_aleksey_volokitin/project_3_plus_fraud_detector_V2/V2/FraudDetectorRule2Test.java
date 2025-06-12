package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

class FraudDetectorRule2Test {
    // Tests for Rule 2
    // test 1 - сумма транзакции меньше максимальной
    void rule2Test1() {
        Trader trader = new Trader("John", "L.A.", "USA");
        Transaction transaction = new Transaction(trader, 999999);
        boolean expectedResult = false;

        FraudRule2 fraudRule = new FraudRule2();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 2 test 1 - OK"); }
        else                          { System.out.println("Rule 2 test 1 - FAIL"); }
    }

    // test 2 - сумма транзакции равна максимальной
    void rule2Test2() {
        Trader trader = new Trader("John", "L.A.", "USA");
        Transaction transaction = new Transaction(trader, 1000000);
        boolean expectedResult = false;

        FraudRule2 fraudRule = new FraudRule2();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 2 test 2 - OK"); }
        else                          { System.out.println("Rule 2 test 2 - FAIL"); }
    }

    // test 3 - сумма транзакции больше максимальной
    void rule2Test3() {
        Trader trader = new Trader("John", "L.A.", "USA");
        Transaction transaction = new Transaction(trader, 1000001);
        boolean expectedResult = true;

        FraudRule2 fraudRule = new FraudRule2();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 2 test 3 - OK"); }
        else                          { System.out.println("Rule 2 test 3 - FAIL"); }
    }
}
