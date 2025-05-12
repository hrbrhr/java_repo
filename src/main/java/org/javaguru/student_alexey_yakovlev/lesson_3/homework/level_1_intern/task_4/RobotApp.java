package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_1_intern.task_4;

class RobotApp {

    public static void main(String[] args) {
        Robot robot = new Robot("Optimus", "Jazz");

        System.out.println(robot.getName1());
        System.out.println(robot.getName2());

        robot.setName1("Infinity");
        robot.setName2("Space");

        System.out.println(robot.getName1());
        System.out.println(robot.getName2());
    }

}
