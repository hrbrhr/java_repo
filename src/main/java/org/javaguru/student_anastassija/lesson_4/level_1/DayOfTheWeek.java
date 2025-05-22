package org.javaguru.student_anastassija.lesson_4.level_1;

import java.util.Scanner;

class DayOfTheWeek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the number in the range from 1 to 7:");
        int number = scanner.nextInt();
        boolean Monday = number == 1;
        boolean Tuesday = number == 2;
        boolean Wednesday = number == 3;
        boolean Thursday = number == 4;
        boolean Friday = number == 5;
        boolean Saturday = number == 6;
        boolean Sunday = number == 7;

        if (Monday) {
            System.out.println("Monday");
        } else if (Tuesday) {
            System.out.println("Tuesday");
        } else if (Wednesday) {
            System.out.println("Wednesday");
        } else if (Thursday) {
            System.out.println("Thursday");
        } else if (Friday) {
            System.out.println("Friday");
        } else if (Saturday) {
            System.out.println("Saturday");
        } else if (Sunday) {
            System.out.println("Sunday");
        } else  {
            System.out.println("Number might be in the range from 1 to 7");
        }
    }
}
