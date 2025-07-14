package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_7.task_3;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void bark() {
        System.out.println("My name is " + name);
    }

    void celebrateBirthday() {
        System.out.println("Happy Birthday, " + name);
        age++;
    }

    void howOldAreYou() {
        System.out.println("My age is " + age);
    }
}
