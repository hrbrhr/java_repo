package org.javaguru.student_evgeniy_shendelev.lesson_4.homework.level_1.task_1;

import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 7, чтобы узнать название дня недели");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0 && num < 8) {
            if (num == 1) {
                System.out.println("Первый день - Понедельник");
            }
            if (num == 2) {
                System.out.println("Второй день - Вторник");
            }
            if (num == 3) {
                System.out.println("Третий день - Среда");
            }
            if (num == 4) {
                System.out.println("Четвертый день - Четверг");
            }
            if (num == 5) {
                System.out.println("Пятый день - Пятница");
            }
            if (num == 6) {
                System.out.println("Шестой день - Суббота");
            }
            if (num == 7) {
                System.out.println("Седьмой - Воскресенье");
            }
        } else {
            System.out.println("Вы ввели не верное число. Начните программу заново");
        }
    }
}
