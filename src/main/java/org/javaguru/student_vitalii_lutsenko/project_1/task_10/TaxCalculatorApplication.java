package org.javaguru.student_vitalii_lutsenko.project_1.task_10;

class TaxCalculatorApplication {

      public static void main(String[] args) {

          TaxCalculator calculator = new TaxCalculator();
          double tax1 = calculator.calculateTax(4_000);
          double tax2 = calculator.calculateTax(55_000);
          double tax3 = calculator.calculateTax(100_000);

          System.out.println("Tax1: " + tax1);
          System.out.println("Tax2: " + tax2);
          System.out.println("Tax3: " + tax3);



      }






 }
