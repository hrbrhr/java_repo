package org.javaguru.student_anastassija.lesson_6;

public class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
    }
    // 3 -> "Fizz"
    public void test1() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(3);

        if (realResult.equals("Fizz")){
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FALSE");
        }
    }
    // 5 -> "Buzz"
    public void test2() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(5);

        if (realResult.equals("Buzz")){
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FALSE");
        }
    }
    // 15 -> "FizzBuzz"
    public void test3() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(15);

        if (realResult.equals("FizzBuzz")){
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FALSE");
        }
    }
    // 17 -> "17"
    public void test4() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(17);

        if (realResult.equals("17")){
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FALSE");
        }
    }
    // 0 -> "0"
    public void test5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(0);

        if (realResult.equals("0")){
            System.out.println("TEST 5 = OK");
        } else {
            System.out.println("TEST 5 = FALSE");
        }
    }

}
