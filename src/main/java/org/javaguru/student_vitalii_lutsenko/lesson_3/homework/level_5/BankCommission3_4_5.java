package org.javaguru.student_vitalii_lutsenko.lesson_3.homework.level_5;

import java.util.Scanner;

public class BankCommission3_4_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount you wish to withdraw: ");

        double cash = scanner.nextInt();

        double cash3 = cash * 3 / 100;
        double cash4 = cash * 4 / 100;
        double cash5 = cash * 5 / 100;

        if (cash <= 999) {
            System.out.println("Commission: " + cash3 + "EUR (3%)");
        }
        else if (cash >= 1000 &&  cash <= 4999 ) {
            System.out.println("Commission: " + cash4 + "EUR (4%)");
        }
        else{
            System.out.println("Commission: " + cash5 + "EUR (5%)");
        }

    }
}
