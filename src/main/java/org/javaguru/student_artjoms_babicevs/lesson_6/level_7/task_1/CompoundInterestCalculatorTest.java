package org.javaguru.student_artjoms_babicevs.lesson_6.level_7.task_1;

 class CompoundInterestCalculatorTest {
     public static void main(String[] args) {
         CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
         test.shouldReturnZeroWhenSumIsZero();
         test.shouldReturnSumWhenInterestIsZero();
         test.shouldReturnSumWhenYearsIsZero();
         test.shouldCalculateCorrectInterest();
     }

      public void shouldReturnZeroWhenSumIsZero() {
         CompoundInterestCalculator calculator = new CompoundInterestCalculator();
         double result = calculator.compoundInterest(0,5,10);
         checkResult(result,0.0,"shouldReturnZeroWhenSumIsZero");

    }
     public void shouldReturnSumWhenInterestIsZero() {
         CompoundInterestCalculator calculator = new CompoundInterestCalculator();
         double result = calculator.compoundInterest(100,0,10);
         checkResult(result,1000.0,"shouldReturnSumWhenInterestIsZero");

     }
     public void shouldReturnSumWhenYearsIsZero() {
         CompoundInterestCalculator calculator = new CompoundInterestCalculator();
         double result = calculator.compoundInterest(1000,5,0);
         checkResult(result,1000.0,"shouldReturnSumWhenYearsIsZero");

     }
     public void shouldCalculateCorrectInterest() {
         CompoundInterestCalculator calculator = new CompoundInterestCalculator();
         double result = calculator.compoundInterest(1000,5,2);
         checkResult(result,1102.5,"shouldCalculateCorrectInterest");

     }
     private void checkResult(double actual, double expected, String testName) {
         double epsilon = 0.0001;
         if (Math.abs(actual - expected) < epsilon) {
             System.out.println(testName + ": TEST OK!");
         } else {
             System.out.println(testName + ": TEST FAIL! expected = " + expected + " but got = " + actual);
         }
     }
 }





