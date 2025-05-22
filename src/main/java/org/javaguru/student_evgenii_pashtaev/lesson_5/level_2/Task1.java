package org.javaguru.student_evgenii_pashtaev.lesson_5.level_2;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println(choice(year));
    }

    static String choice(int year){

        if (year % 4 == 0 && year % 100 != 0){
            return "High-axis";
        }
        else {
            return "Not high-axis";
        }
    }

}
