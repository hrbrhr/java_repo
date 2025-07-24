package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.homework.level_4_middle;

class SalaryAnalyzerTest {
    public static void main(String[] args) {
        SalaryAnalyzerTest suite = new SalaryAnalyzerTest();

        suite.testAverageZero();
        suite.testAverage();
        suite.testSumZero();
        suite.testSum();
        suite.testMin();
        suite.testMax();
    }

    private void testMin() {
        SalaryAnalyzer salaryAnalyzer = new SalaryAnalyzer();
        Double[] salaries = new Double[] {1000.0, 1500.0, 2000.0};
        double expected = 1000.0;
        checkExpect(expected, salaryAnalyzer.getMin(salaries), "should check min");
    }

    private void testMax() {
        SalaryAnalyzer salaryAnalyzer = new SalaryAnalyzer();
        Double[] salaries = new Double[] {1000.0, 1500.0, 2000.0};
        double expected = 2000.0;
        checkExpect(expected, salaryAnalyzer.getMax(salaries), "should check max");
    }

    private void testAverageZero() {
        SalaryAnalyzer salaryAnalyzer = new SalaryAnalyzer();
        Double[] salaries = new Double[] {};
        double expected = 0.0;
        checkExpect(expected, salaryAnalyzer.getAverage(salaries), "should check average 0");
    }

    private void testAverage() {
        SalaryAnalyzer salaryAnalyzer = new SalaryAnalyzer();
        Double[] salaries = new Double[] {1000.0, 1500.0, 2000.0};
        double expected = 1500.0;
        checkExpect(expected, salaryAnalyzer.getAverage(salaries), "should check average");
    }

    private void testSumZero() {
        SalaryAnalyzer salaryAnalyzer = new SalaryAnalyzer();
        Double[] salaries = new Double[] {};
        double expected = 0.0;
        checkExpect(expected, salaryAnalyzer.getTotal(salaries), "should check sum 0");
    }

    private void testSum() {
        SalaryAnalyzer salaryAnalyzer = new SalaryAnalyzer();
        Double[] salaries = new Double[] {1000.0, 1500.0, 2000.0};
        double expected = 4500.0;
        checkExpect(expected, salaryAnalyzer.getTotal(salaries), "should check sum");
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
