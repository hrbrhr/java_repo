package org.javaguru.student_oleg_levashov.lesson_2.homework.level_3;

import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number:");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {

            int res = num * i;

            System.out.println(num + " x " + i + " = " + res);


        }
    }
}
