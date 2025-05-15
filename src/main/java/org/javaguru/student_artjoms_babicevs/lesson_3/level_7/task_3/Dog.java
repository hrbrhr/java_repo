package org.javaguru.student_artjoms_babicevs.lesson_3.level_7.task_3;

public class Dog {

    private String nickname;
    private int age;

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String bark() {
        return "My nickname is " + nickname + ".";
    }

    public void haveBirthday() {
        age++;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

}