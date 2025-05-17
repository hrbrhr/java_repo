package org.javaguru.student_artjoms_babicevs.lesson_4.level_6.task_3;

import java.util.Scanner;


class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 1 to 7: ");
        int day = scanner.nextInt();
        String dayName;

        if (day == 1) {
            dayName = "Monday";
        } else if (day == 2) {
            dayName = "Tuesday";
        } else if (day == 3) {
            dayName = "Wednesday";
        } else if (day == 4) {
            dayName = "Thursday";
        } else if (day == 5) {
            dayName = "Friday";
        } else if (day == 6) {
            dayName = "Saturday";
        } else if (day == 7) {
            dayName = "Sunday";
        } else {
            dayName = "Mistake: number must be from 1 to 7.";
        }

        System.out.println(dayName);
        scanner.close();
    }







}
