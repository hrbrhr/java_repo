package org.javaguru.student_aleksey_volokitin.project_1_plus_tax_calculator;

import java.util.Locale;
import java.util.Scanner;

class TaxCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter a value of income: ");
        double income = scanner.nextDouble();

        TaxCalculator taxCalculator = new TaxCalculator();

        double tax = taxCalculator.calculateTax(income);
        System.out.println("Income: " + income + " , tax value: " + tax);
    }
}
