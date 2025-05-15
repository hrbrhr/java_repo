package org.javaguru.student_aleksey_volokitin.lesson_2_plus_variables_and_datatypes.lessoncode_plus.task_11_plus;

import java.util.Scanner;

class TimeChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a time in the seconds: ");
        int timeInSeconds = scanner.nextInt();
        int day = timeInSeconds / 86400;
        int reminingTime = timeInSeconds - (day * 86400);
        int hour = reminingTime / 3600;
        reminingTime = reminingTime - (hour * 3600);
        int minute = reminingTime / 60;
        reminingTime = reminingTime - (minute * 60);
        int second = reminingTime;

        System.out.println(timeInSeconds + " second = " +
                           day + " days, " +
                           hour + " hours, " +
                           minute + " minutes, "+
                           second + " seconds");
    }
}
