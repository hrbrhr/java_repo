package org.javaguru.student_artjoms_babicevs.lesson_3.level_7.task_1;

 public class Circle {
     private double radius;

     public Circle(double radius) {
         this.radius = radius;
     }

     public double calculateArea() {
         return Math.PI * radius * radius;
     }

     public double getRadius() {
         return radius;
     }

     public void setRadius(double radius) {

         this.radius = radius;

     }
 }