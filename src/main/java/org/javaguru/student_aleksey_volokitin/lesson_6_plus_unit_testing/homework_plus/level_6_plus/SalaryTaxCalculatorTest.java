package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.homework_plus.level_6_plus;

class SalaryTaxCalculatorTest {
    public static void main(String[] args) {
        SalaryTaxCalculatorTest salaryTaxCalculatorTest = new SalaryTaxCalculatorTest();
        salaryTaxCalculatorTest.test1Salary9999P55();
        salaryTaxCalculatorTest.test2Salary10000();
        salaryTaxCalculatorTest.test3Salary10001();
        salaryTaxCalculatorTest.test4Salary15678();
        salaryTaxCalculatorTest.test5Salary49999P55();
        salaryTaxCalculatorTest.test6Salary50000();
        salaryTaxCalculatorTest.test7Salary50000P33();
        salaryTaxCalculatorTest.test8Salary66666P45();
    }

    void test1Salary9999P55() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 9999.55;
        double expectedResult = 2999.865;
        double realResult = salaryTaxCalculator.calculate(salary);
        String testTitle = "Test 1: salary - " + salary + ", tax - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test2Salary10000() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 10000;
        double expectedResult = 3000;
        double realResult = salaryTaxCalculator.calculate(salary);
        String testTitle = "Test 2: salary - " + salary + ", tax - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test3Salary10001() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 10001;
        double expectedResult = 3000.40;
        double realResult = salaryTaxCalculator.calculate(salary);
        String testTitle = "Test 3: salary - " + salary + ", tax - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test4Salary15678() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 15678;
        double expectedResult = 5271.20;
        double realResult = salaryTaxCalculator.calculate(salary);
        String testTitle = "Test 4: salary - " + salary + ", tax - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test5Salary49999P55() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 49999.55;
        double expectedResult = 18999.82;
        double realResult = salaryTaxCalculator.calculate(salary);
        String testTitle = "Test 5: salary - " + salary + ", tax - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test6Salary50000() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 50000;
        double expectedResult = 19000;
        double realResult = salaryTaxCalculator.calculate(salary);
        String testTitle = "Test 6: salary - " + salary + ", tax - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }

    void test7Salary50000P33() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 50000.33;
        double expectedResult = 19000.165;
        double realResult = salaryTaxCalculator.calculate(salary);
        String testTitle = "Test 7: salary - " + salary + ", tax - " + expectedResult;
        checkResult(expectedResult, realResult, testTitle);
    }
    void test8Salary66666P45() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double salary = 66666.45;
        double expectedResult = 27333.225;
        double realResult = salaryTaxCalculator.calculate(salary);
        String testTitle = "Test 8: salary - " + salary + ", tax - " + expectedResult;
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
