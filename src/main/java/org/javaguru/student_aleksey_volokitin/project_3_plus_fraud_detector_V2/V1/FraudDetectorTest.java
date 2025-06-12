package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V1;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();

        // Testing Rule 1
        fraudDetectorTest.rule1Test1();
        fraudDetectorTest.rule1Test2();
        fraudDetectorTest.rule1Test3();
        fraudDetectorTest.rule1Test4();
        fraudDetectorTest.rule1Test5();
        fraudDetectorTest.rule1Test6();
        fraudDetectorTest.rule1Test7();
        // Testing Rule 2
        fraudDetectorTest.rule2Test1();
        fraudDetectorTest.rule2Test2();
        fraudDetectorTest.rule2Test3();
        // Testing Rule 3
        fraudDetectorTest.rule3Test1();
        fraudDetectorTest.rule3Test2();
        fraudDetectorTest.rule3Test3();
        fraudDetectorTest.rule3Test4();
        // Testing Rule 4
        fraudDetectorTest.rule4Test1();
        fraudDetectorTest.rule4Test2();
        fraudDetectorTest.rule4Test3();
        // Testing Rule 5
        fraudDetectorTest.rule5Test1();
        fraudDetectorTest.rule5Test2();
        fraudDetectorTest.rule5Test3();
        fraudDetectorTest.rule5Test4();
        // Testing Rule 5
        fraudDetectorTest.rule6Test1();
        fraudDetectorTest.rule6Test2();
        fraudDetectorTest.rule6Test3();
        fraudDetectorTest.rule6Test4();
        fraudDetectorTest.rule6Test5();
        fraudDetectorTest.rule6Test6();

    }
    // Tests for Rule 1
    void rule1Test1() {
        Trader trader = new Trader("Aleks", "Chita", "Russia");
        Transaction transaction = new Transaction(trader, 1000);
        boolean expectedResult = false;

        FraudRule1 fraudRule = new FraudRule1();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 1 - OK"); }
        else                          { System.out.println("Rule 1 test 1 - FAIL"); }
    }

    void rule1Test2() {
        Trader trader = new Trader("Pokemon", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 2000);
        boolean expectedResult = true;

        FraudRule1 fraudRule = new FraudRule1();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 2 - OK"); }
        else                          { System.out.println("Rule 1 test 2 - FAIL"); }
    }

    void rule1Test3() {
        Trader trader = new Trader("DJ", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 2000);
        boolean expectedResult = true;

        FraudRule1 fraudRule = new FraudRule1();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 3 - OK"); }
        else                          { System.out.println("Rule 1 test 3 - FAIL"); }
    }

    void rule1Test4() {
        Trader trader = new Trader("PokemoN", "London", "UK");
        Transaction transaction = new Transaction(trader, 2000);
        boolean expectedResult = true;

        FraudRule1 fraudRule = new FraudRule1();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 4 - OK"); }
        else                          { System.out.println("Rule 1 test 4 - FAIL"); }
    }

    void rule1Test5() {
        Trader trader = new Trader("dj", "London", "UK");
        Transaction transaction = new Transaction(trader, 2000);
        boolean expectedResult = true;

        FraudRule1 fraudRule = new FraudRule1();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 5 - OK"); }
        else                          { System.out.println("Rule 1 test 5 - FAIL"); }
    }

    void rule1Test6() {
        Trader trader = new Trader("Pokemon2", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 2000);
        boolean expectedResult = false;

        FraudRule1 fraudRule = new FraudRule1();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 6 - OK"); }
        else                          { System.out.println("Rule 1 test 6 - FAIL"); }
    }

    void rule1Test7() {
        Trader trader = new Trader("DJ2", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 2000);
        boolean expectedResult = false;

        FraudRule1 fraudRule = new FraudRule1();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 7 - OK"); }
        else                          { System.out.println("Rule 1 test 7 - FAIL"); }
    }

    // Tests for Rule 2
    void rule2Test1() {
        Trader trader = new Trader("John", "L.A.", "USA");
        Transaction transaction = new Transaction(trader, 999999);
        boolean expectedResult = false;

        FraudRule2 fraudRule = new FraudRule2();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 2 test 1 - OK"); }
        else                          { System.out.println("Rule 2 test 1 - FAIL"); }
    }

    void rule2Test2() {
        Trader trader = new Trader("John", "L.A.", "USA");
        Transaction transaction = new Transaction(trader, 1000000);
        boolean expectedResult = false;

        FraudRule2 fraudRule = new FraudRule2();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 2 test 2 - OK"); }
        else                          { System.out.println("Rule 2 test 2 - FAIL"); }
    }

    void rule2Test3() {
        Trader trader = new Trader("John", "L.A.", "USA");
        Transaction transaction = new Transaction(trader, 1000001);
        boolean expectedResult = true;

        FraudRule2 fraudRule = new FraudRule2();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 2 test 3 - OK"); }
        else                          { System.out.println("Rule 2 test 3 - FAIL"); }
    }

    // Tests for Rule 3
    void rule3Test1() {
        Trader trader = new Trader("John", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = true;

        FraudRule3 fraudRule = new FraudRule3();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 3 test 1 - OK"); }
        else                          { System.out.println("Rule 3 test 1 - FAIL"); }

    }

    void rule3Test2() {
        Trader trader = new Trader("John", "SIDney", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = true;

        FraudRule3 fraudRule = new FraudRule3();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 3 test 2 - OK"); }
        else                          { System.out.println("Rule 3 test 2 - FAIL"); }
    }

    void rule3Test3() {
        Trader trader = new Trader("John", "Sidney2", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = false;

        FraudRule3 fraudRule = new FraudRule3();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 3 test 3 - OK"); }
        else                          { System.out.println("Rule 3 test 3 - FAIL"); }
    }

    void rule3Test4() {
        Trader trader = new Trader("John", "New York", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = false;

        FraudRule3 fraudRule = new FraudRule3();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 3 test 4 - OK"); }
        else                          { System.out.println("Rule 3 test 4 - FAIL"); }
    }

    // Tests for Rule 4
    void rule4Test1() {
        Trader trader = new Trader("Jam", "Jakarta", "Jamaica");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = true;

        FraudRule4 fraudRule = new FraudRule4();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 4 test 1 - OK"); }
        else                          { System.out.println("Rule 4 test 1 - FAIL"); }
    }

    void rule4Test2() {
        Trader trader = new Trader("Jam", "Jakarta", "JamAIca");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = true;

        FraudRule4 fraudRule = new FraudRule4();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 4 test 2 - OK"); }
        else                          { System.out.println("Rule 4 test 2 - FAIL"); }
    }

    void rule4Test3() {
        Trader trader = new Trader("Jam", "Jakarta", "Jamaica2");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = false;

        FraudRule4 fraudRule = new FraudRule4();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 4 test 3 - OK"); }
        else                          { System.out.println("Rule 4 test 3 - FAIL"); }
    }

    // Tests for Rule 5
    void rule5Test1() {
        Trader trader = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 500);
        boolean expectedResult = false;

        FraudRule4 fraudRule = new FraudRule4();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 5 test 1 - OK"); }
        else                          { System.out.println("Rule 5 test 1 - FAIL"); }
    }
    void rule5Test2() {
        Trader trader = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000);
        boolean expectedResult = false;

        FraudRule5 fraudRule = new FraudRule5();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 5 test 2 - OK"); }
        else                          { System.out.println("Rule 5 test 2 - FAIL"); }
    }
    void rule5Test3() {
        Trader trader = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = true;

        FraudRule5 fraudRule = new FraudRule5();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 5 test 3 - OK"); }
        else                          { System.out.println("Rule 5 test 3 - FAIL"); }
    }
    void rule5Test4() {
        Trader trader = new Trader("Hans", "Berlin", "Germany2");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = false;

        FraudRule5 fraudRule = new FraudRule5();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 5 test 4 - OK"); }
        else                          { System.out.println("Rule 5 test 4 - FAIL"); }
    }
    // Tests for Rule 6
    void rule6Test1() {
        Trader trader = new Trader("Yori", "Tokyo", "China");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = false;

        FraudRule6 fraudRule = new FraudRule6();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 6 test 1 - OK"); }
        else                          { System.out.println("Rule 6 test 1 - FAIL"); }
    }

    void rule6Test2() {
        Trader trader = new Trader("Yori", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = false;

        FraudRule6 fraudRule = new FraudRule6();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 6 test 2 - OK"); }
        else                          { System.out.println("Rule 6 test 2 - FAIL"); }
    }
    void rule6Test3() {
        Trader trader = new Trader("Yo", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = false;

        FraudRule6 fraudRule = new FraudRule6();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 6 test 3 - OK"); }
        else                          { System.out.println("Rule 6 test 3 - FAIL"); }
    }
    void rule6Test4() {
        Trader trader = new Trader("LOL-", "Tokyo", "Jap");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = false;

        FraudRule6 fraudRule = new FraudRule6();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 6 test 4 - OK"); }
        else                          { System.out.println("Rule 6 test 4 - FAIL"); }
    }
    void rule6Test5() {
        Trader trader = new Trader("lol-", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = true;

        FraudRule6 fraudRule = new FraudRule6();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 6 test 5 - OK"); }
        else                          { System.out.println("Rule 6 test 5 - FAIL"); }
    }
    void rule6Test6() {
        Trader trader = new Trader("LOL-Yori", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = true;

        FraudRule6 fraudRule = new FraudRule6();
        boolean result = fraudRule.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 6 test 6 - OK"); }
        else                          { System.out.println("Rule 6 test 6 - FAIL"); }
    }


}
