package org.javaguru.student_oleg_levashov.lesson_3.homework.level_2;

class CarApp {

    public static void main(String[] args) {

        Car car1 = new Car("Lada", "White", 10000);
        Car car2 = new Car("Toyota", "Green", 15000);
        Car car3 = new Car("BMW", "Black", 20000);

        System.out.println("First car: mark " + car1.getMark() + ", color " + car1.getColor() + ", price " + car1.getPrice());
        System.out.println("Second car: mark " + car2.getMark() + ", color " + car2.getColor() + ", price " + car2.getPrice());
        System.out.println("Third car: mark " + car3.getMark() + ", color " + car3.getColor() + ", price " + car3.getPrice());

        car1.setMark("AlfaRomeo");
        car2.setMark("Bugatti");
        car3.setMark("Ferrari");

        car1.setColor("Silver");
        car2.setColor("Burgundy");
        car3.setColor("Red");

        car1.setPrice(100000);
        car2.setPrice(150000);
        car3.setPrice(200000);

        System.out.println("First car: mark " + car1.getMark() + ", color " + car1.getColor() + ", price " + car1.getPrice());
        System.out.println("Second car: mark " + car2.getMark() + ", color " + car2.getColor() + ", price " + car2.getPrice());
        System.out.println("Third car: mark " + car3.getMark() + ", color " + car3.getColor() + ", price " + car3.getPrice());
    }
}
