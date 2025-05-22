package org.javaguru.student_alexey_yakovlev.lesson_4.homework.level_5_middle.task_1;

import java.util.Scanner;

class Commission {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму для снятия наличных: ");
        int sum = scanner.nextInt();

        int result = 0;

        if (sum < 1000) {
            result = (sum * 3 ) / 100;
            System.out.println("Комиссия составляет = " + result + " условные единицы");
        } else if (sum >= 1000 && sum < 5000) {
            result = (sum * 4) / 100;
            System.out.println("Комиссия составляет = " + result + " условные единицы");
        } else {
            result = (sum * 5) / 100;
            System.out.println("Комиссия составляет = " + result + " условные единицы");
        }
    }
}
