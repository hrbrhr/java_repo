package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_2_intern.task_3;

class CarApp {

    public static void main(String[] args) {
        Car car = new Car("Audi", "black", 10_000_000);

        System.out.println(car.getBrand());
        System.out.println(car.getColor());
        System.out.println(car.getCost());
    }
}
