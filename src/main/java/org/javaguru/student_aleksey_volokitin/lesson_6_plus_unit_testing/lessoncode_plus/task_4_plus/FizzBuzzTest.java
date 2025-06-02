package org.javaguru.student_aleksey_volokitin.lesson_6_plus_unit_testing.lessoncode_plus.task_4_plus;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.test1();
        fizzBuzzTest.test2();
        fizzBuzzTest.test3();
        fizzBuzzTest.test4();
        fizzBuzzTest.test5();
        fizzBuzzTest.test6();
        fizzBuzzTest.test7();
        fizzBuzzTest.test8();
        fizzBuzzTest.test9();
        fizzBuzzTest.test10();
        fizzBuzzTest.test11();
        fizzBuzzTest.test12();
    }
    void test1 () {
        int number = 3;
        String expectedResult = "Fizz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 1 - OK");
        }
        else {
            System.out.println("Test 1 - FAIL");
        }
    }
    void test2 () {
        int number = 9;
        String expectedResult = "Fizz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 2 - OK");
        }
        else {
            System.out.println("Test 2 - FAIL");
        }
    }

    void test3 () {
        int number = -6;
        String expectedResult = "Fizz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 3 - OK");
        }
        else {
            System.out.println("Test 3 - FAIL");
        }
    }
    void test4 () {
        int number = 5;
        String expectedResult = "Buzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 4 - OK");
        }
        else {
            System.out.println("Test 4 - FAIL");
        }
    }
    void test5 () {
        int number = 20;
        String expectedResult = "Buzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 5 - OK");
        }
        else {
            System.out.println("Test 5 - FAIL");
        }
    }
    void test6 () {
        int number = -20;
        String expectedResult = "Buzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 6 - OK");
        }
        else {
            System.out.println("Test 6 - FAIL");
        }
    }
    void test7() {
        int number = 15;
        String expectedResult = "FizzBuzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 7 - OK");
        }
        else {
            System.out.println("Test 7 - FAIL");
        }
    }
    void test8() {
        int number = 30;
        String expectedResult = "FizzBuzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 8 - OK");
        }
        else {
            System.out.println("Test 8 - FAIL");
        }
    }
    void test9() {
        int number = -30;
        String expectedResult = "FizzBuzz";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 9 - OK");
        }
        else {
            System.out.println("Test 9 - FAIL");
        }
    }
    void test10() {
        int number = 7;
        String expectedResult = "7";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 10 - OK");
        }
        else {
            System.out.println("Test 10 - FAIL");
        }
    }
    void test11() {
        int number = -7;
        String expectedResult = "-7";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 11 - OK");
        }
        else {
            System.out.println("Test 11 - FAIL");
        }
    }
    void test12() {
        int number = 0;
        String expectedResult = "0";

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.convertingToString(number);
        if (expectedResult.equals(result)) {
            System.out.println("Test 12 - OK");
        }
        else {
            System.out.println("Test 12 - FAIL");
        }
    }
}
