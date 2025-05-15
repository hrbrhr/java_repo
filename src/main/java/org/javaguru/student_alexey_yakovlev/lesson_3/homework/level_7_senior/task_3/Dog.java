package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_7_senior.task_3;

class Dog {

    private String nickname;
    private int age;

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    void giveVoice() {
        System.out.println("My nickname is " + nickname);
    }

    int celebrateBirthday() {
        return age + 1;
    }

    void tellAge() {
        System.out.println(age);
    }
}
