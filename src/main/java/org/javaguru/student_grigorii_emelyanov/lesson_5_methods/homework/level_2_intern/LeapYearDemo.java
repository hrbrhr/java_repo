package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.homework.level_2_intern;

import java.util.Scanner;

class LeapYearDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 8; i++) {
            System.out.println("Try " + i + " of " + 8);
            System.out.println("Input your year:");
            int year = scanner.nextInt();
            System.out.println("Is " + year + " leap : " + isLeapYear(year));
        }
        System.out.println("Bye-bye!");
    }

    static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}
