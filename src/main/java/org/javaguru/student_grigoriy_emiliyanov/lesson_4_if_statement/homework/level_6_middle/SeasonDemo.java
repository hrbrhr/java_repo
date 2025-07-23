package org.javaguru.student_grigoriy_emiliyanov.lesson_4_if_statement.homework.level_6_middle;

import java.util.Scanner;

public class SeasonDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your month number[1-12]:");
        int monthNumber = scanner.nextInt();
        if (monthNumber <= 2) {
            System.out.println("It's winter");
        } else if (monthNumber <= 5) {
            System.out.println("It's spring");
        } else if (monthNumber <= 8) {
            System.out.println("It's summer");
        } else if (monthNumber <= 11) {
            System.out.println("It's fall");
        } else if (monthNumber == 12) {
            System.out.println("It's winter");
        } else {
            System.out.println("Your number must be between 1 and 12");
        }
    }
}
