package org.javaguru.student_anastassija.lesson_2.level_3.task2;

import java.util.Scanner;

public class CircleRadius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a radius of the circle: ");

        // Чтобы программа принимала и запятую ,, и точку . как десятичный разделитель
        String input = scanner.nextLine().replace(",", ".");
        double radius = Double.parseDouble(input);

        System.out.println("Perimeter is " + 2 * Math.PI * radius);
        System.out.println("Area is " + Math.PI * radius * radius);

    }



}
