package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_6_middle;

class SalaryTaxCalculatorTest {
    public static void main(String[] args) {
     SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
     test.testNoProfit();
     test.testLess10k();
     test.test10k();
     test.testFrom10kTo50k();
     test.test50k();
     test.testFrom50k();
    }

    // -1000 -> 0
    public void testNoProfit () {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = new SalaryTaxCalculator().calculate(-1000.0);
        if (Math.abs(realResult - 0.0) < 0.0001) {
            System.out.println("Test No Profit = OK");
        } else {
            System.out.println("Test No Profit = FAIL");
        }
    }

    // 1000 -> 300
    public void testLess10k () {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = new SalaryTaxCalculator().calculate(1000.0);
        if (Math.abs(realResult - 300.0) < 0.0001) {
            System.out.println("Test Less 10k = OK");
        } else {
            System.out.println("Test Less 10k = FAIL");
        }
    }

    // 10000 -> 3000
    public void test10k () {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = new SalaryTaxCalculator().calculate(10000.0);
        if (Math.abs(realResult - 3000.0) < 0.0001) {
            System.out.println("Test 10k = OK");
        } else {
            System.out.println("Test 10k = FAIL");
        }
    }

    // 45000 -> 17000
    public void testFrom10kTo50k () {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = new SalaryTaxCalculator().calculate(45000.0);
        if (Math.abs(realResult - 17000.0) < 0.0001) {
            System.out.println("Test From 10k To 50k = OK");
        } else {
            System.out.println("Test From 10k To 50k = FAIL");
        }
    }

    // 50000 -> 19000
    public void test50k () {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = new SalaryTaxCalculator().calculate(50000.0);
        if (Math.abs(realResult - 19000.0) < 0.0001) {
            System.out.println("Test 50k = OK");
        } else {
            System.out.println("Test 50k = FAIL");
        }
    }

    // 55001,5 -> 21500.75
    public void testFrom50k () {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = new SalaryTaxCalculator().calculate(55001.50);
        if (Math.abs(realResult -  21500.75) < 0.0001) {
            System.out.println("Test From 50k = OK");
        } else {
            System.out.println("Test From 50k = FAIL");
        }
    }

}
