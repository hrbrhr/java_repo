package org.javaguru.student_evgenii_pashtaev.lesson_5.level_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(devTree(number));
        System.out.println(devFive(number));
        System.out.println(devTreeFive(number));
        System.out.println(notDev(number));



    }

    static String devTree(int number) {
        if ((number % 3) == 0) {
            return "Fizz";
        }
        return null;
    }

    static String devFive(int number){
        if (number%5 == 0){
            return "Buzz";
        }
        return null;
    }
    static String devTreeFive(int number){
        if (number%3 == 0 && number%5 == 0){
            return "FizzBuzz";
        }
        return null;
    }

    static String notDev(int number){
        if (number%3 != 0 && number%5 !=0){
            return "" + number;
        }
        return "";
    }

}
