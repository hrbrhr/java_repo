package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework.level_6_plus.task_3_plus;

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number day of week: ");
        int numberOfMonth = scanner.nextInt();

        // Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        switch (numberOfMonth){
            case 1:
                System.out.println("Day 1 is a Monday");
                break;
            case 2:
                System.out.println("Day 2 is a Tuesday");
                break;
            case 3:
                System.out.println("Day 3 is a Wednesday");
                break;
            case 4:
                System.out.println("Day 4 is a Thursday");
                break;
            case 5:
                System.out.println("Day 5 is a Friday");
                break;
            case 6:
                System.out.println("Day 6 is a Saturday");
                break;
            case 7:
                System.out.println("Day 7 is a Sunday");
                break;
            default:
                System.out.println("You enter incorrect number!");
        }
    }
}
