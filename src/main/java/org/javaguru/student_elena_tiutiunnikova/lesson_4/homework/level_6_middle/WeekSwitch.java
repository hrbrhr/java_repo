package org.javaguru.student_elena_tiutiunnikova.lesson_4.homework.level_6_middle;

import java.util.Scanner;

class WeekSwitch {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели (от 1 до 7): ");
        int day = scanner1.nextInt();

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;

            default:
                System.out.println("Дня недели с таким порядковым номером не существует!");
        }
    }
}
