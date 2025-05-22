package org.javaguru.student_alexey_yakovlev.lesson_4.homework.level_1_intern.task_2;

import java.util.Scanner;

class EvenNumberApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvenNumber evenNumber = new EvenNumber();
        System.out.print("Введите целое число: ");

        int number = scanner.nextInt();

       boolean result = evenNumber.isEven(number);

       if (result) {
           System.out.printf("Число %d четное", number);
       } else {
           System.out.printf("Число %d нечетное", number);
       }
    }
}
