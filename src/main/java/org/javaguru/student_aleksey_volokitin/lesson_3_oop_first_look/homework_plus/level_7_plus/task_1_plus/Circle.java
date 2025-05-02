package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.homework_plus.level_7_plus.task_1_plus;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
