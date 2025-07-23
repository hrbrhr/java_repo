package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

public class LaptopApplication {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("IBM", 1234);
        Laptop laptop2 = new Laptop("DELL", 4321);

        System.out.println("Laptop 1: ");
        System.out.println("Model: " + laptop1.getModel());
        System.out.println("Price: " + laptop1.getPrice());
        System.out.println();
        System.out.println("Laptop 2: ");
        System.out.println("Model: " + laptop2.getModel());
        System.out.println("Price: " + laptop2.getPrice());
    }
}
