package org.javaguru.student_anastassija.lesson_4.level_5;

import java.util.Scanner;
class CreditCardCommissionCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sum of cash: ");
        double cash = scanner.nextDouble();
        double commission = 0.0;

        if (cash <= 999) {
            commission = cash * 3 / 100;
        } else if ((cash >= 1000) && (cash <= 4999)) {
            commission = cash * 4 / 100;
        } else if (cash >= 5000) {
            commission = cash * 5 / 100;
        }
        System.out.println("Commission fee = " + commission);
        scanner.close();
    }
}


