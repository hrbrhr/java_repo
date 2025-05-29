package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.homework_plus.level_7_plus;

class ComplicatedPercentCalculatorTest {
    public static void main(String[] args) {
        ComplicatedPercentCalculatorTest calculator = new ComplicatedPercentCalculatorTest();
        calculator.test1HappyPath();
        calculator.test2StartSumZero();
        calculator.test3InterestZero();
        calculator.test4PeriodsInYearZero();
        calculator.test5YearZero();
    }

    void test1HappyPath () {
        ComplicatedPercentCalculator complicatedPercentCalculator = new ComplicatedPercentCalculator();
        double startSum = 100000.0;
        double interest = 16;
        int amountPeriodsInYear = 12;
        int amountYears = 5;
        double expectedResult = 221380.688278;
        String testTitle = "Test 1: happy path";
        double realResult = complicatedPercentCalculator.calculate(startSum,
                                                                   interest,
                                                                   amountPeriodsInYear,
                                                                   amountYears);
        checkResult(expectedResult, realResult, testTitle);
    }

    void test2StartSumZero () {
        ComplicatedPercentCalculator complicatedPercentCalculator = new ComplicatedPercentCalculator();
        double startSum = 0.0;
        double interest = 16;
        int amountPeriodsInYear = 12;
        int amountYears = 5;
        double expectedResult = 0.0;
        String testTitle = "Test 2: start sum equals zero";
        double realResult = complicatedPercentCalculator.calculate(startSum,
                                                                   interest,
                                                                   amountPeriodsInYear,
                                                                   amountYears);
        checkResult(expectedResult, realResult, testTitle);
    }

    void test3InterestZero () {
        ComplicatedPercentCalculator complicatedPercentCalculator = new ComplicatedPercentCalculator();
        double startSum = 100000.0;
        double interest = 0;
        int amountPeriodsInYear = 12;
        int amountYears = 5;
        double expectedResult = 100000.0;
        String testTitle = "Test 3: interest equals zero";
        double realResult = complicatedPercentCalculator.calculate(startSum,
                                                                   interest,
                                                                   amountPeriodsInYear,
                                                                   amountYears);
        checkResult(expectedResult, realResult, testTitle);
    }

    void test4PeriodsInYearZero () {
        ComplicatedPercentCalculator complicatedPercentCalculator = new ComplicatedPercentCalculator();
        double startSum = 100000.0;
        double interest = 16;
        int amountPeriodsInYear = 0;
        int amountYears = 5;
        double expectedResult = 100000.0;
        String testTitle = "Test 4: periods in year equals zero";
        double realResult = complicatedPercentCalculator.calculate(startSum,
                                                                   interest,
                                                                   amountPeriodsInYear,
                                                                   amountYears);
        checkResult(expectedResult, realResult, testTitle);
    }

    void test5YearZero () {
        ComplicatedPercentCalculator complicatedPercentCalculator = new ComplicatedPercentCalculator();
        double startSum = 100000.0;
        double interest = 16;
        int amountPeriodsInYear = 12;
        int amountYears = 0;
        double expectedResult = 100000.0;
        String testTitle = "Test 5: year equals zero";
        double realResult = complicatedPercentCalculator.calculate(startSum,
                interest,
                amountPeriodsInYear,
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
