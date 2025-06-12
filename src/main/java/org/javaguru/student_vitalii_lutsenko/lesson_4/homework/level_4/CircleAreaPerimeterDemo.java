package org.javaguru.student_vitalii_lutsenko.lesson_4.homework.level_4;

 class CircleAreaPerimeterDemo {

     public static void main(String[] args) {

         CircleAreaPerimeter circleAreaPerimeter = new CircleAreaPerimeter();
         System.out.println("AreaCircle r=2 - " + circleAreaPerimeter.areaCircle(2));
         System.out.println("AreaCircle r=3 - " + circleAreaPerimeter.areaCircle(3));
         System.out.println("AreaCircle r=4 - " + circleAreaPerimeter.areaCircle(4));

         System.out.println("PerimeterCircle r=2 - " + circleAreaPerimeter.perimeterCircle(2));
         System.out.println("PerimeterCircle r=3 - " + circleAreaPerimeter.perimeterCircle(3));
         System.out.println("PerimeterCircle r=4 - " + circleAreaPerimeter.perimeterCircle(4));

     }
 }





