package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_7_senior;

import java.util.Scanner;

class CircleDemo {
    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        double calculateArea = circle1.getRadius() * circle1.getRadius() * Math.PI;

        System.out.println("Площадь круга составялет: " + calculateArea);

    }

}
