package org.javaguru.student_alexey_yakovlev.lesson_6.lessoncode;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.test1();
        calculatorTest.test2();
        calculatorTest.test3();
        calculatorTest.test4();
        calculatorTest.test5();
        calculatorTest.test6();
        calculatorTest.test7();
        calculatorTest.test8();
        calculatorTest.test9();
        calculatorTest.test10();

    }

    public void test1() {
        Calculator calculator = new Calculator();

        int num = 2;
        boolean realResult = calculator.isEven(num);

        if (realResult == true) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        Calculator calculator = new Calculator();

        int num = 3;
        boolean realResult = calculator.isEven(num);

        if (realResult == false) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        Calculator calculator = new Calculator();

        int num = 3;
        boolean realResult = calculator.isOdd(num);

        if (realResult == true) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    public void test4() {
        Calculator calculator = new Calculator();

        int num = 2;
        boolean realResult = calculator.isOdd(num);

        if (realResult == false) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }

    // findAverage(number1, number2)
    // 2, 4 -> 3.0
    public void test5() {
        Calculator calculator = new Calculator();

        int num1 = 2;
        int num2 = 4;
        double realResult = calculator.findAverage(num1, num2);

        if (Math.abs(realResult - 3.0) < 0.00001) {
            System.out.println("TEST 5 = OK");
        } else {
            System.out.println("TEST 5 = FAIL");
        }
    }


    // 10, 1 -> 5.5
    public void test6() {
        Calculator calculator = new Calculator();

        int num1 = 10;
        int num2 = 1;
        double realResult = calculator.findAverage(num1, num2);

        if (Math.abs(realResult - 5.5) < 0.00001) {
            System.out.println("TEST 6 = OK");
        } else {
            System.out.println("TEST 6 = FAIL");
        }
    }


    // 1, 1 -> 1.0
    public void test7() {
        Calculator calculator = new Calculator();

        int num1 = 1;
        int num2 = 1;
        double realResult = calculator.findAverage(num1, num2);

        if (Math.abs(realResult - 1.0) < 0.00001) {
            System.out.println("TEST 7 = OK");
        } else {
            System.out.println("TEST 7 = FAIL");
        }
    }

    // findMax(number1, number2)
    // 1, 2 -> 2
    public void test8() {
        Calculator calculator = new Calculator();

        int num1 = 1;
        int num2 = 2;
        int realResult = calculator.findMax(num1, num2);

        if (realResult == 2) {
            System.out.println("TEST 8 = OK");
        } else {
            System.out.println("TEST 8 = FAIL");
        }
    }

    // 7, 4 -> 7
    public void test9() {
        Calculator calculator = new Calculator();

        int num1 = 7;
        int num2 = 4;
        int realResult = calculator.findMax(num1, num2);

        if (realResult == 7)  {
            System.out.println("TEST 8 = OK");
        } else {
            System.out.println("TEST 8 = FAIL");
        }
    }

    // 3, 3 -> 3
    public void test10() {
        Calculator calculator = new Calculator();

        int num1 = 3;
        int num2 = 3;
        int realResult = calculator.findMax(num1, num2);

        if (realResult == 3)  {
            System.out.println("TEST 10 = OK");
        } else {
            System.out.println("TEST 10 = FAIL");
        }
    }

}
