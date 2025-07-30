package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.homework.day_2;

class Porsche911 extends Car {

    private int topSpeed;

    // создайте конструктор

    Porsche911() {
        super(1234);
    }
    Porsche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }
}
