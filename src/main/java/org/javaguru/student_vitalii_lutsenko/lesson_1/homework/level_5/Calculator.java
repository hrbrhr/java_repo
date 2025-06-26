package org.javaguru.student_vitalii_lutsenko.lesson_1.homework.level_5;

import java.util.Scanner;

class Calculator {

        public static void main(String[]args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number1: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter number2: ");
            int number2 = scanner.nextInt();



            int result = number1 + number2;
            System.out.println("Sum+ " + result);

            result = number1 - number2;
            System.out.println("Subst- " + result);

            result = number1 * number2;
            System.out.println("Mutiply* " + result);

            result = number1 / number2;
            System.out.println("Divie/ = "+ result);








        }




}
