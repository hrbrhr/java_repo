package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.lessoncode.task_8_plus;

class Notebook {
    private String model;
    private int price;

    Notebook(String model, int price) {
        this.model = model;
        this.price = price;
    }

    String getModel() {return model;}
    int getPrice()    {return price;}

    void setModel(String newModel) {this.model = newModel;}
    void setPrice(int price)       {this.price = price;}
}
