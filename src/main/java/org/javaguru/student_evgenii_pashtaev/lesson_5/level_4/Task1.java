package org.javaguru.student_evgenii_pashtaev.lesson_5.level_4;

class Task1 {

    double radius;

    Task1 (double radius){

        this.radius = radius;
    }

     double getPerimeter(){

        return this.radius * 2 * Math.PI;
     }
     double getArea(){

        return Math.pow(this.radius, 2) * Math.PI;
     }


}
