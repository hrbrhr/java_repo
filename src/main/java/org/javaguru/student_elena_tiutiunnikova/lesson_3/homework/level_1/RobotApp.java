package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_1;

public class RobotApp {

    public static void main (String [] args) {

        Robot robot1 = new Robot("Fill");
        Robot robot2 = new Robot("Alice");


        String name1 = robot1.getName();
        String name2 = robot2.getName();
        System.out.println("Name Robot 1 " + name1);
        System.out.println("Name Robot 2 " + name2);

        robot1.setName("Sam");
        robot2.setName("Kate");

        System.out.println("Name Robot 1 " + robot1.getName());
        System.out.println("Name Robot 2 " + robot2.getName());
    }
}
