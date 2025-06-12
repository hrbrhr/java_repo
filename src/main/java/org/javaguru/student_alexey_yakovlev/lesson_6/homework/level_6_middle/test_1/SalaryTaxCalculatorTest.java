package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_6_middle.test_1;

class SalaryTaxCalculatorTest {

    public static void main(String[] args) {
        SalaryTaxCalculatorTest salaryTaxCalculatorTest = new SalaryTaxCalculatorTest();
        salaryTaxCalculatorTest.test1SalaryLessThenZero();
        salaryTaxCalculatorTest.test2SalaryLessThen10K();
        salaryTaxCalculatorTest.test3SalaryEquals10K();
        salaryTaxCalculatorTest.test4SalaryMoreThan10KAndLessThen50K();
        salaryTaxCalculatorTest.test5SalaryEquals50K();
        salaryTaxCalculatorTest.test6SalaryMoreThen50K();
    }

    public void test1SalaryLessThenZero() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(- 1);

        if ((Math.abs(realResult) - 1 ) < 0.00001) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = OK");
        }
    }

    public void test2SalaryLessThen10K() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(5_000);

        if (Math.abs(realResult - 1500) < 0.00001) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = OK");
        }
    }

    public void test3SalaryEquals10K() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(10_000);
//        System.out.println(realResult);
        if (Math.abs(realResult - 3000) < 0.00001) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = OK");
        }
    }

    public void test4SalaryMoreThan10KAndLessThen50K() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(25_000);

        if (Math.abs(realResult - 9000) < 0.00001) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = OK");
        }
    }

    public void test5SalaryEquals50K() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(50_000);
//        System.out.println(realResult);
        if (Math.abs(realResult - 19000) < 0.00001) {
            System.out.println("TEST 5 = OK");
        } else {
            System.out.println("TEST 5 = OK");
        }
    }

    public void test6SalaryMoreThen50K() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(70_000);

        if (Math.abs(realResult - 29000) < 0.00001) {
            System.out.println("TEST 6 = OK");
        } else {
            System.out.println("TEST 6 = OK");
        }
    }
}
