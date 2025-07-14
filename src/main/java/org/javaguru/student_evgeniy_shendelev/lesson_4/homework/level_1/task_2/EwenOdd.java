package org.javaguru.student_evgeniy_shendelev.lesson_4.homework.level_1.task_2;

import java.util.Scanner;

class EwenOdd {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число, чтобы узнать четное оно или нет");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Число " + num + " четное");
        } else {
            System.out.println("Число " + num + " нечетное");
        }
    }
}
