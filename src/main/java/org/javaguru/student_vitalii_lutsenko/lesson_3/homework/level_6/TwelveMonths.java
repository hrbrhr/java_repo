package org.javaguru.student_vitalii_lutsenko.lesson_3.homework.level_6;

import java.util.Scanner;

class TwelveMonths {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter month number: ");
         int months = scanner.nextInt();

         switch (months) {
             case 1,2,12:
             System.out.println("Winter!");
             break;
             case 3,4,5:
             System.out.println("Spring!");
             break;
             case 6,7,8:
             System.out.println("Summer!");
             break;
             case 9,10,11:
             System.out.println("Autumn");
             break;
             default:
             System.out.println("Invalid input");

         }
     }
}
