package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_2_intern;

class CarApp {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "blue", 100000);
        Car car2 = new Car("Volga", "black", 2000);
        Car car3 = new Car("Honda", "white", 50000);

        String brand1 = car1.getBrand();
        String brand2 = car2.getBrand();
        String brand3 = car3.getBrand();
        String color1 = car1.getColor();
        String color2 = car2.getColor();
        String color3 = car3.getColor();
        double price1 = car1.getPrice();
        double price2 = car2.getPrice();
        double price3 = car3.getPrice();

        System.out.println("Производитель 1 машины " + brand1);
        System.out.println("Производитель 2 машины " + brand2);
        System.out.println("Производитель 3 машины " + brand3);
        System.out.println("Цвет 1 машины " + color1);
        System.out.println("Цвет 2 машины " + color2);
        System.out.println("Цвет 3 машины " + color3);
        System.out.println("Цена 1 машины " + price1);
        System.out.println("Цена 2 машины " + price2);
        System.out.println("Цена 3 машины " + price3);

        car3.setBrand("Hyndai");
        car1.setColor("Silver");
        car2.setPrice(35000);

        System.out.println("Производитель 3 машины " + car3.getBrand());
        System.out.println("Цвет 1 машины " + car1.getColor());
        System.out.println("Цена 2 машины " + car2.getPrice());


    }
}