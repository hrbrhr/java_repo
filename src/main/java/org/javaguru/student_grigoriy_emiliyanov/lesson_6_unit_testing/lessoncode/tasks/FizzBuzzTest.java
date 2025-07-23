package org.javaguru.student_grigoriy_emiliyanov.lesson_6_unit_testing.lessoncode.tasks;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest testSuite = new FizzBuzzTest();
        testSuite.test1();
        testSuite.test2();
        testSuite.test3();
        testSuite.test4();
        testSuite.test5();
    }

    private void test1() {
        // test case 1:  3 -> "Fizz"
        FizzBuzz fizzBuzz = new FizzBuzz();
        int n = 3;
        if (fizzBuzz.detect(n).equals("Fizz")) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

    private void test2() {
        // test case 2:  5 -> "Buzz"
        FizzBuzz fizzBuzz = new FizzBuzz();
        int n = 5;
        if (fizzBuzz.detect(n).equals("Buzz")) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

    private void test3() {
        // test case 3:  15 -> "FizzBuzz"
        FizzBuzz fizzBuzz = new FizzBuzz();
        int n = 15;
        if (fizzBuzz.detect(n).equals("FizzBuzz")) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

    private void test4() {
        // test case 4:  17 -> "17"
        FizzBuzz fizzBuzz = new FizzBuzz();
        int n = 17;
        if (fizzBuzz.detect(n).equals("17")) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

    private void test5() {
        // test case 5:  0 -> ???
        FizzBuzz fizzBuzz = new FizzBuzz();
        int n = 0;
        if (fizzBuzz.detect(n).equals("FizzBuzz")) {
            System.out.println("TEST IS OK!");
        } else {
            System.out.println("TEST IS FAIL!");
        }
    }

}
