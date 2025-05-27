package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

class FraudDetectorRule5Test {
    // Tests for Rule 5
    // test 1 - имя трейдера и страна не содержатся в списке
    void rule5Test1() {
        Trader trader = new Trader("Yori", "Tokyo", "China");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = false;

        FraudRule5 fraudRule5 = new FraudRule5();
        fraudRule5.addRule5Data("LOL-", "Japan");
        fraudRule5.addRule5Data("INT-", "France");
        fraudRule5.addRule5Data("COS-", "UK");
        boolean result = fraudRule5.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 5 test 1 - OK"); }
        else                          { System.out.println("Rule 5 test 1 - FAIL"); }
    }

    // test 2 - имя трейдера не содержатся в списке, страна содержится
    void rule5Test2() {
        Trader trader = new Trader("Yori", "Tokyo", "France");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = false;

        FraudRule5 fraudRule5 = new FraudRule5();
        fraudRule5.addRule5Data("LOL-", "Japan");
        fraudRule5.addRule5Data("INT-", "France");
        fraudRule5.addRule5Data("COS-", "UK");
        boolean result = fraudRule5.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 5 test 2 - OK"); }
        else                          { System.out.println("Rule 5 test 2 - FAIL"); }
    }

    // test 3 - имя трейдера меньше 4 символов
    void rule5Test3() {
        Trader trader = new Trader("Yo", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = false;

        FraudRule5 fraudRule5 = new FraudRule5();
        fraudRule5.addRule5Data("LOL-", "Japan");
        fraudRule5.addRule5Data("INT-", "France");
        fraudRule5.addRule5Data("COS-", "UK");
        boolean result = fraudRule5.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 5 test 3 - OK"); }
        else                          { System.out.println("Rule 5 test 3 - FAIL"); }
    }

    // test 4 - имя трейдера содержится в списке, страна не совпадает
    void rule5Test4() {
        Trader trader = new Trader("LOL-", "Tokyo", "Jap");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = false;

        FraudRule5 fraudRule5 = new FraudRule5();
        fraudRule5.addRule5Data("LOL-", "Japan");
        fraudRule5.addRule5Data("INT-", "France");
        fraudRule5.addRule5Data("COS-", "UK");
        boolean result = fraudRule5.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 5 test 4 - OK"); }
        else                          { System.out.println("Rule 5 test 4 - FAIL"); }
    }

    // test 5 - имя трейдера содержится в списке, но в другом регистре, страна совпадает
    void rule5Test5() {
        Trader trader = new Trader("int-", "Tokyo", "france");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = true;

        FraudRule5 fraudRule5 = new FraudRule5();
        fraudRule5.addRule5Data("LOL-", "Japan");
        fraudRule5.addRule5Data("INT-", "France");
        fraudRule5.addRule5Data("COS-", "UK");
        boolean result = fraudRule5.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 5 test 5 - OK"); }
        else                          { System.out.println("Rule 5 test 5 - FAIL"); }
    }

    // test 6 - имя трейдера и страна содержатся в списке
    void rule5Test6() {
        Trader trader = new Trader("COS-Yori", "Tokyo", "UK");
        Transaction transaction = new Transaction(trader, 1001);
        boolean expectedResult = true;

        FraudRule5 fraudRule5 = new FraudRule5();
        fraudRule5.addRule5Data("LOL-", "Japan");
        fraudRule5.addRule5Data("INT-", "France");
        fraudRule5.addRule5Data("COS-", "UK");
        boolean result = fraudRule5.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 5 test 6 - OK"); }
        else                          { System.out.println("Rule 5 test 6 - FAIL"); }
    }
}
