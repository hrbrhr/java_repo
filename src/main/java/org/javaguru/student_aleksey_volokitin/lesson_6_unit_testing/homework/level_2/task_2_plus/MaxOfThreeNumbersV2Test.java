package org.javaguru.student_aleksey_volokitin.lesson_6_unit_testing.homework.level_2.task_2_plus;

class MaxOfThreeNumbersV2Test {
    public static void main(String[] args) {
        MaxOfThreeNumbersV2Test maxOfThreeNumbersV2Test = new MaxOfThreeNumbersV2Test();
        maxOfThreeNumbersV2Test.test1();
        maxOfThreeNumbersV2Test.test2();
        maxOfThreeNumbersV2Test.test3();
        maxOfThreeNumbersV2Test.test4();
        maxOfThreeNumbersV2Test.test5();
        maxOfThreeNumbersV2Test.test6();
    }

    //  1   1   2   2   3   3
    //  2   3   1   3   1   2
    //  3   2   3   1   2   1
    void test1() {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int expectedResult = 3;

        MaxOfThreeNumbersV2 maxOfThreeNumbers = new MaxOfThreeNumbersV2();
        int result = maxOfThreeNumbers.findMax(num1, num2, num3);
        if (result == expectedResult) { System.out.println("Test 1 - OK"); }
        else                          { System.out.println("Test 1 - FAIL"); }
    }

    void test2() {
        int num1 = 1;
        int num2 = 3;
        int num3 = 2;
        int expectedResult = 3;

        MaxOfThreeNumbersV2 maxOfThreeNumbers = new MaxOfThreeNumbersV2();
        int result = maxOfThreeNumbers.findMax(num1, num2, num3);
        if (result == expectedResult) { System.out.println("Test 2 - OK"); }
        else                          { System.out.println("Test 2 - FAIL"); }
    }

    void test3() {
        int num1 = 2;
        int num2 = 1;
        int num3 = 3;
        int expectedResult = 3;

        MaxOfThreeNumbersV2 maxOfThreeNumbers = new MaxOfThreeNumbersV2();
        int result = maxOfThreeNumbers.findMax(num1, num2, num3);
        if (result == expectedResult) { System.out.println("Test 3 - OK"); }
        else                          { System.out.println("Test 3 - FAIL"); }
    }

    void test4() {
        int num1 = 2;
        int num2 = 3;
        int num3 = 1;
        int expectedResult = 3;

        MaxOfThreeNumbersV2 maxOfThreeNumbers = new MaxOfThreeNumbersV2();
        int result = maxOfThreeNumbers.findMax(num1, num2, num3);
        if (result == expectedResult) { System.out.println("Test 4 - OK"); }
        else                          { System.out.println("Test 4 - FAIL"); }
    }

    void test5() {
        int num1 = 3;
        int num2 = 1;
        int num3 = 2;
        int expectedResult = 3;

        MaxOfThreeNumbersV2 maxOfThreeNumbers = new MaxOfThreeNumbersV2();
        int result = maxOfThreeNumbers.findMax(num1, num2, num3);
        if (result == expectedResult) { System.out.println("Test 5 - OK"); }
        else                          { System.out.println("Test 5 - FAIL"); }
    }

    void test6() {
        int num1 = 3;
        int num2 = 2;
        int num3 = 1;
        int expectedResult = 3;

        MaxOfThreeNumbersV2 maxOfThreeNumbers = new MaxOfThreeNumbersV2();
        int result = maxOfThreeNumbers.findMax(num1, num2, num3);
        if (result == expectedResult) { System.out.println("Test 6 - OK"); }
        else                          { System.out.println("Test 6 - FAIL"); }
    }
}
