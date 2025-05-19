package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework_plus.level_6_plus.task_1_plus;

import java.util.Scanner;

class MonthOfYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of the year: ");
        int numberOfMonth = scanner.nextInt();

        // January, February, March, April, May, June, July, August, September, October, November, December
        switch (numberOfMonth){
            case 1:
                System.out.println("Month number 1 is a January");
                break;
            case 2:
                System.out.println("Month number 2 is a February");
                break;
            case 3:
                System.out.println("Month number 3 is a March");
                break;
            case 4:
                System.out.println("Month number 4 is an April");
                break;
            case 5:
                System.out.println("Month number 5 is a May");
                break;
            case 6:
                System.out.println("Month number 6 is a June");
                break;
            case 7:
                System.out.println("Month number 7 is a July");
                break;
            case 8:
                System.out.println("Month number 8 is an August");
                break;
            case 9:
                System.out.println("Month number 9 is a September");
                break;
            case 10:
                System.out.println("Month number 10 is a October");
                break;
            case 11:
                System.out.println("Month number 11 is a November");
                break;
            case 12:
                System.out.println("Month number 12 is a December");
                break;
            default:
                System.out.println("You enter incorrect number of month!");
        }
    }
}
