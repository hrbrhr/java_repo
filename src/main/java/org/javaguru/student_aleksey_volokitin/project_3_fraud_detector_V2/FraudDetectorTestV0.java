package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_V2;

class FraudDetectorTestV0 {
    public static void main(String[] args) {
        FraudDetectorTestV0 fraudDetectorTest = new FraudDetectorTestV0();

        // Testing Rule 1
        fraudDetectorTest.test1();
        fraudDetectorTest.test2();
        fraudDetectorTest.test3();
        fraudDetectorTest.test4();
        fraudDetectorTest.test5();
        // Testing Rule 2
        fraudDetectorTest.test6();
        fraudDetectorTest.test7();
        fraudDetectorTest.test8();
        // Testing Rule 3
        fraudDetectorTest.test9();
        fraudDetectorTest.test10();
        fraudDetectorTest.test11();
        fraudDetectorTest.test12();
        // Testing Rule 4
        fraudDetectorTest.test13();
        fraudDetectorTest.test14();
        fraudDetectorTest.test15();
        // Testing Rule 5
        fraudDetectorTest.test16();
        fraudDetectorTest.test17();
        fraudDetectorTest.test18();
        fraudDetectorTest.test19();

    }
    // Tests for Rule 1
    void test1() {
        Trader trader1 = new Trader("Aleks", "Chita", "Russia");
        Transaction transaction1 = new Transaction(trader1, 1000);
        boolean expectedResult = false;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 1 - OK"); }
        else                          { System.out.println("Test 1 - FAIL"); }
    }
    void test2() {
        Trader trader1 = new Trader("Pokemon", "Moscow", "Russia");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = true;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 2 - OK"); }
        else                          { System.out.println("Test 2 - FAIL"); }
    }
    void test3() {
        Trader trader1 = new Trader("PokemoN", "London", "UK");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = true;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 3 - OK"); }
        else                          { System.out.println("Test 3 - FAIL"); }
    }
    void test4() {
        Trader trader1 = new Trader("POKEMON", "London", "UK");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = true;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 4 - OK"); }
        else                          { System.out.println("Test 4 - FAIL"); }
    }
    void test5() {
        Trader trader1 = new Trader("Pokemon2", "Moscow", "Russia");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = false;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 5 - OK"); }
        else                          { System.out.println("Test 5 - FAIL"); }
    }

    // Tests for Rule 2
    void test6() {
        Trader trader1 = new Trader("John", "L.A.", "USA");
        Transaction transaction1 = new Transaction(trader1, 999999);
        boolean expectedResult = false;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 6 - OK"); }
        else                          { System.out.println("Test 6 - FAIL"); }
    }
    void test7() {
        Trader trader1 = new Trader("John", "L.A.", "USA");
        Transaction transaction1 = new Transaction(trader1, 1000000);
        boolean expectedResult = false;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 7 - OK"); }
        else                          { System.out.println("Test 7 - FAIL"); }
    }
    void test8() {
        Trader trader1 = new Trader("John", "L.A.", "USA");
        Transaction transaction1 = new Transaction(trader1, 1000001);
        boolean expectedResult = true;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 8 - OK"); }
        else                          { System.out.println("Test 8 - FAIL"); }
    }

    // Tests for Rule 3
    void test9() {
        Trader trader1 = new Trader("John", "Sidney", "Australia");
        Transaction transaction1 = new Transaction(trader1, 10000);
        boolean expectedResult = true;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 9 - OK"); }
        else                          { System.out.println("Test 9 - FAIL"); }
    }
    void test10() {
        Trader trader1 = new Trader("John", "SIDney", "Australia");
        Transaction transaction1 = new Transaction(trader1, 10000);
        boolean expectedResult = true;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 10 - OK"); }
        else                          { System.out.println("Test 10 - FAIL"); }
    }
    void test11() {
        Trader trader1 = new Trader("John", "Sidney2", "Australia");
        Transaction transaction1 = new Transaction(trader1, 10000);
        boolean expectedResult = false;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 11 - OK"); }
        else                          { System.out.println("Test 11 - FAIL"); }
    }
    void test12() {
        Trader trader1 = new Trader("John", "New York", "Australia");
        Transaction transaction1 = new Transaction(trader1, 10000);
        boolean expectedResult = false;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 12 - OK"); }
        else                          { System.out.println("Test 12 - FAIL"); }
    }
    // Tests for Rule 4
    void test13() {
        Trader trader1 = new Trader("Jam", "Jakarta", "Jamaica");
        Transaction transaction1 = new Transaction(trader1, 10000);
        boolean expectedResult = true;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 13 - OK"); }
        else                          { System.out.println("Test 13 - FAIL"); }
    }
    void test14() {
        Trader trader1 = new Trader("Jam", "Jakarta", "JamAIca");
        Transaction transaction1 = new Transaction(trader1, 10000);
        boolean expectedResult = true;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 14 - OK"); }
        else                          { System.out.println("Test 14 - FAIL"); }
    }
    void test15() {
        Trader trader1 = new Trader("Jam", "Jakarta", "Jamaica2");
        Transaction transaction1 = new Transaction(trader1, 10000);
        boolean expectedResult = false;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 15 - OK"); }
        else                          { System.out.println("Test 15 - FAIL"); }
    }
    void test16() {
        Trader trader1 = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction1 = new Transaction(trader1, 500);
        boolean expectedResult = false;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 16 - OK"); }
        else                          { System.out.println("Test 16 - FAIL"); }
    }
    void test17() {
        Trader trader1 = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction1 = new Transaction(trader1, 1000);
        boolean expectedResult = false;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 17 - OK"); }
        else                          { System.out.println("Test 17 - FAIL"); }
    }
    void test18() {
        Trader trader1 = new Trader("Hans", "Berlin", "Germany");
        Transaction transaction1 = new Transaction(trader1, 1001);
        boolean expectedResult = true;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 18 - OK"); }
        else                          { System.out.println("Test 18 - FAIL"); }
    }
    void test19() {
        Trader trader1 = new Trader("Hans", "Berlin", "Germany2");
        Transaction transaction1 = new Transaction(trader1, 1001);
        boolean expectedResult = false;

        FraudDetectorV1 fraudDetector1 = new FraudDetectorV1();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 19 - OK"); }
        else                          { System.out.println("Test 19 - FAIL"); }
    }
}
