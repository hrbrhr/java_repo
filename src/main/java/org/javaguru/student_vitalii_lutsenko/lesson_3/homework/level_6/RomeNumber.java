package org.javaguru.student_vitalii_lutsenko.lesson_3.homework.level_6;

import java.util.Scanner;

 class RomeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1-10 number: ");
        int numbers = scanner.nextInt();

        switch (numbers) {
            case 1: System.out.print("1 = I");
            break;
            case 2: System.out.print("2 = II");
            break;
            case 3: System.out.print("3 = III");
            break;
            case 4: System.out.print("4 = IV");
            break;
            case 5: System.out.print("5 = V");
            break;
            case 6: System.out.print("6 = VI");
            break;
            case 7: System.out.print("7 = VII");
            break;
            case 8: System.out.print("8 = VIII");
            break;
            case 9: System.out.print("9 = IX");
            break;
            case 10: System.out.print("10 = X");

        }


    }
}
