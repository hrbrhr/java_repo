package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.homework_plus.level_4_plus.task_1_plus;

class FactorialForLoopTest {
    public static void main(String[] args) {
        FactorialForLoopTest factorialTest = new FactorialForLoopTest();

        factorialTest.testFactorialOfZero();
        factorialTest.testFactorialOfOne();
        factorialTest.testFactorial();
    }

    void testFactorialOfZero() {
        FactorialForLoop factorial = new FactorialForLoop();
        int number = 0;
        int expectedResult = 1;
        String testTitle = "Test 1: factorial of 0";

        int result = factorial.factorial(number);

        checkResult(expectedResult, result, testTitle);
    }

    void testFactorialOfOne() {
        FactorialForLoop factorial = new FactorialForLoop();
        int number = 1;
        int expectedResult = 1;
        String testTitle = "Test 2: factorial of 1";

        int result = factorial.factorial(number);

        checkResult(expectedResult, result, testTitle);
    }

    void testFactorial() {
        FactorialForLoop factorial = new FactorialForLoop();
        int number = 5;
        int expectedResult = 120;
        String testTitle = "Test 3: factorial of 5";

        int result = factorial.factorial(number);

        checkResult(expectedResult, result, testTitle);
    }

    void checkResult(int expectedResult, int result, String testTitle) {
        if (expectedResult == result) {
            System.out.println(testTitle + " - OK");
        }
        else {
            System.out.println(testTitle + " - FAIL");
        }
    }
}
