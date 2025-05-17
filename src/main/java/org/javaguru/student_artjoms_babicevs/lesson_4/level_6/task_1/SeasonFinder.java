package org.javaguru.student_artjoms_babicevs.lesson_4.level_6.task_1;

import java.util.Scanner;


 class SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.print("Enter month number (from 1 til 12): ");
        int month = scanner.nextInt();

        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
                season = "Incorrect month";
        }

        System.out.println("Season: " + season);
    }
 }






