package org.javaguru.student_artjoms_babicevs.lesson_4.level_1.task_1;
import  java.util.Scanner;


public class DayNumber {
    public static void
    main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add number from 1 til 7:");
        int dayNumber = scanner.nextInt();

        String dayName = switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "not correct.Number shoul be from 1 til 7";
        };
      System.out.println(dayName)  ;
    }






}
