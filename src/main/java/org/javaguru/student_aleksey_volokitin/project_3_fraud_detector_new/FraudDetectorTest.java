package org.javaguru.student_aleksey_volokitin.project_3_fraud_detector_new;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();

        // Testing Rule1
        fraudDetectorTest.test1();
        fraudDetectorTest.test2();
        fraudDetectorTest.test3();
        fraudDetectorTest.test4();
        fraudDetectorTest.test5();
    }
    void test1() {
        Trader trader1 = new Trader("Aleks", "Chita");
        Transaction transaction1 = new Transaction(trader1, 1000);
        boolean expectedResult = false;

        FraudDetector fraudDetector1 = new FraudDetector();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 1 - OK"); }
        else                          { System.out.println("Test 1 - FAIL"); }
    }
    void test2() {
        Trader trader1 = new Trader("Pokemon", "Moscow");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = true;

        FraudDetector fraudDetector1 = new FraudDetector();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 2 - OK"); }
        else                          { System.out.println("Test 2 - FAIL"); }
    }
    void test3() {
        Trader trader1 = new Trader("PokemoN", "London");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = true;

        FraudDetector fraudDetector1 = new FraudDetector();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 3 - OK"); }
        else                          { System.out.println("Test 3 - FAIL"); }
    }
    void test4() {
        Trader trader1 = new Trader("POKEMON", "London");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = true;

        FraudDetector fraudDetector1 = new FraudDetector();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 4 - OK"); }
        else                          { System.out.println("Test 4 - FAIL"); }
    }
    void test5() {
        Trader trader1 = new Trader("Pokemon2", "Moscow");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = false;

        FraudDetector fraudDetector1 = new FraudDetector();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 5 - OK"); }
        else                          { System.out.println("Test 5 - FAIL"); }
    }
    /*
    public static void main(String[] args) {
        FraudDetectorTest fraudDetectorTest = new FraudDetectorTest();
        // Testing Rule 1
        fraudDetectorTest.test1();
        fraudDetectorTest.test2();
        fraudDetectorTest.test3();
        fraudDetectorTest.test4();
        fraudDetectorTest.test5();

        //Testing Rule 2
    }
    void test1() {
        Trader trader1 = new Trader("Aleks", "Chita");
        Transaction transaction1 = new Transaction(trader1, 1000);
        boolean expectedResult = false;

        FraudDetector fraudDetector1 = new FraudDetector();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 1 - OK"); }
        else                          { System.out.println("Test 1 - FAIL"); }
    }
    void test2() {
        Trader trader1 = new Trader("Pokemon", "Moscow");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = true;

        FraudDetector fraudDetector1 = new FraudDetector();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 2 - OK"); }
        else                          { System.out.println("Test 2 - FAIL"); }
    }
    void test3() {
        Trader trader1 = new Trader("PokemoN", "London");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = true;

        FraudDetector fraudDetector1 = new FraudDetector();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 3 - OK"); }
        else                          { System.out.println("Test 3 - FAIL"); }
    }
    void test4() {
        Trader trader1 = new Trader("POKEMON", "London");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = true;

        FraudDetector fraudDetector1 = new FraudDetector();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 4 - OK"); }
        else                          { System.out.println("Test 4 - FAIL"); }
    }
    void test5() {
        Trader trader1 = new Trader("Pokemon2", "Moscow");
        Transaction transaction1 = new Transaction(trader1, 2000);
        boolean expectedResult = false;

        FraudDetector fraudDetector1 = new FraudDetector();
        boolean result = fraudDetector1.isFraud(transaction1);

        if (expectedResult == result) { System.out.println("Test 5 - OK"); }
        else                          { System.out.println("Test 5 - FAIL"); }
    }
     */
}
