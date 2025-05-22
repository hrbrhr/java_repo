package org.javaguru.student_elena_tiutiunnikova.lesson_4.homework.level_1_intern;

import java.util.Scanner;

class Week {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите порядкой номер дня недели: ");
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Понедельник");
        } else if (number == 2) {
            System.out.println("Вторник");
        } else if (number == 3) {
            System.out.println("Среда");
        } else if (number == 4) {
            System.out.println("Четверг");
        } else if (number == 5) {
            System.out.println("Пятница");
        } else if (number == 6) {
            System.out.println("Суббота");
        } else if (number == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Дня недели с таким порядковым номером не существует!");
        }

    }
}
