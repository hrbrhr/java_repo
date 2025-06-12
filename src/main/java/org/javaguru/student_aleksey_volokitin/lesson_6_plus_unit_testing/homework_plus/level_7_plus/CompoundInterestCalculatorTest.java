package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.homework_plus.level_7_plus;

class CompoundInterestCalculatorTest {
    public static void main(String[] args) {
        CompoundInterestCalculatorTest calculator = new CompoundInterestCalculatorTest();
        calculator.test1HappyPath();
        calculator.test2StartSumZero();
        calculator.test3InterestZero();
        calculator.test4YearZero();
    }

    void test1HappyPath () {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double startSum = 100000.0;
        double interest = 16;
        int amountYears = 5;
        double expectedResult = 210034.16575999992;
        String testTitle = "Test 1: happy path";
        double realResult = compoundInterestCalculator.compoundInterest(startSum,
                                                                        interest,
                                                                        amountYears);
        checkResult(expectedResult, realResult, testTitle);
    }

    void test2StartSumZero () {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double startSum = 0.0;
        double interest = 16;
        int amountYears = 5;
        double expectedResult = 0.0;
        String testTitle = "Test 2: start sum equals zero";
        double realResult = compoundInterestCalculator.compoundInterest(startSum,
                                                                        interest,
                                                                        amountYears);
        checkResult(expectedResult, realResult, testTitle);
    }

    void test3InterestZero () {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double startSum = 100000.0;
        double interest = 0;
        int amountYears = 5;
        double expectedResult = 100000.0;
        String testTitle = "Test 3: interest equals zero";
        double realResult = compoundInterestCalculator.compoundInterest(startSum,
                                                                        interest,
                                                                        amountYears);
        checkResult(expectedResult, realResult, testTitle);
    }

    void test4YearZero () {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double startSum = 100000.0;
        double interest = 16;
        int amountYears = 0;
        double expectedResult = 100000.0;
        String testTitle = "Test 4: year equals zero";
        double realResult = compoundInterestCalculator.compoundInterest(startSum,
                                                                        interest,
                                                                        amountYears);
        checkResult(expectedResult, realResult, testTitle);
    }

    void checkResult(double expectedResult, double realResult, String testTitle) {
        final double THRESHOLD = 0.000001;
        if (Math.abs(expectedResult - realResult) < THRESHOLD) {
            System.out.println(testTitle + " - OK");
        }
        else {
            System.out.println(testTitle + " - FAIL");
        }
    }
}
