package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_7_senior;

class CompoundInterestCalculatorTest {
    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.testGeneral();
        test.testSumZero();
        test.testInterestZero();
        test.testYearZero();
    }

    private void testForm (double realResult, double expectedResult, String testName) {
        CompoundInterestCalculatorTest calculator = new CompoundInterestCalculatorTest();
        if (Math.abs(realResult - expectedResult) < 0.001) {
            System.out.println(testName + " is OK");
        } else {
            System.out.println(testName + " is FAIL");
        }
    }

    // 798.0 21% 30 -> 242976.348
    public void testGeneral () {
    CompoundInterestCalculator test = new CompoundInterestCalculator();
    double realResult = new CompoundInterestCalculator().compoundInterest(
            798.0, 21.0, 30.0);
    testForm(realResult, 242976.348, "Test General");
    }

    // 0.0 21% 30 -> 0
    public void testSumZero () {
        CompoundInterestCalculator test = new CompoundInterestCalculator();
        double realResult = new CompoundInterestCalculator().compoundInterest(
                0.0, 21.0, 30.0);
        testForm(realResult, 0.0, "Test Sum Zero");
    }

    // 798.0 0% 30 -> 798
    public void testInterestZero () {
        CompoundInterestCalculator test = new CompoundInterestCalculator();
        double realResult = new CompoundInterestCalculator().compoundInterest(
                798.0, 0.0, 30.0);
        testForm(realResult, 798.0, "Test Interest Zero");
    }

    // 798.0 21% 0 -> 798
    public void testYearZero () {
        CompoundInterestCalculator test = new CompoundInterestCalculator();
        double realResult = new CompoundInterestCalculator().compoundInterest(
                798.0, 21.0, 0.0);
        testForm(realResult, 798.0, "Test Year Zero");
    }

}
