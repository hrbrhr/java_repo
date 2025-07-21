package org.javaguru.student_vasilii_khvan.lesson_4.level_5.task_1;

import java.util.Scanner;

class Commission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int withdraw = scanner.nextInt();
        int commission = 3;
        if ((withdraw >= 1000) && (withdraw < 5000)) {
            commission = 4;
        }
        if (withdraw >= 5000) {
            commission = 5;
        }
        double commissionAmount = withdraw * commission / 100.0;
        System.out.println(commissionAmount);
    }
}
