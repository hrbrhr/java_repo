package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_4.task_6;

class Rectangle extends Shape {

     private double sideALength;
     private double sideBLength;

     public Rectangle(String title, double sideALength, double sideBLength) {
         super(title);
         this.sideALength = sideALength;
         this.sideBLength = sideBLength;
     }

     @Override
     double calculateArea() {
         return sideALength * sideBLength;
     }

     @Override
     double calculatePerimetr() {
         return (sideALength + sideBLength) * 2;
     }
 }
