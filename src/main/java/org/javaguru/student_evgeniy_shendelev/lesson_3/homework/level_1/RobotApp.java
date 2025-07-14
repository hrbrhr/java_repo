package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_1;

class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Max");
        Robot robot2 = new Robot("Rick");

        System.out.println("Имена роботов до изменения: " + robot1.getName() + " и " + robot2.getName());

        robot1.setName("Maximus");
        robot2.setName("Genius");

        System.out.println("Имена роботов после изменения: " + robot1.getName() + " и " + robot2.getName());
    }
}
