package org.javaguru.student_oleg_levashov.lesson_3.homework.level_1;

class RobotApp {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Robot_1");
        Robot robot2 = new Robot("Robot_2");

        System.out.println("Имя первого робота: " + robot1.getName());
        System.out.println("Имя второго робота: " + robot2.getName());

        robot1.setName("Qwerty");
        robot2.setName("Asdfgh");

        System.out.println("Имя первого робота: " + robot1.getName());
        System.out.println("Имя второго робота: " + robot2.getName());

    }
}
