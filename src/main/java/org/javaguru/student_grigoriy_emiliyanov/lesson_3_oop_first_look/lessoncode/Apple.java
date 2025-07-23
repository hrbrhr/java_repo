package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

public class Apple {
    private String type;
    private String color;
    private int weight;

    public Apple(String type, String color, int weight) {
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
