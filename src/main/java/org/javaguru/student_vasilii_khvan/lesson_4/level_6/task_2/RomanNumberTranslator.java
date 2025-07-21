package org.javaguru.student_vasilii_khvan.lesson_4.level_6.task_2;

import java.util.Scanner;

class RomanNumberTranslator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String romanNumber = switch (number) {
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> "Введите число от 1 до 10";
        };
        System.out.println(romanNumber);
    }
}
