package org.javaguru.student_alexey_yakovlev.lesson_4.lessoncode;

import java.util.Scanner;

class Grade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку студента от 0 до 100: ");

        int mark = scanner.nextInt();

        if ((mark >= 90) && (mark <= 100)) {
            System.out.println("Оценка A");
        } else if ((mark >= 80) && (mark <= 89)) {
            System.out.println("Оценка B");
        } else if ((mark >= 70) && (mark <= 79)) {
            System.out.println("Оценка C");
        } else if ((mark >= 60) && (mark <= 69)) {
            System.out.println("Оценка D");
        } else if ((mark >= 0) && (mark <= 59)) {
            System.out.println("Оценка F");
        }

    }
}
