package org.javaguru.student_elena_tiutiunnikova.lesson_4.lessoncode;

import java.util.Scanner;

class NoRangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();

        //диапазон от 5 до 25
        if ((number<=5)||(number>=25)) {
            System.out.println("Число НЕ попадает в диапазон (5-25)!");
        } else {System.out.println("Число попадает в диапазон (5-25)!");

        }

    }
}
