package org.javaguru.student_vitalii_lutsenko.lesson_2.llevel_3;

import java.util.Scanner;

class Multiplication_table {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what number will be studied?");
        int number = scanner.nextInt();

        int result1 = number * 1;
        System.out.println( number + " x 1 = " + result1);
        int result2 = number * 2;
        System.out.println( number + " x 2 = " + result2);
        int result3 = number * 3;
        System.out.println( number + " x 3 = " + result3);
        int result4 = number * 4;
        System.out.println( number + " x 4 = " + result4);
        int result5 = number * 5;
        System.out.println( number + " x 5 = " + result5);
        int result6 = number * 6;
        System.out.println( number + " x 6 = " + result6);
        int result7 = number * 7;
        System.out.println( number + " x 7 = " + result7);
        int result8 = number * 8;
        System.out.println( number + " x 8 = " + result8);
        int result9 = number * 9;
        System.out.println( number + " x 9 = " + result9);

        System.out.println("Ask me again!");



    }



}
