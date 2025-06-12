package org.javaguru.student_artjoms_babicevs.lesson_4.level_5;

import java.util.Scanner;


 class CreditCardCommission {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the withdrawal amount:");
         double amount = scanner.nextDouble();
         double commission;

         if (amount < 1000) {
             commission = amount * 0.03;
         } else if (amount < 5000) {
             commission = amount * 0.04;
         } else {
             commission = amount * 0.05;
         }

    System.out.println("Commission for withdrawal = " + commission);
   }
  }

