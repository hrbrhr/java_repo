package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

public class Laptop {
    private String model;
    private int price;

    public Laptop(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
