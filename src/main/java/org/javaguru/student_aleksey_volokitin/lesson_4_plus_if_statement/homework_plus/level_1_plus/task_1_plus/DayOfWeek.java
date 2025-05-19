package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework_plus.level_1_plus.task_1_plus;

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        System.out.print("Enter a day of week: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfDay = scanner.nextInt();

        if(numberOfDay == 1){
            System.out.println("Monday");
        }
        if(numberOfDay == 2){
            System.out.println("Tuesday");
        }
        if(numberOfDay == 3){
            System.out.println("Wednesday");
        }
        if(numberOfDay == 4){
            System.out.println("Thursday");
        }
        if(numberOfDay == 5){
            System.out.println("Friday");
        }
        if(numberOfDay == 6){
            System.out.println("Saturday");
        }
        if(numberOfDay == 7){
            System.out.println("Sunday");
        }
        if((numberOfDay < 1) || (numberOfDay > 7)){
            System.out.println("Enter correct number day of week!");
        }
        scanner.close();
    }
}

