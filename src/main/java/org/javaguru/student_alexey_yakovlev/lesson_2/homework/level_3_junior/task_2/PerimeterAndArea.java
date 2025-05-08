package org.javaguru.student_alexey_yakovlev.lesson_2.homework.level_3_junior.task_2;

import java.util.Scanner;

class PerimeterAndArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");

        double radius = scanner.nextDouble();

        System.out.println("Perimeter is = " + (2 * Math.PI * radius));
        System.out.println("Area is = " + (Math.PI * radius * radius));
    }
}
