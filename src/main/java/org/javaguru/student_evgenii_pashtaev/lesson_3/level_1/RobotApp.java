package org.javaguru.student_evgenii_pashtaev.lesson_3.level_1;

public class RobotApp {

    public static void main(String[] args) {
        Robot robotOne = new Robot("Maikl");
        Robot robotTwo = new Robot("Anna");
        System.out.println(robotTwo.getName() + " " + robotOne.getName());
        robotOne.setName("Bob");
        System.out.println(robotOne.name);
    }
}
