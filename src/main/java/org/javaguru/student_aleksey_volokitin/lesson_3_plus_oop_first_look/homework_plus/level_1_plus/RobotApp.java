package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.homework_plus.level_1_plus;

class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Valli");
        Robot robot2 = new Robot("Eva");

        System.out.println(robot1.getName());
        System.out.println(robot2.getName() + "\n");

        robot1.setName("New Valli");
        robot2.setName("New Eva");

        System.out.println(robot1.getName());
        System.out.println(robot2.getName());
    }
}
