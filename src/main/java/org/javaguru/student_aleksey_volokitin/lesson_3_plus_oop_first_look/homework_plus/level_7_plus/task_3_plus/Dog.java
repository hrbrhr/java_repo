package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.homework_plus.level_7_plus.task_3_plus;

class Dog {
    private String dogName;
    private int dogAge;

    Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    String dogVoice() {
        return "My nickname is: " + this.dogName;
    }

    int age() {
        return this.dogAge;
    }

    void dogBirthday() {
        this.dogAge = this.dogAge + 1;
    }
}
