package org.javaguru.student_vitalii_lutsenko.lesson_3.homework.level_3;

import java.util.Scanner;

class ThreeNumbersMax {

   // private static int max(int number1, int number2) {

        //return (number1 > number2) ? number1 : number2;
   // }

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter number1: ");
        int a = scanner.nextInt();
        System.out.print("Enter number2: ");
        int b = scanner.nextInt();
        System.out.print("Enter number3: ");
        int c = scanner.nextInt();

        //int maxNumber = max(number1,number2);
       // maxNumber = max(maxNumber,number3);

        //System.out.println("Max number = " + maxNumber);
        int max;

        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println("Max number from three = " + max);



    }
}
