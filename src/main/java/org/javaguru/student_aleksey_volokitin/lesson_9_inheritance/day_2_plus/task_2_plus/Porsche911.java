package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.day_2_plus.task_2_plus;

class Porsche911 extends Car {

    private int topSpeed;

    public Porsche911(String color, int releaseYear, int topSpeed) {
        super(color, releaseYear);

        this.topSpeed = topSpeed;
    }

}