package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.lessoncode.test_inheritance_car;

public class ElectricCar extends Car {
    //double maxSpeed;
    //int wheelCount;
    //double weight;
    private int electricEnginePower;

    public ElectricCar(double maxSpeed, int wheelCount, double weight, int electricEnginePower) {
        super(maxSpeed, wheelCount, weight);
        this.electricEnginePower = electricEnginePower;
    }

    public int getElectricEnginePower() {
        return electricEnginePower;
    }

    public void setElectricEnginePower(int electricEnginePower) {
        this.electricEnginePower = electricEnginePower;
    }

    @Override
    public void speedUp() {
        double newMaxSpeed = this.getMaxSpeed() + 10;
        this.setMaxSpeed(newMaxSpeed);
    }

    @Override
    public void enginePowerUp(int newPower) {
        this.electricEnginePower = newPower;
    }

    @Override
    public String toString() {
        return "Max speed: " + this.getMaxSpeed() +
                           ", wheel count: " + this.getWheelCount() +
                           ", weight: " + this.getWeight() +
                           ", engine power: " + this.electricEnginePower;
    }
}
