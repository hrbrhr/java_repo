package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_2_intern.task_3;

class CarApp {

    public static void main(String[] args) {
        Car car1 = new Car("Audi", "Black", 5_000_000);
        Car car2 = new Car("BMW", "Gray", 7_000_000);
        Car car3 = new Car("Jaguar", "Blue", 10_000_000);

        System.out.println("Brand: " + car1.getBrand() + "; Color: " + car1.getColor() + "; Cost: " + car1.getCost());
        System.out.println("Brand: " + car2.getBrand() + "; Color: " + car2.getColor() + "; Cost: " + car2.getCost());
        System.out.println("Brand: " + car3.getBrand() + "; Color: " + car3.getColor() + "; Cost: " + car3.getCost());
    }
}
