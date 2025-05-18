package org.javaguru.student_artjoms_babicevs.project_1_tax_calculator.task_1;

 class Tax_calculator {

     public static double calculateTax(double income) {
         double tax = 0.0;

         if (income <= 10_000) {
             tax = income * 0.30;
         } else if (income <= 50_000) {
             tax = 10_000 * 0.30 + (income - 10_000) * 0.40;
         } else {
             tax = 10_000 * 0.30 + 40_000 * 0.40 + (income - 50_000) * 0.50;
         }

         return tax;
     }

     public static void main(String[] args) {

         double[] incomes = {8000, 30000, 70000};
         for (double income : incomes) {
             double tax = calculateTax(income);
             System.out.printf("Income: %.2f | Tax: %.2f%n", income, tax);
         }
     }
 }








