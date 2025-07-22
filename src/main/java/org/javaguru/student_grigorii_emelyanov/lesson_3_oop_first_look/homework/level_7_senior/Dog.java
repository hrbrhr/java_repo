package org.javaguru.student_grigorii_emelyanov.lesson_3_oop_first_look.homework.level_7_senior;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String bark() {
        return "My name is " + nickname;
    }

    public int getAge() {
        return age;
    }

    public void birthday() {
        age++;
    }
}
