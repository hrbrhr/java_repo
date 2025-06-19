package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.lessoncode.test_inheritance_car;

class Car extends Vehicle {
    //double maxSpeed;
    private int wheelCount;
    private double weight;

    public Car(double maxSpeed, int wheelCount, double weight) {
        super(maxSpeed);
        this.wheelCount = wheelCount;
        this.weight = weight;
    }

    public int getWheelCount() {
        return wheelCount;
    }
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void weightUp() {
        this.weight += 10;
    }

}
