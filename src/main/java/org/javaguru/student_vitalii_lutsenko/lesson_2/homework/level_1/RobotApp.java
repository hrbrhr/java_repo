package org.javaguru.student_vitalii_lutsenko.lesson_2.homework.level_1;

public class RobotApp {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Niger");
        Robot robot2 = new Robot("Tiger");

        String name1 = robot1.getName();
        String name2 = robot2.getName();

        System.out.println("A robot1 named -" + name1);
        System.out.println("A robot2 named -" + name2);

        robot1.setName("Boss");
        robot2.setName("Cat");

        System.out.println("A robot1 renamed -" + robot1.getName());
        System.out.println("A robot2 renamed -" + robot2.getName());

    }


}
