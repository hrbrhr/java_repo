package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_1;

public class RobotApp {

    public static void main (String [] args) {

        Robot Robot1 = new Robot("Fill");
        Robot Robot2 = new Robot("Alice");


        String name1 = Robot1.getName();
        String name2 = Robot2.getName();
        System.out.println("Name Robot 1 " + name1);
        System.out.println("Name Robot 2 " + name2);

        Robot1.setName("Sam");
        Robot2.setName("Kate");

        System.out.println("Name Robot 1 " + Robot1.getName());
        System.out.println("Name Robot 2 " + Robot2.getName());
    }
}
