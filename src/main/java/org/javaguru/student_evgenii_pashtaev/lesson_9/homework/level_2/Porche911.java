package org.javaguru.student_evgenii_pashtaev.lesson_9.homework.level_2;

class Porche911 extends Car {
    private int topSpeed ;

    public Porche911(int releaseYear, int topSpeed) {
        super(releaseYear);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return this.topSpeed;
    }
}
