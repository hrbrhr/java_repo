package org.javaguru.student_elena_tiutiunnikova.lesson_4.homework.level_5_middle;

import java.util.Scanner;

class CreditCard {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите сумму к снятию (евро): ");
        int sum1 = scanner1.nextInt();

        if (sum1 < 1000) {
            System.out.println(sum1 * 0.03);
        } else if ((sum1 >= 1000) && (sum1<5000)) {
            System.out.println(sum1 * 0.04);
        } else {
            System.out.println(sum1 * 0.05);
        }
    }
}