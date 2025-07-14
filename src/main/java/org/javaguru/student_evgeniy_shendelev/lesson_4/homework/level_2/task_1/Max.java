package org.javaguru.student_evgeniy_shendelev.lesson_4.homework.level_2.task_1;

import java.util.Scanner;

class Max {
    public static void main(String[] args) {
        System.out.println("Введите два любых числа. Целую часть отделять запятой.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        double first = sc.nextDouble();
        System.out.println("Введите второе число");
        double second = sc.nextDouble();
        if (first >= second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
}
