package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_2_intern.task_4;

class Car {

    private String brand;
    private String color;
    private int cost;

    public Car(String brand, String color, int cost) {
        this.brand = brand;
        this.color = color;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
