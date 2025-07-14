package org.javaguru.student_evgeniy_shendelev.lesson_2.homework.level_3.taks_3;

import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0L;
        System.out.println("Сейчас вам будет предложено ввести 3 числа по очереди. Целые отделяйте запятыми");
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите " + (i+1) + "е число");
            double num = scanner.nextDouble();
            sum += num;
        }
        double avg = sum / 3L;
        System.out.printf("Average: %.2f%n", avg);
    }
}
