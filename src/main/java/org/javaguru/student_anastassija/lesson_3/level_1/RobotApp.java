package org.javaguru.student_anastassija.lesson_3.level_1;

public class RobotApp {

    public static void main(String[] args) {

        Robot robot_one = new Robot("Kostja");
        Robot robot_two = new Robot("Petja");

        System.out.println("First robot name: " + robot_one.getName());
        System.out.println("Second robot name: " + robot_two.getName());

        robot_one.setName("Madis");
        robot_two.setName("Siim");

        System.out.println("First robot name: " + robot_one.getName());
        System.out.println("Second robot name: " + robot_two.getName());
    }


}
