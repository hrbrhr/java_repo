package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework_plus.level_6_plus.task_2_plus;

import java.util.Scanner;

class RomanNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 10: ");
        int numberOfMonth = scanner.nextInt();

        switch (numberOfMonth){
            case 1:
                System.out.println("Number 1 is a I");
                break;
            case 2:
                System.out.println("Number 2 is a II");
                break;
            case 3:
                System.out.println("Number 3 is a III");
                break;
            case 4:
                System.out.println("Number 4 is a IV");
                break;
            case 5:
                System.out.println("Number 5 is a V");
                break;
            case 6:
                System.out.println("Number 6 is a VI");
                break;
            case 7:
                System.out.println("Number 7 is a VII");
                break;
            case 8:
                System.out.println("Number 8 is a VIII");
                break;
            case 9:
                System.out.println("Number 9 is a IX");
                break;
            case 10:
                System.out.println("Number 10 is a X");
                break;
            default:
                System.out.println("You enter incorrect number!");
        }
    }
}
