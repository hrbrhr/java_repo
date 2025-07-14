package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_4.task_6;

 class Triangle extends Shape {

     private double sideALength;
     private double sideBLength;
     private double sideCLength;
     private double heightForSideA;

     public Triangle(String title, double sideALength, double sideBLength, double sideCLength, double heightForSideA) {
         super(title);
         this.sideALength = sideALength;
         this.sideBLength = sideBLength;
         this.sideCLength = sideCLength;
         this.heightForSideA = heightForSideA;
     }

     @Override
     double calculateArea() {
         return 0.5 * sideALength * heightForSideA;
     }

     @Override
     double calculatePerimetr() {
         return sideALength + sideBLength + sideCLength;
     }
 }
