package org.javaguru.student_pavel_gorev.lesson_3.level_7.task3;

class Dog {

    private String nickname;
    private int age;

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String voice() {
        return "My nickname is " + nickname;
    }

    public void celebrateBirthday() {
        age++;
    }

    public int getAge() {
        return age;
    }
}

