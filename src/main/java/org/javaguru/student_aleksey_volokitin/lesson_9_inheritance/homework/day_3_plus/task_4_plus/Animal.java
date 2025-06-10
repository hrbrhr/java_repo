package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_3_plus.task_4_plus;

abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void getVoice();
}
