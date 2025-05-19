package org.javaguru.student_elena_tiutiunnikova.lesson_4.lessoncode;

import java.util.Scanner;

class IsPositiveNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
                boolean isPositive = number > 0;

                if (number > 0 ){
                    System.out.println("Number is positive!");
                }

    }

}
