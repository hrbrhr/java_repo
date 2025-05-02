package org.javaguru.student_artjoms_babicevs.lesson_2.Level_3.Task_2;

import java.util.Scanner;

class Circle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius: ");
        double radius = scanner.nextDouble();

        double circleArea = Math.PI + radius * radius;
        System.out.println("Circle area = " + circleArea);

        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter = " + circlePerimeter);
    }

}
