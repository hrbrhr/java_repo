package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework_plus.level_6_plus.task_1_plus;

import java.util.Scanner;

class MonthOfYearV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of the year: ");
        int numberOfMonth = scanner.nextInt();

        // January, February, March, April, May, June, July, August, September, October, November, December
        switch (numberOfMonth){
            case 1  -> System.out.println("Month number 1 is a January");
            case 2  -> System.out.println("Month number 2 is a February");
            case 3  -> System.out.println("Month number 3 is a March");
            case 4  -> System.out.println("Month number 4 is an April");
            case 5  -> System.out.println("Month number 5 is a May");
            case 6  -> System.out.println("Month number 6 is a June");
            case 7  -> System.out.println("Month number 7 is a July");
            case 8  -> System.out.println("Month number 8 is an August");
            case 9  -> System.out.println("Month number 9 is a September");
            case 10 -> System.out.println("Month number 10 is a October");
            case 11 -> System.out.println("Month number 11 is a November");
            case 12 -> System.out.println("Month number 12 is a December");
            default -> System.out.println("You enter incorrect number of month!");
        }
    }
}
