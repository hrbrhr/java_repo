package org.javaguru.student_grigoriy_emiliyanov.lesson_7_array_for.lessoncode;

class GradesCalculatorDemo {
    public static void main(String[] args) {
        GradesCalculator gradesCalculator = new GradesCalculator();
        int[] grades = {5, 3, 8, 9, 2, 10};
        System.out.println(gradesCalculator.findMax(grades));
        System.out.println(gradesCalculator.findMin(grades));
        System.out.println(gradesCalculator.findAverage(grades));
    }
}
