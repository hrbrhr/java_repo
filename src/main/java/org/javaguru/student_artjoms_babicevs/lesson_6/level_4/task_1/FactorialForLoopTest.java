package org.javaguru.student_artjoms_babicevs.lesson_6.level_4.task_1;

 class FactorialForLoopTest {

     public static   void main(String[] args) {
         FactorialForLoopTest test = new FactorialForLoopTest();
         test.factorial0();
         test.factorial1();
         test.factorial2();
         test.factorial3();
     }
     public void factorial0() {
         FactorialForLoop factorial = new FactorialForLoop();
         int RealResult = factorial.factorial(0);
         checkResult(RealResult,1,"Factorial0");
     }
     public void factorial1() {
         FactorialForLoop factorial = new FactorialForLoop();
         int RealResult = factorial.factorial(1);
         checkResult(RealResult,1,"Factorial1");
     }
     public void factorial2() {
         FactorialForLoop factorial = new FactorialForLoop();
         int RealResult = factorial.factorial(2);
         checkResult(RealResult,2,"Factorial2");
     }
     public void factorial3() {
         FactorialForLoop factorial = new FactorialForLoop();
         int RealResult = factorial.factorial(3);
         checkResult(RealResult,6,"Factorial3");
     }
     private void checkResult(int realResult,
                              int expectedResult,
                              String testScenarioName) {
         if (realResult == expectedResult) {
             System.out.println(testScenarioName + "Test is OK");
         } else {
             System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
         }

     }









}
