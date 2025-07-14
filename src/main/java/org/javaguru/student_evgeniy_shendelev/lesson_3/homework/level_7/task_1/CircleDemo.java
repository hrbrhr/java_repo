package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_7.task_1;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(8.3);
        System.out.println("Area for circle with radius " + circle.getRadius() + " is " + circle.calculateArea());
    }
}
