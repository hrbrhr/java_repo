package org.javaguru.student_evgenii_pashtaev.lesson_4.level_1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if ((number%2) == 0){
            System.out.println("Even");
        }
        if ((number%2) != 0){
            System.out.println("Odd");
        }
    }
}
