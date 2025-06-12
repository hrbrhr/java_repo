package org.javaguru.student_evgenii_pashtaev.lesson_5.level_1;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(devThree(number));
        System.out.println(devFive(number));
        System.out.println(devThreeFive(number));
        System.out.println(notDev(number));



    }

    static String devThree(int number) {
        if ((number % 3) == 0) {
            return "Fizz";
        }
        return "";
    }

    static String devFive(int number){
        if (number%5 == 0){
            return "Buzz";
        }
        return "";
    }
    static String devThreeFive(int number){
        if (number%3 == 0 && number%5 == 0){
            return "FizzBuzz";
        }
        return "";
    }

    static String notDev(int number){
        if (number%3 != 0 && number%5 !=0){
            return "" + number;
        }
        return "";
    }

}
