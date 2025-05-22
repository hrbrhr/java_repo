package org.javaguru.student_evgenii_pashtaev.lesson_3.level_2;

class Car {

    String brand;
    String color;
    int price;

    public Car(String brand, String color, int price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public String getBrand (){
        return this.brand;
    }
    public String getColor(){
        return this.color;
    }
    public int getPrice(){
        return this.price;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
