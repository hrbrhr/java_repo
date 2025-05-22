package org.javaguru.student_alexey_yakovlev.lesson_4.homework.level_6_middle.task_2;

import java.util.Scanner;

class RomanNumerals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 10: ");

        int num = scanner.nextInt();

        switch (num) {
            case 1 -> System.out.println("I");
            case 2 -> System.out.println("II");
            case 3 -> System.out.println("III");
            case 4 -> System.out.println("IV");
            case 5 -> System.out.println("V");
            case 6 -> System.out.println("VI");
            case 7 -> System.out.println("VII");
            case 8 -> System.out.println("VIII");
            case 9 -> System.out.println("IX");
            case 10 -> System.out.println("X");
        }
    }
}
