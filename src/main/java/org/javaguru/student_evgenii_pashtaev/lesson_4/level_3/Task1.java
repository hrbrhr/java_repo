package org.javaguru.student_evgenii_pashtaev.lesson_4.level_3;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree){
            System.out.println("Number one is maximum");
        }
        if (numberTwo > numberOne && numberTwo > numberThree){
            System.out.println("Number two is maximum");
        }
        if (numberThree > numberOne && numberThree > numberTwo){
            System.out.println("Number three is maximum");
        }
    }
}
