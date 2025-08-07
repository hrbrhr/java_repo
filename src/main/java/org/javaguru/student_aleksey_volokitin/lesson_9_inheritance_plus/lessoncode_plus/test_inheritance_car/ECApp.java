package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance_plus.lessoncode_plus.test_inheritance_car;

public class ECApp {
    public static void main(String[] args) {

        //ElectricCar electricCar = new ElectricCar(200, 4, 1500, 200);
        Vehicle electricCar = new ElectricCar(250, 6, 2000, 405);

        System.out.println(electricCar.toString());
        electricCar.speedUp();
        electricCar.weightUp();
        electricCar.enginePowerUp(450);
        System.out.println(electricCar.toString());
    }
}
