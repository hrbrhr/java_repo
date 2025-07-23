package org.javaguru.student_grigoriy_emiliyanov.lesson_5_methods.lessoncode;

public class TriangleAreaApp {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 5;
        TriangleArea triangleArea = new TriangleArea();
        double area =  triangleArea.calculate(a, b, c);
        System.out.println("area is: " + area);
        double expectedArea = 3.8;
        double epsilon = 0.01;
        if (Math.abs(area - expectedArea) < epsilon) {
            System.out.println("TEST OK");
        } else {
            System.out.println("TEST NOK");
        }
    }
}
