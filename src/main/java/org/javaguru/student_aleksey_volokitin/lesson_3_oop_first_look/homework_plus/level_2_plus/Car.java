package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.homework_plus.level_2_plus;

class Car {
    String brandModel;
    String color;
    int price;

    Car(String brandModel, String color, int price) {
        this.brandModel = brandModel;
        this.color = color;
        this.price = price;
    }

    String getBrandModel() {return brandModel;}
    String getColor()      {return color;}
    int getPrice()         {return price;}

    void setBrandModel(String newBrandModel) {this.brandModel = newBrandModel;}
    void setColor(String newColor)           {this.color = newColor;}
    void setPrice(int newPrice)              {this.price = newPrice;}
}
