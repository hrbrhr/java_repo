package org.javaguru.student_oleg_levashov.lesson_3.homework.level_2;

class Car {

    private String mark;
    private String color;
    private int price;

    public Car (String mark, String color, int price) {
        this.mark = mark;
        this.color = color;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }
    public String getColor() {
        return color;
    }
    public int getPrice() {
        return price;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
