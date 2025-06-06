package org.javaguru.student_vitalii_lutsenko.lesson_3.homework.level_1.task_1;

import java.util.Scanner;

class WeekDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter days of the week 1-7: ");

        int numberDay = scanner.nextInt();

        if (numberDay == 1){
          System.out.println("Sunday");
        } else if (numberDay == 2){
          System.out.println("Monday");
        } else if (numberDay == 3){
          System.out.println("Tuesday");
        } else if (numberDay == 4){
          System.out.println("Wednesday");
        } else if (numberDay == 5){
            System.out.println("Thursday");
        } else if (numberDay == 6){
            System.out.println("Friday");
        } else if (numberDay == 7){
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid input");
        }

    }

//




}
