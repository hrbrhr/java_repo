package org.javaguru.student_artjoms_babicevs.lesson_6.level_6.task_1;

 class SalaryTaxCalculatorTest {

     public static void main(String[] args) {
         SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();

         test.testLowSalary();
         test.testMiddleSalary();
         test.testHighSalary();
         test.testBoundaryLow();
         test.testBoundaryMiddle();
     }

    public void testLowSalary() {
         SalaryTaxCalculator calculator = new SalaryTaxCalculator();
         double result = calculator.calculate(8000);
         checkResult(result,2400,"testLowSalary");

}
     public void testMiddleSalary() {
         SalaryTaxCalculator calculator = new SalaryTaxCalculator();
         double result = calculator.calculate(20000);
         checkResult(result,8000,"testMiddleSalary");

     }
     public void testHighSalary() {
         SalaryTaxCalculator calculator = new SalaryTaxCalculator();
         double result = calculator.calculate(60000);
         checkResult(result,30000,"testHighSalary");

     }
     public void testBoundaryLow() {
         SalaryTaxCalculator calculator = new SalaryTaxCalculator();
         double result = calculator.calculate(10000);
         checkResult(result,3000,"testBoundaryLow");

     }
     public void testBoundaryMiddle() {
         SalaryTaxCalculator calculator = new SalaryTaxCalculator();
         double result = calculator.calculate(50000);
         checkResult(result,20000,"testBoundaryMiddle");

     }
     private void checkResult(double realResult,double expectedResult,String testName) {
         double epsilon = 0.00001;
         if (Math.abs(realResult - expectedResult) < epsilon) {
             System.out.println(testName + ": TEST OK!");
         } else {
             System.out.println(testName + ": TEST FAIL! expected = " + expectedResult + ", but got = " + realResult);
         }
     }
 }








