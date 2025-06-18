package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.lessoncode.test_inheritance_car;

/*
Наследование переменных
*/

class Vehicle {
    private double maxSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void speedUp() {
        this.maxSpeed = maxSpeed + 10;
    }

    public void weightUp() {

    }
    public void enginePowerUp(int newPower){

    }
}