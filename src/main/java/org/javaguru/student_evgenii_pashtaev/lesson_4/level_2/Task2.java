package org.javaguru.student_evgenii_pashtaev.lesson_4.level_2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();

        if (numberOne < numberTwo){
            System.out.println("Number one small better");
        }
        else {
            System.out.println("Number two small better");
        }
    }
}
