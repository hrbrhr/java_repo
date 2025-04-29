package org.javaguru.student_aleksey_volokitin.lesson_2_variables_and_datatypes.homework.level_3_plus.task_2_plus;

import java.util.Locale;
import java.util.Scanner;

class CalculatePerimeterAndArea {
    public static void main(String[] args) {
        System.out.print("Input a radius: ");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double radius = scanner.nextDouble();

        double perimeter = (radius + radius) * Math.PI;
        System.out.println("Perimeter is: " + perimeter);

        double area = radius * radius * Math.PI;
        System.out.println("Area is: " + area);
    }
}
