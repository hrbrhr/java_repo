package org.javaguru.student_artjoms_babicevs.lesson_6.level_4.task_2;

 class FactorialRecursionTest {

     public static void main(String[] args) {
         FactorialRecursionTest test = new FactorialRecursionTest();
         test.shouldReturnFactorialOfZero();
         test.shouldReturnFactorialOfOne();
         test.shouldReturnFactorialOfFive();
         test.shouldReturnFactorialOfTen();
         test.shouldThrowExceptionForNegative();
     }

     public void shouldReturnFactorialOfZero() {
         FactorialRecursion fr = new FactorialRecursion();
         int result = fr.factorial(0);
         checkResult(result, 1, "shouldReturnFactorialOfZero");
     }

     public void shouldReturnFactorialOfOne() {
         FactorialRecursion fr = new FactorialRecursion();
         int result = fr.factorial(1);
         checkResult(result, 1, "shouldReturnFactorialOfOne");
     }

     public void shouldReturnFactorialOfFive() {
         FactorialRecursion fr = new FactorialRecursion();
         int result = fr.factorial(5);
         checkResult(result, 120, "shouldReturnFactorialOfFive");
     }

     public void shouldReturnFactorialOfTen() {
         FactorialRecursion fr = new FactorialRecursion();
         int result = fr.factorial(10);
         checkResult(result, 3628800, "shouldReturnFactorialOfTen");
     }

     public void shouldThrowExceptionForNegative() {
         FactorialRecursion fr = new FactorialRecursion();
         try {
             fr.factorial(-1);
             System.out.println("shouldThrowExceptionForNegative: TEST FAIL! (exception not thrown)");
         } catch (IllegalArgumentException e) {
             System.out.println("shouldThrowExceptionForNegative: TEST OK!");
         } catch (Exception e) {
             System.out.println("shouldThrowExceptionForNegative: TEST FAIL! (unexpected exception)");
         }
     }
        private void checkResult(int realResult,int expectedResult, String testName){
             if (realResult == expectedResult) {
                 System.out.println(testName + ": TEST OK!");
             } else {
                 System.out.println(testName + ": TEST FAIL! expected = " + expectedResult + " but got = " + realResult);
             }
         }
     }




