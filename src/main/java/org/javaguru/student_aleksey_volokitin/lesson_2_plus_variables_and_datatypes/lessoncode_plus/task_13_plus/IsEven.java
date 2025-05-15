package org.javaguru.student_aleksey_volokitin.lesson_2_plus_variables_and_datatypes.lessoncode_plus.task_13_plus;

import java.util.Scanner;

class IsEven {
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
