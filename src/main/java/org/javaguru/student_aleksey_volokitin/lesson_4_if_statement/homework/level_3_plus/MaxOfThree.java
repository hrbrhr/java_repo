package org.javaguru.student_aleksey_volokitin.lesson_4_if_statement.homework.level_3_plus;

import java.util.Scanner;

class MaxOfThree
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter a third number: ");
        int number3 = scanner.nextInt();

        // все равны
        if ((number1 == number2) && (number1 == number3)){
            System.out.println("The numbers are equal");
        }
        // 1 = 2 и > 3
        if ((number1 == number2) && (number1 > number3)){
            System.out.println("The numbers 1 and 2 greater than number 3");
        }
        // 2 = 3 и > 1
        if ((number2 == number3) && (number2 > number1)){
            System.out.println("The numbers 2 and 3 greater than number 1");
        }
        // 1 = 3 и > 2
        if ((number1 == number3) && (number1 > number2)){
            System.out.println("The numbers 1 and 3 greater than number 2");
        }
        //  1   1   2   2   3   3
        //  2   3   1   3   1   2
        //  3   2   3   1   2   1
        if (number1 > number2){                             //  3   5   6
            if (number1 > number3) {                        //              5   6
                System.out.println("The number 1 is max");
            }
            else if (number3 > number2){                    //              3
                System.out.println("The number 3 is max");
            }
        }
        else if (number2 > number1){                        //  1   2   4
            if (number2 > number3){                         //              2   4
                System.out.println("The number 2 is max");
            }
            else if (number3 > number2){                    //              1
                System.out.println("The number 3 is max");
            }
        }
        scanner.close();
    }
}
