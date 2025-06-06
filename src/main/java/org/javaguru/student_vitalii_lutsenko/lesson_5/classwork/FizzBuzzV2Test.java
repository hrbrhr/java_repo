package org.javaguru.student_vitalii_lutsenko.lesson_5.classwork;


class FizzBuzzV2Test {

     // test case 1:  3 -> "Fizz"
     // test case 2:  5 -> "Buzz"
     // test case 3:  15 -> "FizzBuzz"
     // test case 4:  17 -> "17"
     // test case 5:  0 -> "???"

     public static void main(String[] args) {

         FizzBuzzV2Test test = new FizzBuzzV2Test();
         test.testCase1();
         test.testCase2();
         test.testCase3();
         test.testCase4();
         test.testCase5();
     }

     public void testCase1 (){
        FizzBuzzV2 fizzBuzzV2 = new FizzBuzzV2();
        String result = fizzBuzzV2.detect(3);
        if (result.equals("Fizz")) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }
    public void testCase2 (){
        FizzBuzzV2 fizzBuzzV2 = new FizzBuzzV2();
        String result = fizzBuzzV2.detect(5);
        if (result.equals("Buzz")) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }
    public void testCase3 (){
        FizzBuzzV2 fizzBuzzV2 = new FizzBuzzV2();
        String result = fizzBuzzV2.detect(15);
        if (result.equals("FizzBuzz")) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }
    public void testCase4 (){
        FizzBuzzV2 fizzBuzzV2 = new FizzBuzzV2();
        String result = fizzBuzzV2.detect(17);
        if (result.equals("17")) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }
    public void testCase5 (){
        FizzBuzzV2 fizzBuzzV2 = new FizzBuzzV2();
        String result = fizzBuzzV2.detect(0);
        if (result.equals("???")) {
            System.out.println("Test 5 = OK");
        } else {
            System.out.println("Test 5 = FAIL");
        }
    }


}
