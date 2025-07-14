package org.javaguru.student_evgeniy_shendelev.lesson_4.homework.level_6.task_3;

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 7, чтобы узнать название дня недели");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1 -> System.out.println("Первый день - Понедельник");
            case 2 -> System.out.println("Второй день - Вторник");
            case 3 -> System.out.println("Третий день - Среда");
            case 4 -> System.out.println("Четвертый день - Четверг");
            case 5 -> System.out.println("Пятый день - Пятница");
            case 6 -> System.out.println("Шестой день - Суббота");
            case 7 -> System.out.println("Седьмой - Воскресенье");
            default -> System.out.println("Вы ввели не верное число. Начните программу заново");
        }
    }
}
