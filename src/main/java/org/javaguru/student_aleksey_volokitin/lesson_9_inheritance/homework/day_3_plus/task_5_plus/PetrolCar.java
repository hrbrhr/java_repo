package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_3_plus.task_5_plus;

class PetrolCar extends Car {

    private double petrolTankCapacity;

    public PetrolCar(String model, double startTankCapacity) {
        super(model);
        this.petrolTankCapacity = startTankCapacity;
    }
    public void accelerate() {
        petrolTankCapacity -= 1.5;
    }

    public double getPetrolTankCapacity() {
        return petrolTankCapacity;
    }
}
