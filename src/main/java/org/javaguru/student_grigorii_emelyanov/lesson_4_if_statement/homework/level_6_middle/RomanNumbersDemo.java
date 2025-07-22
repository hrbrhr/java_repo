package org.javaguru.student_grigorii_emelyanov.lesson_4_if_statement.homework.level_6_middle;

import java.util.Scanner;

public class RomanNumbersDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number[1-10]:");
        int number = scanner.nextInt();
        String result = "";
        switch (number) {
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 6:
                result = "VI";
                break;
            case 7:
                result = "VII";
                break;
            case 8:
                result = "VIII";
                break;
            case 9:
                result = "IX";
                break;
            case 10:
                result = "X";
                break;
            default:
                result = "unknown";
        }
        System.out.println("Your roman number is: " + result);
    }
}
