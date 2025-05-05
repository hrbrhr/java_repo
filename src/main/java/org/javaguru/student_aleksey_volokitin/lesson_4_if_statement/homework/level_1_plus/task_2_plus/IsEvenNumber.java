package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework.level_1_plus.task_2_plus;

import java.util.Scanner;

public class IsEvenNumber {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
