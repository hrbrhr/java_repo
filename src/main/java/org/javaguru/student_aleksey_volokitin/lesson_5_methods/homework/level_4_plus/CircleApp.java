package org.javaguru.student_aleksey_volokitin.lesson_5_methods.homework.level_4_plus;

import java.util.Locale;
import java.util.Scanner;

class CircleApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter a radius of circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle();
        System.out.println("Perimeter of circle is: " + circle.calculatePerimeter(radius));
        System.out.println("Area of circle is: " + circle.calculateArea(radius));
    }
}
