package org.javaguru.student_grigorii_emelyanov.lesson_5_methods.lessoncode.tasks;

import java.util.Scanner;

//Напишите метод для запроса целого числа у пользователя через консоль.
//
//Напишите два варианта метода:
//        - с дефолтной текстовой подсказкой "Please, enter the number: ";
//        - с текстовой подсказкой, которую можно менять (передавая ее через
//        параметр метода).
//
//Продемонстрируйте использование вашего решения на нескольких примерах.
class TipInputDemo {
    public static void main(String[] args) {
        getNumberWithTip();
        System.out.println();
        getNumberWithTip("Think twice, then input your number: ");
    }

    static void getNumberWithTip(String text)  {
        System.out.println(text);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("You number was: " + number);
    }

    static void getNumberWithTip() {
        System.out.println("Please, enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("You number was: " + number);
    }
}
