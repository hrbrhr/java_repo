package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.homework_plus.level_4_plus.task_2_plus;

class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest factorialTest = new FactorialRecursionTest();

        factorialTest.testFactorialOfZero();
        factorialTest.testFactorialOfOne();
        factorialTest.testFactorial();
    }

    void testFactorialOfZero() {
        FactorialRecursion factorial = new FactorialRecursion();
        int number = 0;
        int expectedResult = 1;
        String testTitle = "Test 1: factorial of 0";

        int result = factorial.factorial(number);

        checkResult(expectedResult, result, testTitle);
    }

    void testFactorialOfOne() {
        FactorialRecursion factorial = new FactorialRecursion();
        int number = 1;
        int expectedResult = 1;
        String testTitle = "Test 2: factorial of 1";

        int result = factorial.factorial(number);

        checkResult(expectedResult, result, testTitle);
    }

    void testFactorial() {
        FactorialRecursion factorial = new FactorialRecursion();
        int number = 5;
        int expectedResult = 120;
        String testTitle = "Test 3: factorial of 5";

        int result = factorial.factorial(number);

        checkResult(expectedResult, result, testTitle);
    }

    void checkResult(int expectedResult, int result, String testTitle) {
        if (expectedResult == result) { System.out.println(testTitle + " - OK"); }
        else                          { System.out.println(testTitle + " - FAIL"); }
    }
}
