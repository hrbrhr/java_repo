package org.javaguru.student_vitalii_lutsenko.project_1.task_4;

  class TaxCalculatorApplication {

      public static void main(String[] args) {

          TaxCalculator calculator = new TaxCalculator();
          double tax1 = calculator.calculateTax(44000);
          double tax2 = calculator.calculateTax(55000);
          double tax3 = calculator.calculateTax(66000);

          System.out.println("Tax1: " + tax1);
          System.out.println("Tax2: " + tax2);
          System.out.println("Tax3: " + tax3);



      }






 }
