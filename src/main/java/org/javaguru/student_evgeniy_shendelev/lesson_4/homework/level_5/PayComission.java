package org.javaguru.student_evgeniy_shendelev.lesson_4.homework.level_5;

import java.util.Scanner;

class PayComission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму");
        double num = scanner.nextDouble();
        if (num < 1000.0) {
            System.out.println("Комиссия составит: " + num * 0.03);
        } else if (num >= 1000.0 && num < 5000) {
            System.out.println("Комиссия составит: " + num * 0.04);
        } else {
            System.out.println("Комиссия составит: " + num * 0.05);
        }
    }
}
