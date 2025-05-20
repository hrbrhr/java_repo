package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_2_intern;

class Car {
    private String brand;
    private String color;
    private double price;

    Car(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand () {return brand;}
    public String getColor () {return color;}
    public double getPrice () {return price;}



    public void setBrand (String brand) {
        this.brand = brand;    }
    public void setColor (String color) {
        this.color = color;    }
    public void setPrice (double price) {
        this.price = price;    }

}
