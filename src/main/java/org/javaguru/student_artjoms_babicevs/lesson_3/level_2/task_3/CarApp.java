package org.javaguru.student_artjoms_babicevs.lesson_3.level_2.task_3;

class CarApp {

    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes", "green", 30000);
        Car audi = new Car("Audi", "orange", 50000);
        Car bmw = new Car("Bmw", "red", 300000);

        System.out.println("Manufacturer = " + mercedes.getManufacturer());
        System.out.println("Color = " + mercedes.getColor());
        System.out.println("Price = " + mercedes.getPrice());

        System.out.println("Manufacturer = " + audi.getManufacturer());
        System.out.println("Color = " + audi.getColor());
        System.out.println("Price = " + audi.getPrice());

        System.out.println("Manufacturer = " + bmw.getManufacturer());
        System.out.println("Color = " + bmw.getColor());
        System.out.println("Price = " + bmw.getPrice());
    }

}
