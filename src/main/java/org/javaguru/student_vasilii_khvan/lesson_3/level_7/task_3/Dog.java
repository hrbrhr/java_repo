package org.javaguru.student_vasilii_khvan.lesson_3.level_7.task_3;

class Dog {

    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String barkCommand() {
        return "My nickname is " + name;
    }

    void birthDay() {
        age += 1;
    }

    int getAge() {
        return age;
    }
}
