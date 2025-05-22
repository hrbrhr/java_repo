package org.javaguru.student_aleksey_volokitin.lesson_5_plus_methods.lessoncode_plus.task_6_plus;

public class TriangleAreaApp {
    public static void main(String[] args) {
        TriangleArea triangleCalc = new TriangleArea();
        int a = 6;
        int b = 5;
        int c = 2;

        double triangleArea = triangleCalc.calculateArea(a, b, c);
        System.out.println("Sides of triangle: " + a + ", " + b + ", " + c);
        System.out.println("Triangle area: " + triangleArea + "\n");

        a = 3;
        b = 4;
        c = 5;

        triangleArea = triangleCalc.calculateArea(a, b, c);
        System.out.println("Sides of triangle: " + a + ", " + b + ", " + c);
        System.out.println("Triangle area: " + triangleArea + "\n");

        a = 1;
        b = 20;
        c = 20;

        triangleArea = triangleCalc.calculateArea(a, b, c);
        System.out.println("Sides of triangle: " + a + ", " + b + ", " + c);
        System.out.println("Triangle area: " + triangleArea + "\n");
    }
}
