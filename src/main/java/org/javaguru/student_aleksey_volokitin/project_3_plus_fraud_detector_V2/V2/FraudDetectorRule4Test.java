package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

class FraudDetectorRule4Test {

    // Tests for Rule 4
    //test 1 - страна совпадает со страной из списка, сумма больше максимальной
    void rule4Test1() {
        Trader trader = new Trader("Jam", "Jakarta", "Jamaica");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = true;

        FraudRule4 fraudRule4 = new FraudRule4();
        fraudRule4.addRule4Data("Jamaica", 100);
        fraudRule4.addRule4Data("USA", 100000);
        fraudRule4.addRule4Data("UK", 100000);
        boolean result = fraudRule4.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 4 test 1 - OK"); }
        else                          { System.out.println("Rule 4 test 1 - FAIL"); }
    }

    //test 2 - страна совпадает со страной из списка, но в другом регистре,
    // сумма больше максимальной
    void rule4Test2() {
        Trader trader = new Trader("Jam", "Jakarta", "uk");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = true;

        FraudRule4 fraudRule4 = new FraudRule4();
        fraudRule4.addRule4Data("Jamaica", 100);
        fraudRule4.addRule4Data("USA", 100000);
        fraudRule4.addRule4Data("UK", 1000);
        boolean result = fraudRule4.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 4 test 2 - OK"); }
        else                          { System.out.println("Rule 4 test 2 - FAIL"); }
    }

    //test 3 - страна совпадает со страной из списка, но имеет доп.символы
    void rule4Test3() {
        Trader trader = new Trader("Jam", "Jakarta", "USA2");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = false;

        FraudRule4 fraudRule4 = new FraudRule4();
        fraudRule4.addRule4Data("Jamaica", 100);
        fraudRule4.addRule4Data("USA", 100000);
        fraudRule4.addRule4Data("UK", 1000);
        boolean result = fraudRule4.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 4 test 3 - OK"); }
        else                          { System.out.println("Rule 4 test 3 - FAIL"); }
    }

    //test 4 - страна не совпадает со страной из списка
    void rule4Test4() {
        Trader trader = new Trader("Jam", "Jakarta", "Russia");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = false;

        FraudRule4 fraudRule4 = new FraudRule4();
        fraudRule4.addRule4Data("Jamaica", 100);
        fraudRule4.addRule4Data("USA", 100000);
        fraudRule4.addRule4Data("UK", 1000);
        boolean result = fraudRule4.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 4 test 4 - OK"); }
        else                          { System.out.println("Rule 4 test 4 - FAIL"); }
    }

    //test 4 - страна совпадает со страной из списка, но сумма меньше максимальной
    void rule4Test5() {
        Trader trader = new Trader("Jam", "Jakarta", "USA");
        Transaction transaction = new Transaction(trader, 100);
        boolean expectedResult = false;

        FraudRule4 fraudRule4 = new FraudRule4();
        fraudRule4.addRule4Data("Jamaica", 100);
        fraudRule4.addRule4Data("USA", 100000);
        fraudRule4.addRule4Data("UK", 1000);
        boolean result = fraudRule4.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 4 test 4 - OK"); }
        else                          { System.out.println("Rule 4 test 4 - FAIL"); }
    }
}
