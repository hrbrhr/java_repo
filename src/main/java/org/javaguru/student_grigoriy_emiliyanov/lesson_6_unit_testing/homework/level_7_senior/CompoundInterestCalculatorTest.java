package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.homework.level_7_senior;

public class CompoundInterestCalculatorTest {
    public static void main(String[] args) {
        CompoundInterestCalculatorTest suite = new CompoundInterestCalculatorTest();
        suite.test1();
        suite.test2();
        suite.test3();
//        - что будет если sum = 0;
//        - что будет если interest = 0;
//        - что будет если years = 0;
    }

    private void test1() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        double sum = 0;
        double interest = 0.1;
        double years = 1234;
        double expected = 0;
        checkExpect(expected, calculator.compoundInterest(sum, interest, years),
                "sum: " + sum + ", " +
                        "interest: " + interest + ", " +
                        "years: " + years + " " +
                        "should give compound interest of " + expected);
    }

    private void test2() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        double sum = 1000;
        double interest = 0.0;
        double years = 1234;
        double expected = 1000;
        checkExpect(expected, calculator.compoundInterest(sum, interest, years),
                "sum: " + sum + ", " +
                        "interest: " + interest + ", " +
                        "years: " + years + " " +
                        "should give compound interest of " + expected);
    }

    private void test3() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        double sum = 1000;
        double interest = 0.1;
        double years = 0;
        double expected = 1000;
        checkExpect(expected, calculator.compoundInterest(sum, interest, years),
                "sum: " + sum + ", " +
                        "interest: " + interest + ", " +
                        "years: " + years + " " +
                        "should give compound interest of " + expected);
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
