package org.javaguru.student_elena_tiutiunnikova.lesson_6.lessoncode;

class CalculatorTest {
    public static void main(String[] args) {
    CalculatorTest test = new CalculatorTest();
    test.test1();
    test.test2();
    test.test3();
    test.test4();
    test.test5();
    test.test6();
    test.test7();
    test.test8();
    test.test9();
    test.test10();
    }

    //2 -> true
    public void test1 () {
        int number = 2;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        if (realResult == true) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    //3 -> false
    public void test2 () {
        int number = 3;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        if (realResult == true) {
            System.out.println("TEST 2 = FAIL");
        } else {
            System.out.println("TEST 2 = OK");
        }
    }

    //7 -> true
    public void test3 () {
        int number = 7;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isOdd(number);

        if (realResult == true) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    //8 -> false
    public void test4 () {
        int number = 8;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isOdd(number);

        if (realResult == true) {
            System.out.println("TEST 4 = FAIL");
        } else {
            System.out.println("TEST 4 = OK");
        }
    }

    // findAverage

    // 2 , 4 -> 3.0
    public void test5 () {
        int number1 = 2;
        int number2 = 4;

        Calculator calculator = new Calculator();
        double realResult = calculator.findAverage(number1, number2);

        if (Math.abs(realResult - 3.0) < 0.00001) {
            System.out.println("TEST 5 = OK");
        } else {
        System.out.println("TEST 5 = FAIL");
        }
    }


    // 10 , 1 -> 5.5

    public void test6 () {
        int number1 = 10;
        int number2 = 1;

        Calculator calculator = new Calculator();
        double realResult = calculator.findAverage(number1, number2);

        if (Math.abs(realResult - 5.5) < 0.00001) {
            System.out.println("TEST 6 = OK");
        } else {
            System.out.println("TEST 6 = FAIL");
        }
    }


    // 1 , 1 -> 1.0
    public void test7 () {
        int number1 = 1;
        int number2 = 1;

        Calculator calculator = new Calculator();
        double realResult = calculator.findAverage(number1, number2);

        if (Math.abs(realResult - 1.0) < 0.00001) {
            System.out.println("TEST 7 = OK");
        } else {
            System.out.println("TEST 7 = FAIL");
        }
    }


    public void testDouble () {
        double number1 = 5.5;
        double number2 = 5.50000555;

        if (Math.abs (number1 - number2) < 0.00001) {
        }
    }

    // FindMax (number1, number2)
    // 1.2 -> 2

    public void test8 () {
        int number1 = 1;
        int number2 = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.findMax(number1, number2);

        if (realResult == 2) {
            System.out.println("TEST 8 = OK");
        } else {
            System.out.println("TEST 8 = FAIL");
        }
    }

    // 7.4 -> 7
    public void test9 () {
        int number1 = 7;
        int number2 = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.findMax(number1, number2);

        if (realResult == 7) {
            System.out.println("TEST 9 = OK");
        } else {
            System.out.println("TEST 9 = FAIL");
        }
    }

    // 3.3 -> 3
    public void test10 () {
        int number1 = 3;
        int number2 = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.findMax(number1, number2);

        if (realResult == 3) {
            System.out.println("TEST 10 = OK");
        } else {
            System.out.println("TEST 10 = FAIL");
        }
    }



}
