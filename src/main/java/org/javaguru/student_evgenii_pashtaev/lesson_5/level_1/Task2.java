package org.javaguru.student_evgenii_pashtaev.lesson_5.level_1;

import java.util.Scanner;

class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(colorPick(number));

    }

    static String colorPick (int number){
         if(number >= 380 && number <= 449){
             return "Violet";
         }
         if(number >= 450  && number <= 494){
            return "Blue";
         }
         if(number >=495 && number <= 569){
             return "Green";
         }
         if (number >= 570 && number <= 589){
             return "Yellow";
         }
         if (number >= 590 && number <= 619){
             return "Orange";
         }
         if (number >= 620 && number <= 750){
             return "Red";
         }
         else {
             return "Invisible Light";
         }
    }
}
