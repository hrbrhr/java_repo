package org.javaguru.student_vitalii_lutsenko.lesson_3.homework.level_2.task_3;

class CatalogCars {

    private String brand;
    private String color;
    private int price;

     CatalogCars(String brand, String color, int price) {

        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    String getBrand() {
        return this.brand;
    }
    String getColor() {
        return this.color;
    }
    int getPrice(){
        return this.price;
    }
    public void setBrand (String brand){
         this.brand = brand;
    }
    public void setColor(String color) {
         this.color = color;
     }

    public void setPrice(int price) {
        this.price = price;
    }
}
