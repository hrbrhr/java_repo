package org.javaguru.student_vasilii_khvan.lesson_3.level_2;

public class Car {

    private String brand;
    private String color;
    private int price;

    Car(String brand, String color, int price) {
       this.brand = brand;
       this.color = color;
       this.price = price;
    }

    String getBrand() {
        return brand;
    }

    String getColor() {
        return color;
    }

    int getPrice() {
        return price;
    }
}