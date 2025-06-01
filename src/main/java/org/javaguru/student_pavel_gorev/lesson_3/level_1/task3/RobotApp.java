package org.javaguru.student_pavel_gorev.lesson_3.level_1.task3;

class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Альфа");
        Robot robot2 = new Robot("Бета");

        System.out.println("Robot 1 name = " + robot1.get());
        System.out.println("Robot 2 name = " + robot2.get());
    }
}
