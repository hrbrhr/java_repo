package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.homework_plus.level_7_plus.task_1_plus;

import java.util.Locale;
import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {
        System.out.print("Input a radius: ");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        double circleArea = circle.calculateArea();
        System.out.println("Circle area is: " + circleArea);
        scanner.close();
    }
}
