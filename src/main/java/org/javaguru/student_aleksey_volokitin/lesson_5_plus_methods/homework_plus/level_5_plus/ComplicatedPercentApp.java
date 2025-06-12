package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.homework_plus.level_5_plus;

import java.util.Locale;
import java.util.Scanner;

class ComplicatedPercentApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter a start sum: ");                            // 100 000
        double startSum = scanner.nextDouble();
        System.out.print("Enter a percent tax: ");                          // 0.16
        double percentTax = scanner.nextDouble();
        System.out.print("Enter amount of periods in the year: ");          // 12
        int periodAmount = scanner.nextInt();
        System.out.print("Enter amount of the year: ");                     // 5
        int yearAmount = scanner.nextInt();
                                                                            // 221 380.69

        ComplicatedPercent complicatedPercent = new ComplicatedPercent();
        double result = complicatedPercent.calculate(startSum,
                                                     percentTax,
                                                     periodAmount,
                                                     yearAmount);
        double roundedResult = Math.ceil(result * 100) / 100;

        System.out.println("\n" + "Total sum is: " + roundedResult);
    }
}
