package org.javaguru.student_elena_tiutiunnikova.lesson_5.homework.level_1_intern;

class TranslatorTest {
    public static void main(String[] args) {
        TranslatorTest test = new TranslatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
    }

        // 3 -> Fizz
    public void test1 () {

        Translator translator = new Translator();
        String realResult = translator.translator4(3);
        if (realResult.equals("Fizz")) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

        // 5 -> Buzz
    public void test2 () {

        Translator translator = new Translator();
        String realResult = translator.translator4(5);
        if (realResult.equals("Buzz")) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

        // 15 -> FizzBuzz
    public void test3 () {

        Translator translator = new Translator();
        String realResult = translator.translator4(15);
        if (realResult.equals("FizzBuzz")) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

    // 17 -> 17
    public void test4 () {

        Translator translator = new Translator();
        String realResult = translator.translator4(17);
        if (realResult.equals("17")) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }

    // 0 -> FizzBuzz
    public void test5 () {

        Translator translator = new Translator();
        String realResult = translator.translator4(0);
        if (realResult.equals("FizzBuzz")) {
            System.out.println("Test 5 = OK");
        } else {
            System.out.println("Test 5 = FAIL");
        }
    }

}
