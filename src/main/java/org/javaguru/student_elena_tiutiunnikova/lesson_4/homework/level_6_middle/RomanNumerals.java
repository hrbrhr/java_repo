package org.javaguru.student_elena_tiutiunnikova.lesson_4.homework.level_6_middle;

import java.util.Scanner;

class RomanNumerals {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10: ");
        int number = scanner1.nextInt();

        switch (number) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Извините, данная цифра не входит в диапазон от 1 до 10.");
        }
    }
}
