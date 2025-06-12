package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_3_plus.task_5_plus;

class ElectricCar extends Car {

    private int batteryCharge;

    public ElectricCar(String model, int startBatteryCharge) {
        super(model);
        this.batteryCharge = startBatteryCharge;
    }
    public void accelerate() {
        batteryCharge -= 1;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }
}
