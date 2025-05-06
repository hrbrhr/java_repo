package org.javaguru.student_aleksey_volokitin.lesson_2_variables_and_datatypes.homework_plus.level_3_plus.task_1_plus;

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String outputString = number + " x 1 = " + number * 1;
        System.out.println(outputString);
        outputString = number + " x 2 = " + number * 2;
        System.out.println(outputString);
        outputString = number + " x 3 = " + number * 3;
        System.out.println(outputString);
        outputString = number + " x 4 = " + number * 4;
        System.out.println(outputString);
        outputString = number + " x 5 = " + number * 5;
        System.out.println(outputString);
        outputString = number + " x 6 = " + number * 6;
        System.out.println(outputString);
        outputString = number + " x 7 = " + number * 7;
        System.out.println(outputString);
        outputString = number + " x 8 = " + number * 8;
        System.out.println(outputString);
        outputString = number + " x 9 = " + number * 9;
        System.out.println(outputString);
        outputString = number + " x 10 = " + number * 10;
        System.out.println(outputString);
        scanner.close();
    }
}
