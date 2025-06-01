package org.javaguru.student_pavel_gorev.lesson_3.level_2.task3;

class Car {
    private String brand;
    private String color;
    private double price;

    public Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }
}

