package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.lessoncode.test_inheritance_phone;

abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year) {
        this.year = year;
    }
    public abstract void call(int outputNumber);
    public abstract void ring (int inputNumber);
}
