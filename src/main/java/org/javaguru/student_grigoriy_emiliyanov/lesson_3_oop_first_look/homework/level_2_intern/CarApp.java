package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.homework.level_2_intern;

public class CarApp {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "black", 120000);
        Car toyota = new Car("Toyota", "white", 321341);
        Car lada = new Car("Lada", "cherry", 1234);

        System.out.println(bmw);
        System.out.println();
        System.out.println(toyota);
        System.out.println();
        System.out.println(lada);
        System.out.println();

        bmw.setColor("green");
        bmw.setPrice(20000);
        System.out.println(bmw);
    }
}
