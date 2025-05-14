package org.javaguru.student_aleksey_volokitin.project_1_plus_tax_calculator;

import java.util.Scanner;
import java.math.BigDecimal;

class TaxCalculatorBigDecimalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value of income: ");
        String incomeInString = scanner.nextLine();

        TaxCalculatorBigDecimal taxCalculator = new TaxCalculatorBigDecimal();

        BigDecimal income = new BigDecimal(incomeInString);
        BigDecimal tax = taxCalculator.calculateTax(income);
        System.out.println("Income: " + income + ", tax value: " + tax);
    }
}
