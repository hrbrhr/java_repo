package org.javaguru.student_evgenii_pashtaev.lesson_3.level_2;

class CarApp {

    public static void main(String[] args) {

        Car carOne = new Car("Mercedes", "black", 2000);
        Car carTwo = new Car("Lada", "red", 300);
        Car carThree = new Car("Bmw", "white", 1500);

        System.out.println(carOne.getBrand() + '\n' + carOne.getColor() + '\n' + carOne.getPrice() + '\n');
        System.out.println(carTwo.getBrand() + '\n' + carTwo.getColor() + '\n' + carTwo.getPrice() + '\n');
        System.out.println(carThree.getBrand() + '\n' + carThree.getColor() + '\n' + carThree.getPrice() + '\n');

        carOne.setBrand("Opel");
        carOne.setColor("blue");
        carOne.setPrice(4000);
        System.out.println(carOne.getBrand() + '\n' + carOne.getColor() + '\n' + carOne.getPrice() + '\n');

        carTwo.setBrand("Mazda");
        carTwo.setColor("brown");
        carTwo.setPrice(200);
        System.out.println(carTwo.getBrand() + '\n' + carTwo.getColor() + '\n' + carTwo.getPrice() + '\n');

        carThree.setBrand("Audi");
        carThree.setColor("green");
        carThree.setPrice(5000);
        System.out.println(carThree.getBrand() + '\n' + carThree.getColor() + '\n' + carThree.getPrice() + '\n');

    }
}
