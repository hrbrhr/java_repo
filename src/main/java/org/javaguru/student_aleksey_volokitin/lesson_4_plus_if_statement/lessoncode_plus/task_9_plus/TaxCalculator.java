package org.javaguru.student_aleksey_volokitin.lesson_4_plus_if_statement.lessoncode_plus.task_9_plus;

import java.util.Locale;
import java.util.Scanner;

class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter income: ");
        double income = scanner.nextDouble();
        double taxValue = 0.0d;
        boolean isIncomeUnder10k = income <= 10000;
        boolean isIncomeBetween10kAnd20k = (income >10000) && (income <= 20000);
        boolean isIncomeOver20k = (income > 20000);

        if (isIncomeUnder10k) {
            taxValue = Math.round(income * 0.1d * 100) / 100.0d;
        }
        if (isIncomeBetween10kAnd20k) {
            double incomeOver10k = income - 10000.0d;
            taxValue = Math.round((10000 * 0.1d + incomeOver10k * 0.15d) * 100) / 100.0d;
        }
        if (isIncomeOver20k) {
            double incomeOver20k = income - 20000.0d;
            taxValue = Math.round((10000 * 0.1d + 10000 * 0.15d + incomeOver20k * 0.2d) * 100) / 100.0d;
        }
        System.out.println(taxValue);
    }
}
