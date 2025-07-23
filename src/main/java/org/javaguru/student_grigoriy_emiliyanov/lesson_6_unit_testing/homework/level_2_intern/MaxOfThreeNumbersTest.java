package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.homework.level_2_intern;

class MaxOfThreeNumbersTest {
    public static void main(String[] args) {
        MaxOfThreeNumbersTest suite = new MaxOfThreeNumbersTest();
        suite.firstBiggest();
        suite.secondBiggest();
        suite.thirdBiggest();
        suite.allEqual();
    }

    private void allEqual() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int a = 3;
        int b = 3;
        int c = 3;
        checkExpect(a, maxOfThreeNumbers.findMax(a, b, c), "All are equal");
        checkExpect(b, maxOfThreeNumbers.findMax(a, b, c), "All are equal");
        checkExpect(c, maxOfThreeNumbers.findMax(a, b, c), "All are equal");
    }

    private void thirdBiggest() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int a = 10;
        int b = 3;
        int c = 22;
        checkExpect(c, maxOfThreeNumbers.findMax(a, b, c), "Third is biggest");

    }

    private void secondBiggest() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int a = 10;
        int b = 33;
        int c = 2;
        checkExpect(b, maxOfThreeNumbers.findMax(a, b, c), "Second is biggest");

    }

    private void firstBiggest() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int a = 10;
        int b = 3;
        int c = 2;
        checkExpect(a, maxOfThreeNumbers.findMax(a, b, c), "First is biggest");
    }

    private void checkExpect(int expected, int real, String testCaseName) {
        if (real == expected) {
            System.out.println(testCaseName + ": TEST OK!");
        } else {
            System.out.println(testCaseName + ": TEST FAIL! expected = " + expected + " but realResult = " + real);
        }
    }
}
