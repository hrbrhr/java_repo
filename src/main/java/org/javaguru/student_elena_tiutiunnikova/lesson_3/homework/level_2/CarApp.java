package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_2;

public class CarApp {

    public static void main(String[] args) {

        Car Car1 = new Car("BMW", "blue", 100000);
        Car Car2 = new Car("Volga", "black", 2000);
        Car Car3 = new Car("Honda", "white", 50000);


        String brand1 = Car1.getBrand();
        String brand2 = Car2.getBrand();
        String brand3 = Car3.getBrand();
        String color1 = Car1.getColor();
        String color2 = Car2.getColor();
        String color3 = Car3.getColor();
        double price1 = Car1.getPrice();
        double price2 = Car2.getPrice();
        double price3 = Car3.getPrice();

        System.out.println("Производитель 1 машины " + brand1);
        System.out.println("Производитель 2 машины " + brand2);
        System.out.println("Производитель 3 машины " + brand3);
        System.out.println("Цвет 1 машины " + color1);
        System.out.println("Цвет 2 машины " + color2);
        System.out.println("Цвет 3 машины " + color3);
        System.out.println("Цена 1 машины " + price1);
        System.out.println("Цена 2 машины " + price2);
        System.out.println("Цена 3 машины " + price3);

    }
}