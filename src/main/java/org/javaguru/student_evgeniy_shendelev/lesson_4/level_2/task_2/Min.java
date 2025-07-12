package org.javaguru.student_evgeniy_shendelev.lesson_4.level_2.task_2;

import java.util.Scanner;

class Min {
    public static void main(String[] args) {
        System.out.println("Введите два любых числа. Целую часть отделять запятой.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        double first = sc.nextDouble();
        System.out.println("Введите второе число");
        double second = sc.nextDouble();
        if (second <= first) {
            System.out.println(second);
        } else {
            System.out.println(first);
        }
    }
}
