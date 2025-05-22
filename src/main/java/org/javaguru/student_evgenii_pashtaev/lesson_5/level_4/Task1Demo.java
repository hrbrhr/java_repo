package org.javaguru.student_evgenii_pashtaev.lesson_5.level_4;

public class Task1Demo {
    public static void main(String[] args) {

        Task1 circle = new Task1(100);
        System.out.printf("P = %.2f\n", circle.getPerimeter());
        System.out.printf("S = %.2f\n", circle.getArea());

    }
}
