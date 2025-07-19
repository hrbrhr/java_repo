package org.javaguru.student_vasilii_khvan.lesson_2.homework.level_3;

import java.util.Scanner;

class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius = ");
        double r = scanner.nextDouble();
        System.out.println("Perimeter is = " + 2 * Math.PI * r);
        System.out.println("Area is = " + Math.PI * (r * r));
        //π * r²
    }
}
