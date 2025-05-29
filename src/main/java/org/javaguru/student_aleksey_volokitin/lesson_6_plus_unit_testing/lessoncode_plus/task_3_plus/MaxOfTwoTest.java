package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.lessoncode_plus.task_3_plus;

class MaxOfTwoTest {
    public static void main(String[] args) {
        MaxOfTwoTest maxOfTwoTest = new MaxOfTwoTest();
        maxOfTwoTest.test1();
        maxOfTwoTest.test2();
        maxOfTwoTest.test3();
    }
    void test1(){
        int number1 = 1;
        int number2 = 2;
        int expectedResult = 2;

        MaxOfTwo maxOfTwo = new MaxOfTwo();
        int result = maxOfTwo.findMax(number1, number2);
        if (expectedResult == result) {
            System.out.println("Test 1 - OK");
        }
        else {
            System.out.println("Test 1 - FAIL");
        }
    }
    void test2(){
        int number1 = 3;
        int number2 = 2;
        int expectedResult = 3;

        MaxOfTwo maxOfTwo = new MaxOfTwo();
        int result = maxOfTwo.findMax(number1, number2);
        if (expectedResult == result) {
            System.out.println("Test 2 - OK");
        }
        else {
            System.out.println("Test 2 - FAIL");
        }
    }
    void test3(){
        int number1 = 4;
        int number2 = 4;
        int expectedResult = 4;

        MaxOfTwo maxOfTwo = new MaxOfTwo();
        int result = maxOfTwo.findMax(number1, number2);
        if (expectedResult == result) {
            System.out.println("Test 3 - OK");
        }
        else {
            System.out.println("Test 3 - FAIL");
        }
    }
}
