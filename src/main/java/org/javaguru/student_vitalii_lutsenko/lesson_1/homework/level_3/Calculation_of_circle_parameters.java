package org.javaguru.student_vitalii_lutsenko.lesson_1.homework.level_3;

import java.util.Scanner;

 class Calculation_of_circle_parameters {

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi,mathematician!\n Enter the radius of the circle you want to calculate? ");

        double radius = scanner.nextDouble();

        double Perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is = " + Perimeter);

        double Area = Math.PI * (radius * radius);
        System.out.println("Area is = " + Area);

        //Plosad' S=pi*r2 ; Perimetr C=2pi*r;

    }
 }
