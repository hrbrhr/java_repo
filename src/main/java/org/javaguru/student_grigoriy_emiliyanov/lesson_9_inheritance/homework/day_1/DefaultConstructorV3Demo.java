package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.homework.day_1;

public class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();
        System.out.println("Default properties values:");
        System.out.println("int type: " + defaultConstructorV3.getAge());
        System.out.println("String type: " + defaultConstructorV3.getFullName());
        System.out.println("Boolean type: " + defaultConstructorV3.getFemale());
        System.out.println("boolean type: " + defaultConstructorV3.isMale());
    }
}
