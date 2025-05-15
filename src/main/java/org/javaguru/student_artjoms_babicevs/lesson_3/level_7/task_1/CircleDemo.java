package org.javaguru.student_artjoms_babicevs.lesson_3.level_7.task_1;

 public class CircleDemo {
 public static void main(String[] args) {

    Circle circle = new Circle(5.0);

    System.out.println("Circle whit radius: " + circle.getRadius());
    System.out.println("Square radius: " + circle.calculateArea());

    circle.setRadius(7.5);
    System.out.println("New circle radius: "+ circle.getRadius());
    System.out.println("new square circle: "+ circle.calculateArea());
}



}
