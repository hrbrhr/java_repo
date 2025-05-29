package org.javaguru.mentor.lesson_6_unit_testing.lessoncode.tasks;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.test1();
        test.test2();
    }

    // 2 -> true
    public void test1() {
        int number = 2;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        if (realResult == true) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    // 3 -> false
    public void test2() {
        int number = 3;

        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);

        if (realResult == false) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }



}
