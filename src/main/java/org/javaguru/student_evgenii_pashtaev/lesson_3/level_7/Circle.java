package org.javaguru.student_evgenii_pashtaev.lesson_3.level_7;

class Circle {

    Circle(int radius){

        this.radius = radius;

    }
    int radius;

    double calculateArea(){
        double area;
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
