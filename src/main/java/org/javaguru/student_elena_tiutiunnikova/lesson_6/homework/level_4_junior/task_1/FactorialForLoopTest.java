package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_4_junior.task_1;

class FactorialForLoopTest {

    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.test1();
        test.test2();
        test.test3();
    }

    // 2 -> 2
    public void test1 () {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(2);

        if ( realResult == 2 ) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    // 4 -> 24
    public void test2 () {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(4);

        if ( realResult == 24 ) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    // 0 -> 1
    public void test3 () {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(0);

        if ( realResult == 1 ) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

}
