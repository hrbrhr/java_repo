package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.lessoncode_plus.task_1_plus;

class EvenNumberTest {
    public static void main(String[] args) {
        EvenNumberTest evenNumberTest = new EvenNumberTest();
        evenNumberTest.test1();
        evenNumberTest.test2();
        evenNumberTest.test3();
    }
    void test1() {
        int number = 2;
        boolean expectedResult = true;

        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(number);

        if (expectedResult == result) {
            System.out.println("Test 1 value " + number + " - OK");
        }
        else {
            System.out.println("Test 1 value " + number + " - FAIL");
        }
    }
    void test2() {
        int number = 1;
        boolean expectedResult = false;

        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(number);

        if (expectedResult == result) {
            System.out.println("Test 2 value " + number + " - OK");
        }
        else {
            System.out.println("Test 2 value " + number + " - FAIL");
        }
    }
    void test3() {
        int number = 0;
        boolean expectedResult = true;

        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(number);

        if (expectedResult == result) {
            System.out.println("Test 3 value " + number + " - OK");
        }
        else {
            System.out.println("Test 3 value " + number + " - FAIL");
        }
    }
}
