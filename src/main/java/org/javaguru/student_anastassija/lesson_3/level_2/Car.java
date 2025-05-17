package org.javaguru.student_anastassija.lesson_3.level_2;

public class Car {
    private String mark;
    private String colour;
    private int price;

    public Car (String mark, String colour, int price){
        this.mark = mark;
        this.colour = colour;
        this.price = price;
    }

    public String getMark(){
        return this.mark;
    }

    public String getColour(){
        return this.colour;
    }
    public int getPrice(){
        return this.price;
    }
    public void setMark(String mark){
        this.mark = mark;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public void setPrice(int price){
        this.price = price;
    }

}



