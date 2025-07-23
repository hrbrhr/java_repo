package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.homework.level_4_junior;

class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest suite = new FactorialRecursionTest();
        suite.test0();
        suite.test1();
        suite.testBigger();
    }

    private void test0() {
        FactorialRecursion factorial = new FactorialRecursion();
        int expected = 1;
        checkExpect(expected, factorial.factorial(0), "should 0!==1");
    }

    private void test1() {
        FactorialRecursion factorial = new FactorialRecursion();
        int expected = 1;
        checkExpect(expected, factorial.factorial(1), "should 1!==1");
    }

    private void testBigger() {
        FactorialRecursion factorial = new FactorialRecursion();
        int expected = 3628800;
        checkExpect(expected, factorial.factorial(10), "should 10!==3628800");
    }

    private void checkExpect(int expected, int real, String testCaseName) {
        if (real == expected) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }
}
