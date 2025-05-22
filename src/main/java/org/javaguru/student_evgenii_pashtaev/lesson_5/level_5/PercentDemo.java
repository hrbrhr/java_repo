package org.javaguru.student_evgenii_pashtaev.lesson_5.level_5;

public class PercentDemo {
    public static void main(String[] args) {

        Percent percent = new Percent(1000, 19, 5);
        System.out.printf("Future money = %.2f", percent.getPercent());
    }
}
