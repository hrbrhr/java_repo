package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance.homework.day_3_plus.task_5_plus;

class CarDemo {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Zeekr", 100);
        PetrolCar petrolCar = new PetrolCar("BMW", 65);

        System.out.println(electricCar.getModel() + ", battery charge: " + electricCar.getBatteryCharge());
        System.out.println(petrolCar.getModel() + ", tank capacity: " + petrolCar.getPetrolTankCapacity());
        System.out.println(" ");
        electricCar.accelerate();
        electricCar.accelerate();
        electricCar.accelerate();
        petrolCar.accelerate();
        petrolCar.accelerate();
        petrolCar.accelerate();
        System.out.println(electricCar.getModel() + ", battery charge: " + electricCar.getBatteryCharge());
        System.out.println(petrolCar.getModel() + ", tank capacity: " + petrolCar.getPetrolTankCapacity());
    }


}
