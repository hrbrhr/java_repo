package org.javaguru.student_elena_tiutiunnikova.lesson_6.homework.level_2_intern.task_2;

class MaxOfThreeNumbersTest {
    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.test1();
        test.test2();
        test.test3();
    }

    // 1 2 3 -> 3
    public void test1 () {

        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(1, 2, 3);

        if (realResult == 3) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    // 0 3 1 -> 3
    public void test2 () {

        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(0, 3, 1);

        if (realResult == 3) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

    // 3 2 1 -> 3
    public void test3 () {

        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int realResult = maxOfThreeNumbers.findMax(3, 2, 1);

        if (realResult == 3) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }
}
