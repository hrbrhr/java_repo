package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.lessoncode_plus.task_7_plus;

class Apple {
    private String sort;
    private String color;
    private double weight;

    Apple(String sort,
          String color,
          double weight) {
        this.sort = sort;
        this.color = color;
        this.weight = weight;
    }

    String getSort()   {return sort;}
    String getColor()  {return color;}
    double getWeight() {return weight;}

    void setSort(String newSort)     {this.sort = newSort;}
    void setColor(String newColor)   {this.color = newColor;}
    void setWeight(double newWeight) {this.weight = newWeight;}
}
