package org.javaguru.student_pavel_gorev.lesson_4.level_6;

import java.util.Scanner;

class RomanConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 10: ");
        int number = scanner.nextInt();

        String roman;

        switch (number) {
            case 1:
                roman = "I";
                break;
            case 2:
                roman = "II";
                break;
            case 3:
                roman = "III";
                break;
            case 4:
                roman = "IV";
                break;
            case 5:
                roman = "V";
                break;
            case 6:
                roman = "VI";
                break;
            case 7:
                roman = "VII";
                break;
            case 8:
                roman = "VIII";
                break;
            case 9:
                roman = "IX";
                break;
            case 10:
                roman = "X";
                break;
            default:
                roman = "Ошибка: введите число от 1 до 10";
        }

        System.out.println("Римская цифра: " + roman);
    }
}