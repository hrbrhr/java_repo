package org.javaguru.student_vasilii_khvan.lesson_4.level_6.task_3;

import java.util.Scanner;

class DayOfWeekTranslator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String dayOfWeek = switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Введите число от 1 до 7";
        };
        System.out.println(dayOfWeek);
    }
}