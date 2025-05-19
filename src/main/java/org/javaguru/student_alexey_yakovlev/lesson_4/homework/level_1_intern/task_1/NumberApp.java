package org.javaguru.student_alexey_yakovlev.lesson_4.homework.level_1_intern.task_1;

import java.util.Scanner;

class NumberApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день недели от 1 до 7: ");
        Number number = new Number();

        int num = scanner.nextInt();
        System.out.println(number.foundDay(num));
    }
}
