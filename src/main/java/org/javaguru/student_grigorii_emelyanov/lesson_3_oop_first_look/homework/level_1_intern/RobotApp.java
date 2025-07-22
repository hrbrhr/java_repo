package org.javaguru.student_grigorii_emelyanov.lesson_3_oop_first_look.homework.level_1_intern;

public class RobotApp {
    public static void main(String[] args) {
        Robot vanya = new Robot("Vania");
        Robot vasya = new Robot("Vasya");

        System.out.println("My name is: " + vanya.getName());
        System.out.println("My name is: " + vasya.getName());

        vanya.setName("Ivan");
        vasya.setName("Vasilii");
        System.out.println("My name now is: " + vanya.getName());
        System.out.println("My name now is: " + vasya.getName());
    }
}
