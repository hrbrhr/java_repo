package org.javaguru.student_vasilii_khvan.lesson_4.level_6.task_1;

import java.util.Scanner;

class MonthCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfMonth = scanner.nextInt();
        String season = switch (numberOfMonth) {
            case 12, 1, 2 -> "winter";
            case 3, 4, 5 -> "spring";
            case 6, 7, 8 -> "summer";
            case 9, 10, 11 -> "fall";
            default -> "Введите число от 1 до 12";
        };
        System.out.println(season);
    }
}
