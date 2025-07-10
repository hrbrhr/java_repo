package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_2;

public class Car {
    private String label;
    private String color;
    private int price;

    public Car(String label, String color, int price) {
        this.label = label;
        this.color = color;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
