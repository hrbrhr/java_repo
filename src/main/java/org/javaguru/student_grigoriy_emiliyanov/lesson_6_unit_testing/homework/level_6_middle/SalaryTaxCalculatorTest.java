package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.homework.level_6_middle;

class SalaryTaxCalculatorTest {
    public static void main(String[] args) {
        SalaryTaxCalculatorTest suite = new SalaryTaxCalculatorTest();
        suite.test0();
        suite.test1();
        suite.test2();
        suite.test3();
        suite.test4();
        suite.test5();
        suite.test6();
    }

    private void test0() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        int input = 0;
        double expected = 0;
        checkExpect(expected, calculator.calculate(input), "given " + input + " should be " + expected);
    }

    private void test1() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        int input = 1000;
        double expected = 0.3 * input;
        checkExpect(expected, calculator.calculate(input), "given " + input + " should be " + expected);
    }

    private void test2() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        int input = 10000;
        double expected = 0.3 * 10000;
        checkExpect(expected, calculator.calculate(input), "given " + input + " should be " + expected);
    }

    private void test3() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        int input = 20000;
        double expected = 0.3 * 10000 + 0.4 * (input - 10000);
        checkExpect(expected, calculator.calculate(input), "given " + input + " should be " + expected);
    }

    private void test4() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        int input = 49999;
        double expected = 0.3 * 10000 + 0.4 * (input - 10000);
        checkExpect(expected, calculator.calculate(input), "given " + input + " should be " + expected);
    }

    private void test5() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        int input = 50000;
        double expected = 0.3 * 10000 + 0.4 * (input - 10000);
        checkExpect(expected, calculator.calculate(input), "given " + input + " should be " + expected);
    }

    private void test6() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        int input = 70000;
        double expected = 0.3 * 10000 + 0.4 * (50000 - 10000) + 0.5 * (input - 50000);
        checkExpect(expected, calculator.calculate(input), "given " + input + " should be " + expected);
    }

    private void checkExpect(double expected, double real, String testCaseName) {
        double epsilon = 0.001;
        if (Math.abs(expected - real) < epsilon) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }
}
