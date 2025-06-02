package org.javaguru.student_alexey_yakovlev.lesson_6.homework.level_2_intern.task_2;

class MaxOfThreeNumbersTest {

    public static void main(String[] args) {
        MaxOfThreeNumbersTest maxOfThreeNumbersTest = new MaxOfThreeNumbersTest();
        maxOfThreeNumbersTest.test1();
        maxOfThreeNumbersTest.test2();
        maxOfThreeNumbersTest.test3();
        maxOfThreeNumbersTest.test4();

    }

    public void test1() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(7, 6, 5);

        if (realResult == 7) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void test2() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(6, 7, 5);

        if (realResult == 7) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void test3() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(5, 6, 7);

        if (realResult == 7) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    public void test4() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(7, 7, 7);

        if (realResult == 7) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }
}
