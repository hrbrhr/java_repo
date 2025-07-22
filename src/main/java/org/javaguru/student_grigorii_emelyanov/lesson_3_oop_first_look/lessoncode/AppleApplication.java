package org.javaguru.student_grigorii_emelyanov.lesson_3_oop_first_look.lessoncode;

import java.util.Scanner;

public class AppleApplication {
    public static void main(String[] args) {
        Apple apple1 = new Apple("antonovka", "red", 123);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter apple type: ");
        String type = scanner.nextLine();
        System.out.print("Enter apple color: ");
        String color = scanner.nextLine();
        System.out.print("Enter apple weight in grams: ");
        int weight = Integer.parseInt(scanner.nextLine());
        Apple userApple = new Apple(type, color, weight);
        System.out.println("User apple:");
        System.out.println("type: " + userApple.getType());
        System.out.println("color: " + userApple.getColor());
        System.out.println("weight: " + userApple.getWeight());
    }
}
