package org.javaguru.mentor.lesson_6_unit_testing.homework.solutions.level_4_junior.task_1;

class FactorialForLoopTest {

    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.factorial0();
        test.factorial1();
        test.factorial2();
        test.factorial3();
    }

    public void factorial0() {
        FactorialForLoop factorial = new FactorialForLoop();
        int realResult = factorial.factorial(0);
        checkResult(realResult, 1, "factorial0");
    }

    public void factorial1() {
        FactorialForLoop factorial = new FactorialForLoop();
        int realResult = factorial.factorial(1);
        checkResult(realResult, 1, "factorial1");
    }

    public void factorial2() {
        FactorialForLoop factorial = new FactorialForLoop();
        int realResult = factorial.factorial(2);
        checkResult(realResult, 2, "factorial2");
    }

    public void factorial3() {
        FactorialForLoop factorial = new FactorialForLoop();
        int realResult = factorial.factorial(3);
        checkResult(realResult, 6, "factorial3");
    }

    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }

}
