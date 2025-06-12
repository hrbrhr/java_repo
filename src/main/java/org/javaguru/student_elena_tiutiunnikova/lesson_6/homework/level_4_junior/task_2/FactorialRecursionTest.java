package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_4_junior.task_2;

class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.test1();
        test.test2();
        test.test3();
    }

    //0->1
    public void test1 () {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(0);

        if (realResult == 1) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    //1->1
    public void test2 () {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(1);

        if (realResult == 1) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    //4->24
    public void test3 () {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(4);

        if (realResult == 24) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

}
