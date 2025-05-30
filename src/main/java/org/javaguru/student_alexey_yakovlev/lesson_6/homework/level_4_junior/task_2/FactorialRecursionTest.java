package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_4_junior.task_2;

class FactorialRecursionTest {

    public static void main(String[] args) {
        FactorialRecursionTest factorialRecursionTest = new FactorialRecursionTest();
        factorialRecursionTest.test1();
        factorialRecursionTest.test2();
        factorialRecursionTest.test3();
    }

    public void test1() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(5);

        if (realResult == 120) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(1);

        if (realResult == 1) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(0);

        if (realResult == 1) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

}
