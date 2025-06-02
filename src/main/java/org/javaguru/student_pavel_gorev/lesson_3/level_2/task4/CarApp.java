package org.javaguru.student_pavel_gorev.lesson_3.level_2.task4;

class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "white", 25000.0);
        Car car2 = new Car("BMW", "black", 45000.0);
        Car car3 = new Car("Kia", "red", 18000.0);

        // Меняем свойства машин
        car1.setBrand("Honda");
        car1.setColor("blue");
        car1.setPrice(23000.0);

        car2.setBrand("Audi");
        car2.setColor("grey");
        car2.setPrice(47000.0);

        car3.setBrand("Mazda");
        car3.setColor("green");
        car3.setPrice(20000.0);

        System.out.println("Машина 1: " + car1.getBrand() + ", " + car1.getColor() + ", $" + car1.getPrice());
        System.out.println("Машина 2: " + car2.getBrand() + ", " + car2.getColor() + ", $" + car2.getPrice());
        System.out.println("Машина 3: " + car3.getBrand() + ", " + car3.getColor() + ", $" + car3.getPrice());
    }
}

