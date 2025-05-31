package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_7_senior.task_1;

class CompoundInterestCalculatorTest {

    public static void main(String[] args) {
        CompoundInterestCalculatorTest compoundInterestCalculatorTest = new CompoundInterestCalculatorTest();
        compoundInterestCalculatorTest.test1();
        compoundInterestCalculatorTest.test2();
        compoundInterestCalculatorTest.test3();
        compoundInterestCalculatorTest.test4();
    }

    public void test1() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(10_000, 0.08, 5);

        if (Math.abs(realResult - 10040.064) < 0.0001 ) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(0, 0.08, 5);

        if (realResult == 0 ) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(10_000, 0, 5);

        if (Math.abs(realResult - 10000) < 0.0001 ) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    public void test4() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double realResult = compoundInterestCalculator.compoundInterest(10_000, 0.08, 0);

        if (Math.abs(realResult - 10000) < 0.0001 ) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }
}
