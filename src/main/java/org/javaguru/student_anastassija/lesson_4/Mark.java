package org.javaguru.student_anastassija.lesson_4;

import java.util.Scanner;

public class Mark {
//A для 90-100, B для 80-89, C для 70-79, D для 60-69 и F для 0-59
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter mark:");
        int mark = scanner1.nextInt();

        //int mark = 7;
        if ((mark >= 90) && (mark <= 100)) {
            System.out.println("A");
        } else if ((mark >= 80) && (mark <= 89)) {
            System.out.println("B");
        } else if ((mark >= 70) && (mark <= 79)) {
            System.out.println("C");
        } else if ((mark >= 60) && (mark <= 69)) {
            System.out.println("D");
        } else if ((mark >= 0) && (mark <= 59)) {
            System.out.println("F");
        }


    }
}
