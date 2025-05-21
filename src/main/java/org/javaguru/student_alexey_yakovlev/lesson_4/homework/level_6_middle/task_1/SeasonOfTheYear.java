package org.javaguru.student_alexey_yakovlev.lesson_4.homework.level_6_middle.task_1;

import java.util.Scanner;

class SeasonOfTheYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца от 1 до 12: ");

        int month = scanner.nextInt();

        switch (month) {
            case 12, 1, 2 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("Error, try again!");
        }
    }
}
