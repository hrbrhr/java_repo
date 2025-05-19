package org.javaguru.student_evgenii_pashtaev.lesson_3.level_4;
import java.util.Scanner;

class Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if ((number <= 100) && ( number >= 90)){
            System.out.println("A mark");
        }
        if ((number <= 89) && ( number >= 80)){
            System.out.println("B mark");
        }
        if ((number <= 79) && ( number >= 70)){
            System.out.println("C mark");
        }
        if ((number <= 69) && ( number >= 60)){
            System.out.println("D mark");
        }
        if ((number <= 59) && ( number >= 50)){
            System.out.println("E mark");
        }
        if ((number <= 49) && ( number >= 0)){
            System.out.println("F mark");
        }
    }
}
