package org.javaguru.student_anastassija.lesson_6.homework.level_2;
public class MaxOfThreeNumbersTest1 {

        public static void main(String[] args) {
            MaxOfThreeNumbersTest1 test = new MaxOfThreeNumbersTest1();
            test.test1();
            test.test2();
            test.test3();
            test.test4();
        }
        public void test1(){
         MaxOfThreeNumbers1 maxOfThreeNumbers1 = new MaxOfThreeNumbers1();
         int realResult = maxOfThreeNumbers1.findMax(2, 3, 4);
         checkResult(realResult, 4 , "test1");
        }
        public void test2(){
        MaxOfThreeNumbers1 maxOfThreeNumbers1 = new MaxOfThreeNumbers1();
        int realResult = maxOfThreeNumbers1.findMax(20, 3, 4);
        checkResult(realResult, 20 , "test2");
        }
        public void test3(){
        MaxOfThreeNumbers1 maxOfThreeNumbers1 = new MaxOfThreeNumbers1();
        int realResult = maxOfThreeNumbers1.findMax(2, 30, 4);
        checkResult(realResult, 30 , "test3");
        }
        public void test4(){
        MaxOfThreeNumbers1 maxOfThreeNumbers1 = new MaxOfThreeNumbers1();
        int realResult = maxOfThreeNumbers1.findMax(2, 2, 2);
        checkResult(realResult, 2 , "test4");
        }


        private void checkResult(int realResult, int expectedResult, String testScenarioName) {
            if (realResult == expectedResult) {
                System.out.println(testScenarioName + ": TEST OK!");
         } else {
                System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
                }
                        }

}
