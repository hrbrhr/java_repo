package org.javaguru.student_grigorii_emelyanov.lesson_3_oop_first_look.homework.level_7_senior;

public class DogDemo {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 0);

        System.out.println(rex.bark());

        rex.birthday();
        rex.birthday();
        System.out.println(rex.getAge());
    }
}
