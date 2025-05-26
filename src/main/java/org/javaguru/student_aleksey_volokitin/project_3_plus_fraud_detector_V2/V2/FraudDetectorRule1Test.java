package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

class FraudDetectorRule1Test {
    // Tests for Rule 1
    // test 1 - имя трейдера не совпадает с именами в списке
    void rule1Test1() {
        Trader trader = new Trader("Ivan", "Chita", "Russia");
        Transaction transaction = new Transaction(trader, 500);
        boolean expectedResult = false;

        // задаем имена трейдеров и максимальные суммы транзакций, которые считаются мошенническими
        FraudRule1 fraudRule1 = new FraudRule1();
        fraudRule1.addRule1Data("Pokemon", 0);
        fraudRule1.addRule1Data("Aleks", 1000);
        fraudRule1.addRule1Data("Dmitriy", 100000);

        boolean result = fraudRule1.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 1 - OK"); }
        else                          { System.out.println("Rule 1 test 1 - FAIL"); }
    }

    // test 2 - имя трейдера есть в списке, но сумма меньше максимальной
    void rule1Test2() {
        Trader trader = new Trader("Dmitriy", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 2000);
        boolean expectedResult = false;

        // задаем имена трейдеров и максимальные суммы транзакций, которые считаются мошенническими
        FraudRule1 fraudRule1 = new FraudRule1();
        fraudRule1.addRule1Data("Pokemon", 0);
        fraudRule1.addRule1Data("Aleks", 1000);
        fraudRule1.addRule1Data("Dmitriy", 100000);
        boolean result = fraudRule1.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 2 - OK"); }
        else                          { System.out.println("Rule 1 test 2 - FAIL"); }
    }

    // test 3 - имя трейдера есть в списке и сумма больше максимальной
    void rule1Test3() {
        Trader trader = new Trader("Pokemon", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 2000);
        boolean expectedResult = true;

        // задаем имена трейдеров и максимальные суммы транзакций, которые считаются мошенническими
        FraudRule1 fraudRule1 = new FraudRule1();
        fraudRule1.addRule1Data("Pokemon", 0);
        fraudRule1.addRule1Data("Aleks", 1000);
        fraudRule1.addRule1Data("Dmitriy", 100000);
        boolean result = fraudRule1.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 3 - OK"); }
        else                          { System.out.println("Rule 1 test 3 - FAIL"); }
    }

    // test 4 - имя трейдера совпадает с именем в списке, но имеет символы в другом регистре
    void rule1Test4() {
        Trader trader = new Trader("PokemoN", "London", "UK");
        Transaction transaction = new Transaction(trader, 2000);
        boolean expectedResult = true;

        // задаем имена трейдеров и максимальные суммы транзакций, которые считаются мошенническими
        FraudRule1 fraudRule1 = new FraudRule1();
        fraudRule1.addRule1Data("Pokemon", 0);
        fraudRule1.addRule1Data("Aleks", 1000);
        fraudRule1.addRule1Data("Dmitriy", 100000);
        boolean result = fraudRule1.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 4 - OK"); }
        else                          { System.out.println("Rule 1 test 4 - FAIL"); }
    }

    // имя трейдера совпадает с именем в списке, но имеет доп.символы
    void rule1Test5() {
        Trader trader = new Trader("Pokemon2", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 2000);
        boolean expectedResult = false;

        // задаем имена трейдеров и максимальные суммы транзакций, которые считаются мошенническими
        FraudRule1 fraudRule1 = new FraudRule1();
        fraudRule1.addRule1Data("Pokemon", 0);
        fraudRule1.addRule1Data("Aleks", 1000);
        fraudRule1.addRule1Data("Dmitriy", 100000);
        boolean result = fraudRule1.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 5 - OK"); }
        else                          { System.out.println("Rule 1 test 5 - FAIL"); }
    }

    // test 6 - имя трейдера есть в списке и сумма больше максимальной, для не первого элемента списка
    void rule1Test6() {
        Trader trader = new Trader("Aleks", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 2000);
        boolean expectedResult = true;

        // задаем имена трейдеров и максимальные суммы транзакций, которые считаются мошенническими
        FraudRule1 fraudRule1 = new FraudRule1();
        fraudRule1.addRule1Data("Pokemon", 0);
        fraudRule1.addRule1Data("Aleks", 1000);
        fraudRule1.addRule1Data("Dmitriy", 100000);
        boolean result = fraudRule1.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 6 - OK"); }
        else                          { System.out.println("Rule 1 test 6 - FAIL"); }
    }

    // test 7 - имя трейдера есть в списке и сумма больше максимальной, для последнего элемента списка
    void rule1Test7() {
        Trader trader = new Trader("Dmitriy", "Moscow", "Russia");
        Transaction transaction = new Transaction(trader, 200000);
        boolean expectedResult = true;

        // задаем имена трейдеров и максимальные суммы транзакций, которые считаются мошенническими
        FraudRule1 fraudRule1 = new FraudRule1();
        fraudRule1.addRule1Data("Pokemon", 0);
        fraudRule1.addRule1Data("Aleks", 1000);
        fraudRule1.addRule1Data("Dmitriy", 100000);
        boolean result = fraudRule1.isFraud(transaction);

        if (expectedResult == result) { System.out.println("Rule 1 test 7 - OK"); }
        else                          { System.out.println("Rule 1 test 7 - FAIL"); }
    }

}
