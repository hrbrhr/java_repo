package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_4_junior.task_1;

class FactorialForLoopTest {

    public static void main(String[] args) {
        FactorialForLoopTest factorialForLoopTest = new FactorialForLoopTest();
        factorialForLoopTest.test1();
        factorialForLoopTest.test2();
        factorialForLoopTest.test3();
        factorialForLoopTest.test4();

    }

    public void test1() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(5);
//        System.out.println(realResult);

        if (realResult == 120) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(1);
//        System.out.println(realResult);

        if (realResult == 1) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(0);
//        System.out.println(realResult);

        if (realResult == 1) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    public void test4() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(-5);
//        System.out.println(realResult);

        if (realResult == 1) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }
}
