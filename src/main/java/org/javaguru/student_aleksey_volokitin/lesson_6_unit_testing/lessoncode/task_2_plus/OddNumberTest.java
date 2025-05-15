package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.lessoncode.task_2_plus;

class OddNumberTest {
    public static void main(String[] args) {
        OddNumberTest oddNumberTest = new OddNumberTest();
        oddNumberTest.test1();
        oddNumberTest.test2();
        oddNumberTest.test3();
    }
    private void test1() {
        int number = 1;
        boolean expectedResult = true;

        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);
        if (expectedResult == result) {
            System.out.println("Test 1 value " + number + " - OK");
        }
        else {
            System.out.println("Test 1 value " + number + " - FAIL");
        }
    }
    private void test2() {
        int number = 2;
        boolean expectedResult = false;

        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);
        if (expectedResult == result) {
            System.out.println("Test 2 value " + number + " - OK");
        }
        else {
            System.out.println("Test 2 value " + number + " - FAIL");
        }
    }
    private void test3() {
        int number = 0;
        boolean expectedResult = false;

        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);
        if (expectedResult == result) {
            System.out.println("Test 3 value " + number + " - OK");
        }
        else {
            System.out.println("Test 3 value " + number + " - FAIL");
        }
    }
}
