package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

public class FraudDetectorRule3Test {
    // Tests for Rule 3
    // test 1 - город совпадает с городом из списка, сумма транзакции больше максимальной
    void rule3Test1() {
        Trader trader = new Trader("John", "Sidney", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = true;

        FraudRule3 fraudRule3 = new FraudRule3();
        fraudRule3.addRule3Data("Sidney", 0);
        fraudRule3.addRule3Data("London", 1000);
        fraudRule3.addRule3Data("California", 100000);
        boolean result = fraudRule3.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 3 test 1 - OK"); }
        else                          { System.out.println("Rule 3 test 1 - FAIL"); }

    }
    // test 2 - город совпадает с городом из списка, но в другом регистре,
    // сумма больше максимальной
    void rule3Test2() {
        Trader trader = new Trader("John", "CAliFornia", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = true;

        FraudRule3 fraudRule3 = new FraudRule3();
        fraudRule3.addRule3Data("Sidney", 0);
        fraudRule3.addRule3Data("London", 1000);
        fraudRule3.addRule3Data("California", 1000);
        boolean result = fraudRule3.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 3 test 2 - OK"); }
        else                          { System.out.println("Rule 3 test 2 - FAIL"); }
    }

    // test 3 - горд совпадает с городом из списка, но имеет доп. символы
    void rule3Test3() {
        Trader trader = new Trader("John", "London2", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = false;

        FraudRule3 fraudRule3 = new FraudRule3();
        fraudRule3.addRule3Data("Sidney", 0);
        fraudRule3.addRule3Data("London", 1000);
        fraudRule3.addRule3Data("California", 100000);
        boolean result = fraudRule3.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 3 test 3 - OK"); }
        else                          { System.out.println("Rule 3 test 3 - FAIL"); }
    }

    // test 4 - город не совпадает с городом из списка
    void rule3Test4() {
        Trader trader = new Trader("John", "New York", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = false;

        FraudRule3 fraudRule3 = new FraudRule3();
        fraudRule3.addRule3Data("Sidney", 0);
        fraudRule3.addRule3Data("London", 1000);
        fraudRule3.addRule3Data("California", 100000);
        boolean result = fraudRule3.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 3 test 4 - OK"); }
        else                          { System.out.println("Rule 3 test 4 - FAIL"); }
    }

    // test 4 - город совпадает с городом из списка, но сумма меньше максимальной
    void rule3Test5() {
        Trader trader = new Trader("John", "California", "Australia");
        Transaction transaction = new Transaction(trader, 10000);
        boolean expectedResult = false;

        FraudRule3 fraudRule3 = new FraudRule3();
        fraudRule3.addRule3Data("Sidney", 0);
        fraudRule3.addRule3Data("London", 1000);
        fraudRule3.addRule3Data("California", 100000);
        boolean result = fraudRule3.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 3 test 4 - OK"); }
        else                          { System.out.println("Rule 3 test 4 - FAIL"); }
    }


}
