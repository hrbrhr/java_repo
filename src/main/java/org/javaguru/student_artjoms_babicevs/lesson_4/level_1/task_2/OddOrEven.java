package org.javaguru.student_artjoms_babicevs.lesson_4.level_1.task_2;

import java.util.Scanner;

public class OddOrEven {

public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the number: ");
     int number = scanner.nextInt();

     if (number % 2 == 0){
         System.out.println("Odd number.");
     } else {
         System.out.println("Even number.");
     }
  }




}
