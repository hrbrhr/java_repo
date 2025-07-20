package org.javaguru.student_vasilii_khvan.lesson_3.level_1;

class RobotApp {

    public static void main(String[] args) {
        Robot t800 = new Robot("T800");
        Robot t1000 = new Robot("t1000");
        System.out.println(t800.getName());
        System.out.println(t1000.getName());

        System.out.println();

        t800.setName("Arnold Schwarzenegger");
        t1000.setName("Robert Patrick");
        System.out.println(t800.getName());
        System.out.println(t1000.getName());
    }
}
